package co.id.kochengbot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handles the Supabase (PostgreSQL) connection and loads
 * bot commands into memory at startup.
 *
 * --- Supabase setup ---
 * 1. Go to your Supabase project → Settings → Database
 * 2. Copy the "Connection string" (URI format), it looks like:
 *    postgresql://postgres:[YOUR-PASSWORD]@db.xxxx.supabase.co:5432/postgres
 * 3. Paste it as DB_URL below (or better: use an environment variable)
 *
 * --- Table setup (run this SQL in Supabase SQL Editor) ---
 *
 *   CREATE TABLE commands (
 *       id        SERIAL PRIMARY KEY,
 *       alias     TEXT NOT NULL UNIQUE,
 *       image_url TEXT NOT NULL,
 *       extra_urls TEXT  -- comma-separated, nullable; used for multi-image commands
 *   );
 *
 *   -- Example rows:
 *   INSERT INTO commands (alias, image_url) VALUES ('ok', 'https://i.pinimg.com/...');
 *   INSERT INTO commands (alias, image_url, extra_urls) VALUES
 *       ('bacot', 'https://.../bacot.jpg', 'https://.../bacot_2.jpg');
 *
 * --- Required dependency (add to your build) ---
 *   Maven:
 *     <dependency>
 *       <groupId>org.postgresql</groupId>
 *       <artifactId>postgresql</artifactId>
 *       <version>42.7.3</version>
 *     </dependency>
 *
 *   Or download the JAR manually:
 *     https://jdbc.postgresql.org/download/
 */
public class SupabaseConnection {

    // -------------------------------------------------------------------------
    // Configuration — replace these values with your own Supabase credentials.
    // For better security, load from environment variables instead of hardcoding:
    //   String url = System.getenv("SUPABASE_DB_URL");
    // -------------------------------------------------------------------------
    private static final String DB_URL      = "jdbc:postgresql://db.YOURPROJECT.supabase.co:5432/postgres";
    private static final String DB_USER     = "postgres";
    private static final String DB_PASSWORD = "YOUR_PASSWORD_HERE";

    // -------------------------------------------------------------------------
    // Singleton connection
    // -------------------------------------------------------------------------
    private static Connection connection;

    /**
     * Opens (or returns the existing) database connection.
     */
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("[Supabase] Connected to database.");
        }
        return connection;
    }

    /**
     * Closes the connection gracefully. Call this when the bot shuts down.
     */
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("[Supabase] Connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // -------------------------------------------------------------------------
    // Command loaders — called once on bot startup (in onReady)
    // -------------------------------------------------------------------------

    /**
     * Loads all single-image commands from the database.
     * Returns a map of: alias -> image URL
     */
    public static Map<String, String> loadImageCommands() {
        Map<String, String> map = new HashMap<>();
        String sql = "SELECT alias, image_url FROM commands WHERE extra_urls IS NULL OR extra_urls = ''";

        try (PreparedStatement stmt = getConnection().prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                map.put(rs.getString("alias"), rs.getString("image_url"));
            }
            System.out.println("[Supabase] Loaded " + map.size() + " single-image commands.");

        } catch (SQLException e) {
            System.err.println("[Supabase] Failed to load single-image commands.");
            e.printStackTrace();
        }
        return map;
    }

    /**
     * Loads all multi-image commands from the database.
     * Returns a map of: alias -> list of image URLs
     * The first image is image_url; additional ones are stored comma-separated in extra_urls.
     */
    public static Map<String, List<String>> loadMultiImageCommands() {
        Map<String, List<String>> map = new HashMap<>();
        String sql = "SELECT alias, image_url, extra_urls FROM commands WHERE extra_urls IS NOT NULL AND extra_urls <> ''";

        try (PreparedStatement stmt = getConnection().prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                List<String> urls = new ArrayList<>();
                urls.add(rs.getString("image_url"));

                String extras = rs.getString("extra_urls");
                if (extras != null && !extras.isBlank()) {
                    for (String extra : extras.split(",")) {
                        urls.add(extra.trim());
                    }
                }
                map.put(rs.getString("alias"), urls);
            }
            System.out.println("[Supabase] Loaded " + map.size() + " multi-image commands.");

        } catch (SQLException e) {
            System.err.println("[Supabase] Failed to load multi-image commands.");
            e.printStackTrace();
        }
        return map;
    }
}
