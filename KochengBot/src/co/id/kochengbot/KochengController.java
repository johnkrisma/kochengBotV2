package co.id.kochengbot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class KochengController {

	public static JDA jda;
	public static String prefix = ".";
	
	//Main
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws LoginException {
		jda = new JDABuilder(AccountType.BOT).setToken("").build();
		jda.getPresence().setStatus(OnlineStatus.IDLE);
		jda.getPresence().setActivity(Activity.playing("with kocheng gendud .list"));
		jda.addEventListener(new CommandList());
		
//		JDABuilder builder = new JDABuilder(AccountType.BOT);
//        String token = "NjkxNDYwNjA3MDg1Mzc5NjE1.XniWWw.qSqhvDWxmWd6N235B3ZssUzkznE";
//        builder.setToken(token);
//        builder.setStatus(OnlineStatus.DO_NOT_DISTURB);
//        builder.build();
	}
}
