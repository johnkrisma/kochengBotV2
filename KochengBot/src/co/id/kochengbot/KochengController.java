package co.id.kochengbot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class KochengController {

	public static JDA jda;
	public static String prefix = ".";
	
	//Main
	public static void main(String[] args) throws LoginException {
		JDA jda = JDABuilder.createDefault("").build();
		jda.getPresence().setStatus(OnlineStatus.ONLINE);
		jda.getPresence().setActivity(Activity.listening(prefix + "list | Now 24/7 Online"));
		jda.addEventListener(new CommandList());
	}
}
