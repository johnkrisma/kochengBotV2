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
					"====================\n"+
					"3jt\n"+
					"50k\n"+
					"achievement / achivmen / acivmen / acimen\n"+
					"astaga / astava / asfava\n"+
					"ampas\n"+
					"anal\n"+
					"anj / anjg / ajg / anjing\n"+
					"anjay\n"+
					"anjim\n"+
					"atitut\n"+
					"ayaka\n"+
					"babi\n"+
					"bacot / nacot / bavot / baxot / vagot / bagot\n"+
					"badut\n"+
					"bagus\n"+
					"baik\n"+
					"baiwan / bewan / byone\n"+
					"balon / balonku\n"+
					"banjir / fakta / fanta\n"+
					"baper / laper\n"+
					"barbara / barabata / bandara\n"+
					"benar\n"+
					"berak / beraq\n"+
					"biadam\n"+
					"bisa\n"+
					"bismillah\n"+
					"bobi\n"+
					"bohong\n"+
					"bokep / bocil\n"+
					"bokong\n"+
					"bomat / gapeduli\n"+
					"bosan\n"+
					"burung\n"+
					"canda\n"+
					"capek\n"+
					"cayman / cemen\n"+
					"cengeng\n"+
					"ceplok\n"+
					"chongyun / chong\n"+
					"cina\n"+
					"citacita\n"+
					"cnuy\n"+
					"coklat / keju\n"+
					"coli\n"+
					"crot\n"+
					"cuma\n"+
					"cupu / cupi / payah\n"+
					"curang\n"+
					"curhat\n"+
					"damai\n"+
					"dana\n"+
					"darimana\n"+
					"dek\n"+
					"des\n"+
					"dev / fandom\n"+
					"diem / diam\n"+
					"dildo\n"+
					"dokter\n"+
					"dompet\n"+
					"duit / duid\n"+
					"elit\n"+
					"elus\n"+
					"emek\n"+
					"enak\n"+
					"encok\n"+
					"eregsi\n"+
					"esse\n"+
					"ewe / eue\n"+
					"f2p\n"+
					"faisal\n"+
					"favorit\n"+
					"fendet / gender\n"+
					"fetis / fetish\n"+
					"fubuki / fukuki / manual\n"+
					"gacha\n"+
					"gaguna\n"+
					"gakreatif\n"+
					"gangbang\n"+
					"gatal / gatel\n"+
					"gay\n"+
					"geh\n"+
					"gei\n"+
					"gem\n"+
					"genshin\n"+
					"gesek\n"+
					"gila\n"+
					"gigit\n"+
					"gitar\n"+
					"goblog / goblok \n"+
					"hadeh\n"+
					"hak\n"+
					"hamil\n"+
					"hantu\n"+
					"harem\n"+
					"hayo\n"+
					"hdmi\n"+
					"henceut\n"+
					"hijau\n"+
					"hode\n"+
					"hoki\n"+
					"homo\n"+
					"====================\n"+
					"Ketik "+KochengController.prefix+"list2 untuk melihat command selanjutnya\n"
					);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		
		if(args[0].equalsIgnoreCase(KochengController.prefix + "list2")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Command List Kocheng");
			embed.setDescription(
					"====================\n"+
					"homuking\n"+
					"hooh\n"+
					"horny / hirji\n"+
					"hujat\n"+
					"ijo\n"+
					"ingat / tobat\n"+
					"insekyur\n"+
					"isep\n"+
					"janji\n"+
					"jaog / jago / ampun / seram / sram / sramz\n"+
					"jagoan\n"+
					"jelata\n"+
					"jelek\n"+
					"jembut / jembud\n"+
					"jijik\n"+
					"jiwan\n"+
					"jodoh\n"+
					"jokowi\n"+
					"jumatan\n"+
					"kalah\n"+
					"kangen\n"+
					"kasar / laskar\n"+
					"kasihan\n"+
					"kawaii / kawai\n"+
					"kaya\n"+
					"kecoa\n"+
					"kekar\n"+
					"kentu\n"+
					"keqing\n"+
					"ketua\n"+
					"kihomo\n"+
					"kimpeha\n"+
					"khunul\n"+
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
					"legion\n"+
					"lemah\n"+
					"lengah\n"+
					"leyline\n"+
					"login\n"+
					"lonte / kobte\n"+
					"lucu\n"+
					"lupa\n"+
					"mabar\n"+
					"malam / malem\n"+
					"malas\n"+
					"mantap\n"+
					"masuk\n"+
					"mati\n"+
					"mei / mei kita / mei gue\n"+
					"melas\n"+
					"membuahi\n"+
					"memek\n"+
					"mending\n"+
					"mengheningkan\n"+
					"mention\n"+
					"meo / memeo\n"+
					"minta / bagi\n"+
					"miskin\n"+
					"mobil\n"+
					"monthly\n"+
					"monly\n"+
					"monyet\n"+
					"muak\n"+
					"mulai\n"+
					"nangis\n"+
					"nabung\n"+
					"nahida\n"+
					"nasgor\n"+
					"nenen\n"+
					"ngambek\n"+
					"ngangkang\n"+
					"ngantuk\n"+
					"ngentod / ngentot\n"+
					"ngeri\n"+
					"ngeyel\n"+
					"ngocok\n"+
					"ngontol\n"+
					"nguli\n"+
					"npc\n"+
					"ntr\n"+
					"nyambung\n"+
					"nyimak\n"+
					"ocincin\n"+
					"ok\n"+
					"om\n"+
					"onat\n"+
					"opini\n"+
					"out / pelatih / pelatuh\n"+
					"paansi / apasih / apasih / paansih / apaansih / apasi\n"+
					"pagi\n"+
					"pece\n"+
					"====================\n"+
					"Ketik "+KochengController.prefix+"list3 untuk melihat command selanjutnya\n"
					);
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		
		if(args[0].equalsIgnoreCase(KochengController.prefix + "list3")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Command List Kocheng");
			embed.setDescription(
					"====================\n"+
					"pegal\n"+
					"pekok\n"+
					"pendek\n"+
					"percaya\n"+
					"perjaka\n"+
					"permen\n"+
					"pervert / perv\n"+
					"pici / pc\n"+
					"pride\n"+
					"ps5\n"+
					"psikopat / psokopay"+
					"pukul / berani\n"+
					"qiqi\n"+
					"rapsodi\n"+
					"rasakan\n"+
					"rehab / rehabilitas / rebihalitas\n"+
					"retry / tetty\n"+
					"ribut / ribiw\n"+
					"rog\n"+
					"sahabat\n"+
					"salto\n"+
					"sange / sangean\n"+
					"saoi\n"+
					"sarapan\n"+
					"sarjana / ekonomi\n"+
					"saus / saos / sauce / pasal\n"+
					"sedih\n"+
					"segar\n"+
					"selaw\n"+
					"seno\n"+
					"sesat\n"+
					"shap / siap\n"+
					"sipaling\n"+
					"smash / semes / smesh\n"+
					"sodok\n"+
					"sopan\n"+
					"sore\n"+
					"ss\n"+
					"summon / cium\n"+
					"sunat\n"+
					"sunda\n"+
					"susu\n"+
					"taat / aturan\n"+
					"tag\n"+
					"takut\n"+
					"tani / thamngan\n"+
					"tau\n"+
					"telanjang / bugil\n"+
					"telat\n"+
					"tergantung\n"+
					"terhura / terharu\n"+
					"test\n"+
					"tidur\n"+
					"tingkahmu\n"+
					"titit / titid\n"+
					"tolak\n"+
					"tovat\n"+
					"tomay / tomat\n"+
					"toxic / toksik\n"+
					"track / ip\n"+
					"tri\n"+
					"tt / tete\n"+
					"tumdur / bobo\n"+
					"tusbol\n"+
					"tusuk\n"+
					"ty / thx / thanks\n"+
					"typo / tipo\n"+
					"umam\n"+
					"update\n"+
					"waduh\n"+
					"wawasan\n"+
					"welcome\n"+
					"wibu\n"+
					"woi\n"+
					"woo / pantek\n"+
					"xingqiu / xing\n"+
					"yan / jajan\n"+
					"yanfei\n"+
					"yes\n"+
					"yoga\n"+
					"yuri\n"+
					"====================\n"
					);
		event.getChannel().sendTyping().queue();
		event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		
		//info kocheng
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kocheng")) {
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("KochengBot");
			info.setDescription("Hai saya kocheng\nLO SEMUA KONTOOOOOOOOOLLLLLL");
			info.setFooter("Created by polrusak ft. para penyepong hoyomi");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(info.build()).queue();
			info.clear();
		}
		
		//main response
		if(args[0].equalsIgnoreCase(KochengController.prefix + "test")) {
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("tas tes tas tes kontol bapak kau pecah").queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.pinimg.com/originals/54/a4/00/54a4008daad4565a9b5db1b94e59c74c.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "meo")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "memeo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/XJdmMjh.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gakreatif")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957343016157194/ga_kreatif.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sodok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957477553438760/sogok.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "telanjang")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bugil")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957484989415454/telanjang.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sarapan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957467121549362/sarapan.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "rehab")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "rehabilitas")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "rebihalitas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957436440215592/rehab.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yan")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "jajan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957356258361344/jajan.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "woo")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pantek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957508808867840/woo.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bagi")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "minta")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957408447037440/minta_duid.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
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
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957290881482782/bacot_2.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ty")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thx")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thanks")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957499119763456/ty.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
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
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mei")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "mei kita")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "mei gue")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957397399240704/mei.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jembut")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "jembud")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957358245806130/jembut.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cupu")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "cupi")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "payah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/983957648275800124/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lonte")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "kobte")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957378794225674/kobte.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lawak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957289261694986/11741727946472.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "elit")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957340755951636/elit.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mati")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957392114548736/mati.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ribut")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ribiw")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957282819375124/11702893809638.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957285911494666/11702893817986.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kontol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957373341368419/kontlo.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bismillah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957293494403113/bismilah.jpeg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "homuking")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957349038784512/homuking_2.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957353615425546/homuking.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngeyel")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957415305773056/ngeyel.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tani")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thamngan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957489967661076/thamngan.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bewan")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "byone")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "baiwan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/CUxZr1o.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sange")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "sangean")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957461953773568/sange.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "rapsodi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957431410851850/rapsodi.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "seno")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957478106300476/seno.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tumdur")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bobo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957494514024488/tumdur.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gesek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957346434252800/gesek.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "out")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pelatih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pelatuh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957420481019914/out.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "welcome")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957504266436618/welcome.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ingat")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tobat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957354039574548/ingat.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "memek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957287538360320/11702899958933.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816304978536038521/tuowpQR.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "citacita")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/E4pRuCj.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bosan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1006207047760625775/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).complete().addReaction("U+1F44D").queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngangkang")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/t3urgoe.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "balon")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "balonku")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Rz7zMVv.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nangis")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/sV5PsuT.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "curang")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/HJzkMpn.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ntr")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/S3YBKi4.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kawaii")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "kawai")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/wWZbPN5.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "smash")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "semes")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "smesh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/pBzrBEn.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "diam")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "diem")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957329280335912/diem.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cemen")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "cayman")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957295880699924/cayman_-_edit.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "des")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/IVNnHfG.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gatal")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "gatel")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/nbzU6SH.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "coli")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/TObAH5D.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "woi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/AyKlsWw.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "malam")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "malem")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/SaTRIn1.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
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
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cengeng")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/yHAsUbG.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pukul")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "berani")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/MQopSkq.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/U0h925E.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sauce")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "saus")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pasal")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "saos")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/qvb7dDI.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/937966496125157426/IMG_20220110_150334.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "laskar")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "kasar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Cg3O3ur.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pici")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pc")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/g4iAdJd.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bokong")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/20rFbQA.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "homo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Tkzxwsg.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "latom")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "doa")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "amin")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/812957385693724692/latom.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "fubuki")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "fukuki")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "manual")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/RYaGIq4.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jodoh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/ZQH4VqE.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sarjana")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ekonomi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/ysXA7Kt.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "goblok")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "goblog")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/843443030618669086/FB_IMG_1621162736987.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tomay")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tomat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/L7VBJ8o.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nabung")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/93vMbPt.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "taat")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "aturan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/XQzl6xr.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pagi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/stlnppa.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "toxic")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "toksik")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/zQeVSLN.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yes")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/7v81o2C.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kuota")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/LUCMJjI.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hamil")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/rwStWn1.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kubus")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "kunus")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/PA9sGAi.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "biadam")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/TrJzcPj.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ampas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/993522747516923984/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "emek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/vJnY6LS.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hantu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/dk6b6ak.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "terhura")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "terharu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/cSdTyIX.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "keqing")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/oWIximk.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/nWXDuOo.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "qiqi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/oRjyTck.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/dPuVDJY.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "fendet")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "gender")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/BGogDHX.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "capek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/oYtmhXI.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "takut")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1023993399751221268/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1023993400137105518/eaea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kecoa")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/R1Ckzhp.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "crot")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/MGr6NwS.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mulai")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/7qCr48S.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lah")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ngatur")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/qwSuqo8.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "monthly")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Lsc5npu.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "dokter")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/f10pqB9.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "konjol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/AGKYzvn.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "laksek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/RkwVqZN.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngambek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/jccJxZH.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ketua")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/CGBZ7Cd.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "segar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/bVAAE6z.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/omKfthb.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "curhat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/RvNV9iw.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nasgor")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/8H2mvQt.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gaguna")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/1Ymuesg.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngontol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/tskBuZZ.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "selaw")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/lHpz4Nw.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kekar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/YbxKWD5.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "geh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/GNE5YLZ.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "dildo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/rYYtJte.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "telat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/993358037958017104/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngeri")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/92Mcvo9.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "achievement")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "achivmen")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "acivmen")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "acimen")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/smNRG6C.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "percaya")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394376888778873/826372947186810920/PicsArt_03-30-03.30.57.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gay")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066848529547279/gay.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sunat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066885855182902/sunat.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hujat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066855240433664/hujat.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tt")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tete")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066895607070770/tt.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pride")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066841189908480/ayaka.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
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
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "melas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066866671091782/melas.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tau")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066890779688960/tau.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "retry")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tetty")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813066880113311784/retry.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gangbang")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/813786373168300112/gangbang.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "isep")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/815482469054152765/isep.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "janji")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/977782244443815946/IMG_20220522_105724.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/977782750557921290/IMG_20220522_114825.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "track")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ip")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816281492853489685/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816282386584698880/image0.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "faisal")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816282025035038741/1614586954843.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jiwan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816282336614285333/image0.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "summon")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "cium")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816283024748314644/IMG_20210302_191658.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();			
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jijik")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816283236950736906/image0.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816298396326821888/IMG_20210302_201811.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pekok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816284996070932510/1614687894237.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sesat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816286590497194034/20210302_193058.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nyimak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816290405904809984/IMG_20210302_194617.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hode")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816294027610816532/IMG_20210302_200045.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ijo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295784558886942/IMG_20200903_221330.JPG");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295784709357618/IMG_20200914_205740.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "damai")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295661833551923/IMG_20210302_200058.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295662017839114/IMG_20210302_200257.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "canda")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816295627696373770/IMG_20210302_200655.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ps5")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816299256439635988/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816299905085079612/IMG_20210302_202406.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hdmi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/816300441687556096/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pece")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816301885816438784/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "babi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/966013228750614608/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "om")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819101058785476618/20210310_135454.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gapeduli")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bomat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816303633414488125/nobodycares.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "xing")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "xingqiu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816607704398430238/IMG_20210303_164720.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/816606968059002880/IMG_20210303_164358.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819093367865737226/Screenshot_20210310-132430_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pervert")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "perv")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/817224265181954078/IMG_20210305_093616.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "atitut")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/818175381147222036/PicsArt_03-08-12.34.22.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bandara")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "barbara")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "barabata")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/818306161387372554/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gei")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/818461450599137330/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "chongyun")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "chong")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/818466143232458762/Screenshot_20210308-194845_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tusuk")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/818471616421036042/436649.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "psikopat")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "psokopay")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394376888778873/818704546750005278/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mention")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819087117341949962/image0.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nyambung")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819094092616957972/Screenshot_20210310-132721_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "harem")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/819097171991330836/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ocincin")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/797114259149553724/819266433770455070/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sahabat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/797114259149553724/819280123743436830/Screenshot_20210311-012920_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mabar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/819444604755509288/IMG_20210311_123853.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "npc")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/821556220396961812/IMG_20210317_083051.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lupa")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/822465593386336266/Screenshot_20210319-204356_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hadeh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/823498835527073812/362009.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "badut")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734383000812388382/891035207682101308/E47m9tUXwAQddS5.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/900680282896752660/PhotoGrid_Plus_1634795878005.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngantuk")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/824117155217670174/Screenshot_20210324-100619_LINE.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "klee")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/832991412701626428/FB_IMG_1606374231893.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "leyline")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1053561890296582195/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "salto")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/834549559412654080/IMG_20210422_044835.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yuri")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/839476132407410718/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hirji")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "horny")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/844136738570108928/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "miskin")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/846597982433837076/IMG_20210521_200731.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "dompet")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/848847011725836308/PicsArt_05-31-03.54.46.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "konglol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734387450960412672/848870259128664094/PicsArt_05-31-05.26.33.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "typo")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "tipo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/850008387658973194/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gem")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388021620637716/851424087430397952/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "wawasan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/854270787816128542/IMG_20210615_150654.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ss")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/854617477493555220/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yanfei")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/854649566933680138/image0.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ayaka")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/855996445190914048/149301307_3710108195708879_1620994372999686783_n.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kalah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/856003732344143872/IMG_20210620_105233.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "genshin")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/858930382670135307/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mengheningkan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/859947294273830932/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "coklat")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "keju")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/860859650870083594/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "saoi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/860863398705889310/IMG_20210703_204326.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "update")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/729552134663831622/863344486012289084/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "berak")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "beraq")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/863367437021478912/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jumatan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/863367301411242004/Screenshot_20210709114010.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "laku")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/862941469140713492/IMG_20210709_142103.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "onat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/866655312164421633/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "opini")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/868751512082477096/FB_IMG_1627196888040.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "perjaka")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/872106867277561886/IMG_20210803_172303.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "anal")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/872493799014813706/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jelata")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/877355694481891379/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "baper")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "laper")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/877372182051835954/IMG_20210818_100330.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bobi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/882179034937692162/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nguli")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/993859407370792960/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "benar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/888037070080188476/Screenshot_2021_0916_202204.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngocok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/878668202048102410/889024368557051974/IMG_20210916_104219.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "insekyur")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/890134926903627836/890180736630554634/1615600537455.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sopan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/778481550701494302/890521190437900298/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gacha")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/994279002044899378/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kimpeha")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/905741843893981224/Untitled10_20211104155435.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tag")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388021620637716/895248598252519454/IMG_20211006_165748.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ceplok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/900597457178738748/IMG_20211021_111224.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nenen")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/829733282799026197/905446922347765761/received_259481762726523.jpeg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "monyet")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/914101847822835794/Screenshot_20211127_183413.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "henceut")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/764373155313221632/919226119654359122/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "fetis")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "fetish")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/924583623812849664/IMG_20211226_154507.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yoga")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/924613777905811486/PicsArt_12-25-08.27.24.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kaya")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/927839568147914792/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hayo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/937194253199765524/hayo_ngapain_pegang_tytyd.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lemah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/939040257456877628/IMG_20220204_105141.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mending")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/941652603924803604/IMG_20220211_191111.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sore")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/942721744563748885/IMG_20220214_175934.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cuma")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/942727055789932644/IMG_20220214_182037.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "burung")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/949690853570543626/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sedih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "swdoj")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/956429287483928686/Screenshot_20220324-124825_Discord.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "elus")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/956714223973572648/IMG_20220325_083529.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bohong")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388021620637716/961120770195591168/20220403_045258.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "anjay")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/961127445661102090/WhatsApp_Image_2022-04-03_at_12.56.39.jpeg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "shap")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "siap")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/962278913629884446/shap.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		
		if(args[0].equalsIgnoreCase(KochengController.prefix + "duit")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "duid")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/965436153807396914/saya_butuh_1_triliyun.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "darimana")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/965436154096787496/dari_mana_duitnya.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kangen")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/967415095359598702/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sipaling")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/967732803682861056/si_paling.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "dek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/968141974408429628/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "titit")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "titid")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/915094378219962398/Screenshot_20211130_121810.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tovat")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/970332519113310278/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bokep")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bocil")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/975937672960962620/Screenshot_20220517_094735.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/974201839446814770/IMG_20220512_144937.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "banjir")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "fakta")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "fanta")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/974288175440732170/download.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jelek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/974606472178708480/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "eregsi")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "off")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/974942113047400488/FB_IMG_1651926127570.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tidur")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/975781586085773312/Screenshot_2022-05-16-22-26-53-173_com.discord2.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mantap")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/829733282799026197/978259834036166726/IMG_20220523_183500.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cnuy")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394330562953259/978535525323522048/FB_IMG_1653012645413.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "enak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/979348978653073488/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bagus")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/829733282799026197/979643188367216640/20220527_141201.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "masuk")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/829733282799026197/981138451594350592/20220531_171327.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "anjim")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/981836591007957043/FB_IMG_1654153064442.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cina")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734394269871112212/982955981224947742/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tusbol")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/983667439827034182/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ewe")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "eue")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388695049830470/989732963929428018/unknown.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "esse")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/990825916580126771/IMG_20220627_114606.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
			embed.setImage("https://cdn.discordapp.com/attachments/734258297145917461/990825916982763580/IMG_20220627_114536.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kentu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/734388021620637716/993076213436391535/IMG_20220702_180656.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hijau")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/996039773582000218/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gitar")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/999342727596613802/IMG_20220720_173557.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "encok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1000732805954818171/ea.jpeg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "nahida")) {
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("NAHIDA... NAHIDA NAHIDA NAHIDAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAA\r\n"
					+ "AAAAAAAAAAAAAAAAAGH AAAAAAAAAAAAAAAAAAAAAAAGH! WANGI WANGI WANGI WANGI HU HA HU HA HU HA, aaaah baunya Nahida wangi aku mau nyiumin aroma wanginya Nahida AAAAAAAAH Rambutnya. AAAHHH rambutnya juga pengen aku elus-elus ----- AAAAAH Nahida keluar pertama kali juga manis!!! Dia senyum itu juga manis banget AAAAAAAAH NAHIDA LUCCUUUUUUUUUUUUUUU......... GUA BAKAL RELA TOPUP 5 JUTA BUAT NAHIDA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAGH\r\n"
					+ "Apa? Nahida itu gak nyata? Cuma karakter 2 dimensi katamu?\r\n"
					+ "Nggak ngak ngak ngak ngak NGAAAAAAAAK GUA GAK PERCAYA ITU DIA NYATA NGAAAAAAAAAAAAAAAAAK WIBU BANGSAAAAAT!\r\n"
					+ "GUA GAK PEDULI SAMA KENYATAAN POKOKNYA GAK PEDULI Nahida ngeliat gw. Nahida di pici ngeliatin gw. Nahida... kamu percaya sama aku? AAAAAAAAHHH syukur Nahida gak malu merelakan aku aaaaaah!!! YEAAAAAAAAAAAH GUA MASIH PUNYA NAHIDA, SENDIRI PUN NGGAK SAMA AAAAAAAAAAAAAAH").queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tingkahmu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1003130089455755305/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mobil")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1004746674700304474/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gigit")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1004749569210462288/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lengah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1010229815862898749/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "legion")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1010939241410334750/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "muak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1017394620075876372/gw_udah_muak.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tolak")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1018698872589140059/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hoki")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1021084087328460890/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pendek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1021367903855050803/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "f2p")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1021742091325411408/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bisa")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1021744561179078706/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "membuahi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1021745724070834226/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "dana")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1022087612988669962/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "gila")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1022157397168488448/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "baik")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1022184130089340948/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "khunul")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1022395661976604693/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "rog")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1023230952748617838/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ngentod")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ngentot")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1023990996645712052/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "monly")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1024336460553408573/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "50k")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1024336460977016953/eaea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tri")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1024530261498671114/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "anjing")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "anjg")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "ajg")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "anj")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1024531326709284894/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "wibu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1025956267518333058/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "lucu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1026148077221974136/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "susu")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1027191091058987149/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "login")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1027943455651008562/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "pegal")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1031408862877716500/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kihomo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1033383911687979099/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "3jt")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1037938614732083250/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "dev")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "fandom")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1039379953038413844/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "rasakan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1043019515665064027/ohyarasakan-ganjar.gif");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "malas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1040548380713168926/eaea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jokowi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1044927134940024842/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "umam")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1048419919332655134/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "hooh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1052129236271509524/hooh.gif");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "permen")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1054961968391397436/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "tergantung")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1057358476877250601/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "favorit")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1059640308830306344/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kasihan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1060407233705418872/gadaakhlak-upin-ipin.gif");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jagoan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1062734576658694205/ea.jpeg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sunda")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1064456943747481630/ea.png");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "waduh")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1064500329695162479/eaea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}
		
		//not listed yet
	}
}
