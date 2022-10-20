package main.java;

import javax.security.auth.login.LoginException;

import co.id.kochengbot.CommandList;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {

	public static JDA jda;
	public static String prefix = ".";
	
	//Main
	public static void main(String[] args) throws LoginException {
		String token = System.getenv("TOKEN");
		
		JDA jda = JDABuilder.createDefault(token).build();
		jda.getPresence().setStatus(OnlineStatus.ONLINE);
		jda.getPresence().setActivity(Activity.listening(prefix + "list"));
		jda.addEventListener(new CommandList());
	}
}
