package co.id.kochengbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandList extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		//response list
		if(args[0].equalsIgnoreCase(KochengController.prefix + "list")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Command List Kocheng");
			embed.setDescription(
					"astaga / astava / asfava\n"+
					"ampas\n"+
					"bacot / nacot / bavot / baxot / vagot / bagot\n"+
					"baiwan / bewan / byone\n"+
					"balon / balonku\n"+
					"biadam\n"+
					"bismillah\n"+
					"bokong\n"+
					"bosan\n"+
					"capek\n"+
					"cayman / cemen\n"+
					"cengeng\n"+
					"citacita\n"+
					"coli\n"+
					"crot\n"+
					"cupu / cupi / payah\n"+
					"curang\n"+
					"curhat\n"+
					"dokter\n"+
					"des\n"+
					"diem / diam\n"+
					"dildo\n"+
					"elit\n"+
					"emek\n"+
					"fendet / gender\n"+
					"fubuki / fukuki / manual\n"+
					"gaguna"+
					"gakreatif\n"+
					"gatal / gatel\n"+
					"geh\n"+
					"gesek\n"+
					"goblog / goblok / hiu\n"+
					"hak\n"+
					"hamil\n"+
					"hantu\n"+
					"homo\n"+
					"homuking\n"+
					"ingat / tobat\n"+
					"jembut / jembud\n"+
					"jodoh\n"+
					"kasar / laskar\n"+
					"kawaii / kawai\n"+
					"kecoa\n"+
					"kekar\n"+
					"keqing\n"+
					"ketua\n"+
					"kocheng\n"+
					"kontol\n"+
					"konjol\n"+
					"kubus / kunus\n"+
					"kuota\n"+
					"laksek\n"+
					"lah / ngatur\n"+
					"latom / doa / amin\n"+
					"lawak\n"+
					"lonte / kobte\n"+
					"malam / malem\n"+
					"mati\n"+
					"mei / mei kita / mei gue\n"+
					"memek\n"+
					"meo / memeo\n"+
					"minta / minta duit / bagi duit\n"+
					"monthly / monly\n"+
					"mulai\n"+
					"nangis\n"+
					"nabung\n"+
					"nasgor\n"+
					"ngangkang\n"+
					"ngeyel\n"+
					"ngontol\n"+
					"ntr\n"+
					"off / ngambek\n"+
					"ok\n"+
					"out / pelatih / pelatuh\n"+
					"paansi / apasih / apasih / paansih / apaansih / apasi\n"+
					"pagi\n"+
					"pici / pc\n"+
					"pukul / berani\n"+
					"qiqi\n"+
					"rapsodi\n"+
					"rehab / rehabilitas / rebihalitas\n"+
					"ribut / ribiw\n"+
					"sange / sangean\n"+
					"sarapan\n"+
					"sarjana / ekonomi\n"+
					"saus / sauce / pasal\n"+
					"segar\n"+
					"selaw\n"+
					"seno\n"+
					"smash / semes / smesh\n"+
					"sodok\n"+
					"taat / aturan\n"+
					"takut\n"+
					"tani / thamngan\n"+
					"telanjang / bugil\n"+
					"telat\n"+
					"terhura / terharu\n"+
					"test\n"+
					"tomay / tomat\n"+
					"toxic / toksik\n"+
					"tumdur / tidur / bobo\n"+
					"ty / thx / thanks\n"+
					"welcome\n"+
					"woi\n"+
					"woo / pantek\n"+
					"yan jajan / yan / jajan\n"+
					"yes\n"
					);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		
		//info kocheng response
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kocheng")) {
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("KochengBot");
			info.setDescription("Hai saya kocheng\nKONTOOOOLL");
			info.setFooter("Created by pol ft. warga 45");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
		}
		
		//main response
		if(args[0].equalsIgnoreCase(KochengController.prefix + "test")) {
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("tas tes tas tes kontol").queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.pinimg.com/originals/54/a4/00/54a4008daad4565a9b5db1b94e59c74c.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "meo")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "memeo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/XJdmMjh.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gakreatif")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/FrIUGyf.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sodok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/ZWi3mNn.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "telanjang")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bugil")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/mf84I8Z.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sarapan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/xKxEJOd.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "rehab") || args[0].equalsIgnoreCase(KochengController.prefix + "rehabilitas")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "rebihalitas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/aOcfV26.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yan jajan")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "yan")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "jajan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/cjfl6hi.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "woo")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pantek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Mi6ivHf.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "minta duit")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bagi duit")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "minta")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Al3U0TX.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bacot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bavot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "nacot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "baxot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "vagot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bagot")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/wYIWXly.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/NkAuRPz.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ty")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thx")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thanks")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/0xqwFvT.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "apasih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "paansi")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "apasih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "paansih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "apaansih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "apasi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/PRECnxp.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mei")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "mei kita")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "mei gue")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/ieyrYKa.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jembut")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "jembud")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/bux9VXB.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cupu")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "cupi")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "payah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/PSMITSa.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lonte")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "kobte")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Ha6P7Qi.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lawak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/LMjkItp.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		
		
		if(args[0].equalsIgnoreCase(KochengController.prefix + "elit")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/PTBn5Ay.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mati")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/QaInxHx.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ribut")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ribiw")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/cunu6Hr.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/ndoGAaC.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kontol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/GbqSIL0.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bismillah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/b5z1rqW.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "homuking")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/UvCtWwp.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/J6JuOkw.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngeyel")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/OBbKltI.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tani")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thamngan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/a8lVMOj.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bewan")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "byone")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "baiwan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/CUxZr1o.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sange")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "sangean")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Vum1yyp.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "rapsodi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/iwxK3ah.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "seno")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/X3ByBLJ.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tumdur")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tidur")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bobo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/xZVDMGE.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gesek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/asvEKmh.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "out")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pelatih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pelatuh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/CGZCIj9.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "welcome")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/pSrWUjD.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/9Qvo2Ho.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ingat")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tobat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/DyG3l2e.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "memek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/tuowpQR.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "citacita")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/E4pRuCj.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bosan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/n0xYxlo.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngangkang")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/t3urgoe.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "balon")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "balonku")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Rz7zMVv.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nangis")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/sV5PsuT.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "curang")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/HJzkMpn.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ntr")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/S3YBKi4.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kawaii")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "kawai")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/wWZbPN5.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "smash")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "semes")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "smesh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/pBzrBEn.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "diam")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "diem")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/drZn5yD.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cemen")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "cayman")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/YG6LLcC.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "des")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/IVNnHfG.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gatal")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "gatel")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/nbzU6SH.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "coli")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/TObAH5D.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "woi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/AyKlsWw.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "malam")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "malem")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/SaTRIn1.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "astaga")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "astava")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "astafa")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "asfava")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "asfaba")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "asfaga")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "asyaba")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/K780PzO.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cengeng")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/yHAsUbG.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pukul")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "berani")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/MQopSkq.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/U0h925E.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sauce")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "saus")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pasal")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/qvb7dDI.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "laskar")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "kasar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Cg3O3ur.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pici")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pc")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/g4iAdJd.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bokong")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/20rFbQA.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "homo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Tkzxwsg.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "latom")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "doa")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "amin")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/VGOZg7m.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "fubuki")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "fukuki")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "manual")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/RYaGIq4.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jodoh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/ZQH4VqE.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sarjana")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ekonomi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/ysXA7Kt.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "goblok")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "goblog")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "hiu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/kmmoFmC.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tomay")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tomat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/L7VBJ8o.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nabung")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/93vMbPt.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "taat")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "aturan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/XQzl6xr.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pagi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/stlnppa.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "toxic")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "toksik")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/zQeVSLN.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yes")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/7v81o2C.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kuota")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/LUCMJjI.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hamil")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/rwStWn1.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kubus")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "kunus")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/PA9sGAi.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "biadam")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/TrJzcPj.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ampas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/rJaz4N2.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "emek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/vJnY6LS.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hantu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/dk6b6ak.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "terhura")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "terharu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/cSdTyIX.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "keqing")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/oWIximk.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/nWXDuOo.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "qiqi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/oRjyTck.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/dPuVDJY.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "fendet")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "gender")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/BGogDHX.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "capek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/oYtmhXI.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "takut")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/oqasY19.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/w25l9bX.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kecoa")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/R1Ckzhp.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "crot")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/MGr6NwS.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mulai")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/7qCr48S.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lah")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ngatur")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/qwSuqo8.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "monthly")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "monly")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Lsc5npu.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "dokter")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/f10pqB9.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "konjol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/AGKYzvn.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "laksek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/RkwVqZN.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "off")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ngambek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/jccJxZH.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ketua")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/CGBZ7Cd.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "segar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/bVAAE6z.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/omKfthb.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "curhat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/RvNV9iw.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nasgor")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/8H2mvQt.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gaguna")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/1Ymuesg.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngontol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/tskBuZZ.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "selaw")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/lHpz4Nw.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kekar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/YbxKWD5.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "geh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/GNE5YLZ.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "dildo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/rYYtJte.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "telat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/BHNfKRD.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		
		//not listed yet
	}
}
