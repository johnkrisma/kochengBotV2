# Wiring SupabaseConnection into your bot

## 1. KochengController.java — shut down DB cleanly

Add a shutdown hook so the connection closes when the bot stops:

```java
public static void main(String[] args) throws LoginException {
    JDA jda = JDABuilder.createDefault("YOUR_TOKEN").build();
    jda.getPresence().setStatus(OnlineStatus.ONLINE);
    jda.getPresence().setActivity(Activity.listening(prefix + "list | Now 24/7 Online"));
    jda.addEventListener(new CommandList());

    // Close DB connection when bot shuts down
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        SupabaseConnection.closeConnection();
    }));
}
```

---

## 2. CommandList.java — load from DB instead of hardcoded maps

Remove the `static { IMAGE_COMMANDS.put(...) }` block entirely.
Replace the two map declarations with this:

```java
private static final Map<String, String>       IMAGE_COMMANDS;
private static final Map<String, List<String>> MULTI_IMAGE_COMMANDS;

static {
    IMAGE_COMMANDS       = SupabaseConnection.loadImageCommands();
    MULTI_IMAGE_COMMANDS = SupabaseConnection.loadMultiImageCommands();
}
```

That's it. The rest of onGuildMessageReceived stays exactly the same.

---

## 3. Supabase SQL to create the table

Run this in your Supabase project → SQL Editor:

```sql
CREATE TABLE commands (
    id         SERIAL PRIMARY KEY,
    alias      TEXT NOT NULL UNIQUE,
    image_url  TEXT NOT NULL,
    extra_urls TEXT   -- nullable; comma-separated extra images for multi-image commands
);
```

To add a command:
```sql
-- Single image
INSERT INTO commands (alias, image_url) VALUES ('ok', 'https://your-image-url.jpg');

-- Multi image
INSERT INTO commands (alias, image_url, extra_urls)
VALUES ('bacot', 'https://first.jpg', 'https://second.jpg,https://third.jpg');
```

---

## 4. Add the PostgreSQL JDBC driver JAR

Download from: https://jdbc.postgresql.org/download/
Then add it to your build path the same way you added JDA.

If using Maven, add to pom.xml:
```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.3</version>
</dependency>
```
