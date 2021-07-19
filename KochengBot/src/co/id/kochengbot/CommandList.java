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
					"achievement / achivmen / acivmen / acimen\n"+
					"astaga / astava / asfava\n"+
					"ampas\n"+
					"atitut\n"+
					"ayaka\n"+
					"babi\n"+
					"bacot / nacot / bavot / baxot / vagot / bagot\n"+
					"badut\n"+
					"baiwan / bewan / byone\n"+
					"balon / balonku\n"+
					"barbara / barabata / bandara\n"+
					"berak / beraq\n"+
					"biadam\n"+
					"bismillah\n"+
					"bokong\n"+
					"bomat / gapeduli\n"+
					"bosan\n"+
					"canda\n"+
					"capek\n"+
					"cayman / cemen\n"+
					"cengeng\n"+
					"chongyun / chong\n"+
					"citacita\n"+
					"coklat / keju\n"+
					"coli\n"+
					"crot\n"+
					"cupu / cupi / payah\n"+
					"curang\n"+
					"curhat\n"+
					"damai\n"+
					"dokter\n"+
					"dompet\n"+
					"des\n"+
					"diem / diam\n"+
					"dildo\n"+
					"elit\n"+
					"emek\n"+
					"faisal\n"+
					"fendet / gender\n"+
					"fubuki / fukuki / manual\n"+
					"gaguna"+
					"gakreatif\n"+
					"gangbang\n"+
					"gatal / gatel\n"+
					"gay\n"+
					"geh\n"+
					"gei\n"+
					"gem\n"+
					"genshin\n"+
					"gesek\n"+
					"goblog / goblok \n"+
					"hadeh\n"+
					"hak\n"+
					"hamil\n"+
					"hantu\n"+
					"harem\n"+
					"hdmi\n"+
					"hode\n"+
					"homa / atlas\n"+
					"homo\n"+
					"homuking\n"+
					"horny / hirji\n"+
					"hujat\n"+
					"ijo\n"+
					"ingat / tobat\n"+
					"isep\n"+
					"janji\n"+
					"jaog / jago / ampun / seram/ sram / sramz\n"+
					"jembut / jembud\n"+
					"jijik\n"+
					"jiwan\n"+
					"jodoh\n"+
					"jumatan\n"+
					"kalah\n"+
					"kasar / laskar\n"+
					"kawaii / kawai\n"+
					"kecoa\n"+
					"kekar\n"+
					"keqing\n"+
					"ketua\n"+
					"klee\n"+
					"kocheng\n"+
					"konglol\n"+
					"konjol\n"+
					"kontol\n"+
					"kubus / kunus\n"+
					"kuota\n"+
					"laksek\n"+
					"laku\n"+
					"lah / ngatur\n"+
					"latom / doa / amin\n"+
					"lawak\n"+
					"leyline\n"+
					"lonte / kobte\n"+
					"lupa\n"+
					"mabar\n"+
					"malam / malem\n"+
					"mati\n"+
					"mei / mei kita / mei gue\n"+
					"melas\n"+
					"memek\n"+
					"mengheningkan\n"+
					"mention\n"+
					"meo / memeo\n"+
					"minta / bagi\n"+
					"miskin\n"+
					"monthly / monly\n"+
					"mulai\n"+
					"nangis\n"+
					"nabung\n"+
					"nasgor\n"+
					"ngangkang\n"+
					"ngantuk\n"+
					"ngeri\n"+
					"ngeyel\n"+
					"ngontol\n"+
					"npc\n"+
					"ntr\n"+
					"nyambung\n"+
					"nyimak\n"+
					"ocincin\n"+
					"off / ngambek\n"+
					"ok\n"+
					"om\n"+
					"onat\n"+
					"out / pelatih / pelatuh\n"+
					"paansi / apasih / apasih / paansih / apaansih / apasi\n"+
					"pagi\n"+
					"pece\n"+
					"pekok\n"+
					"percaya\n"+
					"pervert / perv"+
					"pici / pc\n"+
					"pride\n"+
					"ps5\n"+
					"psikopat / psokopay"+
					"pukul / berani\n"+
					"qiqi\n"+
					"rapsodi\n"+
					"rehab / rehabilitas / rebihalitas\n"+
					"retry / tetty\n"+
					"ribut / ribiw\n"+
					"sahabat\n"+
					"salto\n"+
					"sange / sangean\n"+
					"saoi\n"+
					"sarapan\n"+
					"sarjana / ekonomi\n"+
					"saus / sauce / pasal\n"+
					"segar\n"+
					"selaw\n"+
					"seno\n"+
					"sesat\n"+
					"smash / semes / smesh\n"+
					"sodok\n"+
					"ss\n"+
					"summon / cium\n"+
					"sunat\n"+
					"taat / aturan\n"+
					"takut\n"+
					"tani / thamngan\n"+
					"tau\n"+
					"telanjang / bugil\n"+
					"telat\n"+
					"terhura / terharu\n"+
					"test\n"+
					"tetawat\n"+
					"tomay / tomat\n"+
					"toxic / toksik\n"+
					"track / ip\n"+
					"tt / tete\n"+
					"tumdur / tidur / bobo\n"+
					"tusuk\n"+
					"ty / thx / thanks\n"+
					"typo / tipo\n"+
					"update\n"+
					"wawasan\n"+
					"welcome\n"+
					"woi\n"+
					"woo / pantek\n"+
					"xingqiu / xing\n"+
					"yan / jajan\n"+
					"yanfei\n"+
					"yes\n"+
					"yuri\n"
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
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957343016157194/ga_kreatif.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sodok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957477553438760/sogok.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "telanjang")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bugil")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957484989415454/telanjang.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sarapan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957467121549362/sarapan.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "rehab")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "rehabilitas")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "rebihalitas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957436440215592/rehab.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yan")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "jajan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957356258361344/jajan.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "woo")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pantek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957508808867840/woo.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bagi")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "minta")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957408447037440/minta_duid.jpg");
			
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
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957291908562944/bacot.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957290881482782/bacot_2.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ty")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thx")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thanks")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957499119763456/ty.jpg");
			
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
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957426470486046/paansi.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mei")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "mei kita")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "mei gue")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957397399240704/mei.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jembut")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "jembud")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957358245806130/jembut.jpg");
			
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
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957378794225674/kobte.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lawak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957289261694986/11741727946472.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "elit")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957340755951636/elit.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mati")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957392114548736/mati.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ribut")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ribiw")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957282819375124/11702893809638.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957285911494666/11702893817986.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kontol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957373341368419/kontlo.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bismillah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957293494403113/bismilah.jpeg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "homuking")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957349038784512/homuking_2.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957353615425546/homuking.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngeyel")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957415305773056/ngeyel.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tani")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thamngan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957489967661076/thamngan.jpg");
			
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
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957461953773568/sange.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "rapsodi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957431410851850/rapsodi.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "seno")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957478106300476/seno.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tumdur")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tidur")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bobo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957494514024488/tumdur.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gesek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957346434252800/gesek.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "out")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pelatih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pelatuh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957420481019914/out.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "welcome")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957504266436618/welcome.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ingat")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tobat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957354039574548/ingat.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "memek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957287538360320/11702899958933.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816304978536038521/tuowpQR.jpg");
			
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
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957329280335912/diem.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cemen")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "cayman")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957295880699924/cayman_-_edit.png");
			
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
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957385693724692/latom.jpg");
			
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
				|| args[0].equalsIgnoreCase(KochengController.prefix + "goblog")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/843443030618669086/FB_IMG_1621162736987.jpg");
			
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
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngeri")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/92Mcvo9.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "achievement")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "achivmen")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "acivmen")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "acimen")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/smNRG6C.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "percaya")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394376888778873/826372947186810920/PicsArt_03-30-03.30.57.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gay")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066848529547279/gay.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sunat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066885855182902/sunat.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hujat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066855240433664/hujat.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tt")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tete")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066895607070770/tt.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pride")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066841189908480/ayaka.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jaog")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "jago")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ampun")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "seram")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "sram")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "sramz")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066861365166090/jaog.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "melas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066866671091782/melas.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tau")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066890779688960/tau.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "retry")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tetty")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066880113311784/retry.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gangbang")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813786373168300112/gangbang.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "isep")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/815482469054152765/isep.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "homa")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "atlas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816280699661058068/tmp_1614686874600.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "janji")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816281484356616202/1765.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "track")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ip")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816281492853489685/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816282386584698880/image0.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "faisal")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816282025035038741/1614586954843.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jiwan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816282336614285333/image0.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "summon")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "cium")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816283024748314644/IMG_20210302_191658.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();			
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jijik")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816283236950736906/image0.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816298396326821888/IMG_20210302_201811.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pekok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816284996070932510/1614687894237.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sesat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816286590497194034/20210302_193058.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nyimak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816290405904809984/IMG_20210302_194617.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hode")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816294027610816532/IMG_20210302_200045.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ijo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295784558886942/IMG_20200903_221330.JPG");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295784709357618/IMG_20200914_205740.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "damai")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295661833551923/IMG_20210302_200058.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295662017839114/IMG_20210302_200257.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "canda")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295627696373770/IMG_20210302_200655.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ps5")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816299256439635988/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816299905085079612/IMG_20210302_202406.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hdmi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/816300441687556096/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pece")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816301885816438784/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "babi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816302066062327828/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "om")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819101058785476618/20210310_135454.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gapeduli")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bomat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816303633414488125/nobodycares.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "xing")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "xingqiu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816607704398430238/IMG_20210303_164720.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816606968059002880/IMG_20210303_164358.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819093367865737226/Screenshot_20210310-132430_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pervert")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "perv")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/817224265181954078/IMG_20210305_093616.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "atitut")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/818175381147222036/PicsArt_03-08-12.34.22.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bandara")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "barbara")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "barabata")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/818306161387372554/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gei")) {
			EmbedBuilder embed = new EmbedBuilder();
			
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/819095573331443722/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/818461450599137330/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819096265765421056/Screenshot_20210310-133555_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "chongyun")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "chong")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/818466143232458762/Screenshot_20210308-194845_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tusuk")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/818471616421036042/436649.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "psikopat")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "psokopay")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394376888778873/818704546750005278/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tetawat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373978248249414/819085778167922698/Screenshot_20210310-125332_LINE.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mention")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819087117341949962/image0.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nyambung")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819094092616957972/Screenshot_20210310-132721_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "harem")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/819097171991330836/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ocincin")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/797114259149553724/819266433770455070/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sahabat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/797114259149553724/819280123743436830/Screenshot_20210311-012920_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mabar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819444604755509288/IMG_20210311_123853.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "npc")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/821556220396961812/IMG_20210317_083051.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lupa")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/822465593386336266/Screenshot_20210319-204356_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hadeh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/823498835527073812/362009.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "badut")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/797114259149553724/823986806478340157/ck56ov115sa31.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngantuk")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/824117155217670174/Screenshot_20210324-100619_LINE.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "klee")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/832991412701626428/FB_IMG_1606374231893.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "leyline")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/775964396241027092/833201470601035776/ea-1.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "salto")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/834549559412654080/IMG_20210422_044835.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yuri")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/839476132407410718/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hirji")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "horny")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/844136738570108928/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "miskin")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/846597982433837076/IMG_20210521_200731.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "dompet")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/848847011725836308/PicsArt_05-31-03.54.46.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "konglol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734387450960412672/848870259128664094/PicsArt_05-31-05.26.33.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "typo")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tipo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/850008387658973194/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gem")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388021620637716/851424087430397952/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "wawasan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/854270787816128542/IMG_20210615_150654.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ss")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/854617477493555220/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yanfei")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/854649566933680138/image0.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ayaka")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/855996445190914048/149301307_3710108195708879_1620994372999686783_n.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kalah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/856003732344143872/IMG_20210620_105233.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "genshin")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/858930382670135307/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mengheningkan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/859947294273830932/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "coklat")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "keju")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/860859650870083594/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "saoi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/860863398705889310/IMG_20210703_204326.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "update")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/729552134663831622/863344486012289084/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "berak")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "beraq")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/863367437021478912/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jumatan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/863367301411242004/Screenshot_20210709114010.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "laku")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/862941469140713492/IMG_20210709_142103.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "onat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/866655312164421633/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		
		//not listed yet
	}
}
