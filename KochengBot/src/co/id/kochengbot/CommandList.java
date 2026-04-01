package co.id.kochengbot;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.jetbrains.annotations.NotNull;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandList extends ListenerAdapter {

    // -------------------------------------------------------------------------
    // Single-image commands: alias(es) -> one image URL
    // -------------------------------------------------------------------------
    private static final Map<String, String> IMAGE_COMMANDS = new HashMap<>();

    // Multi-image commands: alias(es) -> list of image URLs (all sent in order)
    private static final Map<String, List<String>> MULTI_IMAGE_COMMANDS = new HashMap<>();

    static {
        IMAGE_COMMANDS.put("ok", "https://i.pinimg.com/originals/54/a4/00/54a4008daad4565a9b5db1b94e59c74c.jpg");
        IMAGE_COMMANDS.put("meo", "https://i.imgur.com/XJdmMjh.jpg");
        IMAGE_COMMANDS.put("memeo", "https://i.imgur.com/XJdmMjh.jpg");
        IMAGE_COMMANDS.put("gakreatif", "https://cdn.discordapp.com/attachments/812956551320043523/812957343016157194/ga_kreatif.jpg");
        IMAGE_COMMANDS.put("sodok", "https://cdn.discordapp.com/attachments/812956551320043523/812957477553438760/sogok.jpg");
        IMAGE_COMMANDS.put("telanjang", "https://cdn.discordapp.com/attachments/812956551320043523/812957484989415454/telanjang.jpg");
        IMAGE_COMMANDS.put("bugil", "https://cdn.discordapp.com/attachments/812956551320043523/812957484989415454/telanjang.jpg");
        IMAGE_COMMANDS.put("sarapan", "https://cdn.discordapp.com/attachments/812956551320043523/812957467121549362/sarapan.jpg");
        IMAGE_COMMANDS.put("rehab", "https://cdn.discordapp.com/attachments/812956551320043523/812957436440215592/rehab.jpg");
        IMAGE_COMMANDS.put("rehabilitas", "https://cdn.discordapp.com/attachments/812956551320043523/812957436440215592/rehab.jpg");
        IMAGE_COMMANDS.put("rebihalitas", "https://cdn.discordapp.com/attachments/812956551320043523/812957436440215592/rehab.jpg");
        IMAGE_COMMANDS.put("yan", "https://cdn.discordapp.com/attachments/812956551320043523/812957356258361344/jajan.jpg");
        IMAGE_COMMANDS.put("jajan", "https://cdn.discordapp.com/attachments/812956551320043523/812957356258361344/jajan.jpg");
        IMAGE_COMMANDS.put("woo", "https://cdn.discordapp.com/attachments/812956551320043523/812957508808867840/woo.jpg");
        IMAGE_COMMANDS.put("pantek", "https://cdn.discordapp.com/attachments/812956551320043523/812957508808867840/woo.jpg");
        IMAGE_COMMANDS.put("bagi", "https://cdn.discordapp.com/attachments/812956551320043523/812957408447037440/minta_duid.jpg");
        IMAGE_COMMANDS.put("minta", "https://cdn.discordapp.com/attachments/812956551320043523/812957408447037440/minta_duid.jpg");
        IMAGE_COMMANDS.put("ty", "https://cdn.discordapp.com/attachments/812956551320043523/812957499119763456/ty.jpg");
        IMAGE_COMMANDS.put("thx", "https://cdn.discordapp.com/attachments/812956551320043523/812957499119763456/ty.jpg");
        IMAGE_COMMANDS.put("thanks", "https://cdn.discordapp.com/attachments/812956551320043523/812957499119763456/ty.jpg");
        IMAGE_COMMANDS.put("apasih", "https://cdn.discordapp.com/attachments/812956551320043523/1066326501097746432/ea.jpg");
        IMAGE_COMMANDS.put("paansi", "https://cdn.discordapp.com/attachments/812956551320043523/1066326501097746432/ea.jpg");
        IMAGE_COMMANDS.put("paansih", "https://cdn.discordapp.com/attachments/812956551320043523/1066326501097746432/ea.jpg");
        IMAGE_COMMANDS.put("apaansih", "https://cdn.discordapp.com/attachments/812956551320043523/1066326501097746432/ea.jpg");
        IMAGE_COMMANDS.put("apasi", "https://cdn.discordapp.com/attachments/812956551320043523/1066326501097746432/ea.jpg");
        IMAGE_COMMANDS.put("mei", "https://cdn.discordapp.com/attachments/812956551320043523/812957397399240704/mei.jpg");
        IMAGE_COMMANDS.put("mei kita", "https://cdn.discordapp.com/attachments/812956551320043523/812957397399240704/mei.jpg");
        IMAGE_COMMANDS.put("mei gue", "https://cdn.discordapp.com/attachments/812956551320043523/812957397399240704/mei.jpg");
        IMAGE_COMMANDS.put("jembut", "https://cdn.discordapp.com/attachments/812956551320043523/812957358245806130/jembut.jpg");
        IMAGE_COMMANDS.put("jembud", "https://cdn.discordapp.com/attachments/812956551320043523/812957358245806130/jembut.jpg");
        IMAGE_COMMANDS.put("cupu", "https://cdn.discordapp.com/attachments/812956551320043523/983957648275800124/ea.jpg");
        IMAGE_COMMANDS.put("cupi", "https://cdn.discordapp.com/attachments/812956551320043523/983957648275800124/ea.jpg");
        IMAGE_COMMANDS.put("payah", "https://cdn.discordapp.com/attachments/812956551320043523/983957648275800124/ea.jpg");
        IMAGE_COMMANDS.put("lonte", "https://cdn.discordapp.com/attachments/812956551320043523/812957378794225674/kobte.jpg");
        IMAGE_COMMANDS.put("kobte", "https://cdn.discordapp.com/attachments/812956551320043523/812957378794225674/kobte.jpg");
        IMAGE_COMMANDS.put("lawak", "https://cdn.discordapp.com/attachments/812956551320043523/812957289261694986/11741727946472.jpg");
        IMAGE_COMMANDS.put("elit", "https://cdn.discordapp.com/attachments/812956551320043523/812957340755951636/elit.jpg");
        IMAGE_COMMANDS.put("mati", "https://cdn.discordapp.com/attachments/812956551320043523/812957392114548736/mati.jpg");
        IMAGE_COMMANDS.put("kontol", "https://cdn.discordapp.com/attachments/812956551320043523/812957373341368419/kontlo.jpg");
        IMAGE_COMMANDS.put("bismillah", "https://cdn.discordapp.com/attachments/812956551320043523/812957293494403113/bismilah.jpeg");
        IMAGE_COMMANDS.put("ngeyel", "https://cdn.discordapp.com/attachments/812956551320043523/812957415305773056/ngeyel.png");
        IMAGE_COMMANDS.put("tani", "https://cdn.discordapp.com/attachments/812956551320043523/812957489967661076/thamngan.jpg");
        IMAGE_COMMANDS.put("thamngan", "https://cdn.discordapp.com/attachments/812956551320043523/812957489967661076/thamngan.jpg");
        IMAGE_COMMANDS.put("bewan", "https://i.imgur.com/CUxZr1o.jpg");
        IMAGE_COMMANDS.put("byone", "https://i.imgur.com/CUxZr1o.jpg");
        IMAGE_COMMANDS.put("baiwan", "https://i.imgur.com/CUxZr1o.jpg");
        IMAGE_COMMANDS.put("sange", "https://cdn.discordapp.com/attachments/812956551320043523/812957461953773568/sange.png");
        IMAGE_COMMANDS.put("sangean", "https://cdn.discordapp.com/attachments/812956551320043523/812957461953773568/sange.png");
        IMAGE_COMMANDS.put("rapsodi", "https://cdn.discordapp.com/attachments/812956551320043523/812957431410851850/rapsodi.jpg");
        IMAGE_COMMANDS.put("seno", "https://cdn.discordapp.com/attachments/812956551320043523/812957478106300476/seno.png");
        IMAGE_COMMANDS.put("tumdur", "https://cdn.discordapp.com/attachments/812956551320043523/812957494514024488/tumdur.png");
        IMAGE_COMMANDS.put("bobo", "https://cdn.discordapp.com/attachments/812956551320043523/812957494514024488/tumdur.png");
        IMAGE_COMMANDS.put("gesek", "https://cdn.discordapp.com/attachments/812956551320043523/812957346434252800/gesek.jpg");
        IMAGE_COMMANDS.put("out", "https://cdn.discordapp.com/attachments/812956551320043523/812957420481019914/out.jpg");
        IMAGE_COMMANDS.put("pelatih", "https://cdn.discordapp.com/attachments/812956551320043523/812957420481019914/out.jpg");
        IMAGE_COMMANDS.put("pelatuh", "https://cdn.discordapp.com/attachments/812956551320043523/812957420481019914/out.jpg");
        IMAGE_COMMANDS.put("welcome", "https://cdn.discordapp.com/attachments/812956551320043523/812957504266436618/welcome.png");
        IMAGE_COMMANDS.put("ingat", "https://cdn.discordapp.com/attachments/812956551320043523/812957354039574548/ingat.jpg");
        IMAGE_COMMANDS.put("tobat", "https://cdn.discordapp.com/attachments/812956551320043523/812957354039574548/ingat.jpg");
        IMAGE_COMMANDS.put("citacita", "https://i.imgur.com/E4pRuCj.jpg");
        IMAGE_COMMANDS.put("ngangkang", "https://i.imgur.com/t3urgoe.jpg");
        IMAGE_COMMANDS.put("balon", "https://i.imgur.com/Rz7zMVv.jpg");
        IMAGE_COMMANDS.put("balonku", "https://i.imgur.com/Rz7zMVv.jpg");
        IMAGE_COMMANDS.put("nangis", "https://i.imgur.com/sV5PsuT.jpg");
        IMAGE_COMMANDS.put("curang", "https://i.imgur.com/HJzkMpn.jpg");
        IMAGE_COMMANDS.put("ntr", "https://i.imgur.com/S3YBKi4.jpg");
        IMAGE_COMMANDS.put("kawaii", "https://i.imgur.com/wWZbPN5.png");
        IMAGE_COMMANDS.put("kawai", "https://i.imgur.com/wWZbPN5.png");
        IMAGE_COMMANDS.put("smash", "https://i.imgur.com/pBzrBEn.png");
        IMAGE_COMMANDS.put("semes", "https://i.imgur.com/pBzrBEn.png");
        IMAGE_COMMANDS.put("smesh", "https://i.imgur.com/pBzrBEn.png");
        IMAGE_COMMANDS.put("diam", "https://cdn.discordapp.com/attachments/812956551320043523/812957329280335912/diem.jpg");
        IMAGE_COMMANDS.put("diem", "https://cdn.discordapp.com/attachments/812956551320043523/812957329280335912/diem.jpg");
        IMAGE_COMMANDS.put("cemen", "https://cdn.discordapp.com/attachments/812956551320043523/812957295880699924/cayman_-_edit.png");
        IMAGE_COMMANDS.put("cayman", "https://cdn.discordapp.com/attachments/812956551320043523/812957295880699924/cayman_-_edit.png");
        IMAGE_COMMANDS.put("des", "https://i.imgur.com/IVNnHfG.jpg");
        IMAGE_COMMANDS.put("gatal", "https://i.imgur.com/nbzU6SH.jpg");
        IMAGE_COMMANDS.put("gatel", "https://i.imgur.com/nbzU6SH.jpg");
        IMAGE_COMMANDS.put("coli", "https://i.imgur.com/TObAH5D.jpg");
        IMAGE_COMMANDS.put("woi", "https://i.imgur.com/AyKlsWw.png");
        IMAGE_COMMANDS.put("malam", "https://i.imgur.com/SaTRIn1.jpg");
        IMAGE_COMMANDS.put("malem", "https://i.imgur.com/SaTRIn1.jpg");
        IMAGE_COMMANDS.put("astaga", "https://i.imgur.com/K780PzO.jpg");
        IMAGE_COMMANDS.put("astava", "https://i.imgur.com/K780PzO.jpg");
        IMAGE_COMMANDS.put("astafa", "https://i.imgur.com/K780PzO.jpg");
        IMAGE_COMMANDS.put("asfava", "https://i.imgur.com/K780PzO.jpg");
        IMAGE_COMMANDS.put("asfaba", "https://i.imgur.com/K780PzO.jpg");
        IMAGE_COMMANDS.put("asfaga", "https://i.imgur.com/K780PzO.jpg");
        IMAGE_COMMANDS.put("asyaba", "https://i.imgur.com/K780PzO.jpg");
        IMAGE_COMMANDS.put("cengeng", "https://i.imgur.com/yHAsUbG.jpg");
        IMAGE_COMMANDS.put("laskar", "https://i.imgur.com/Cg3O3ur.png");
        IMAGE_COMMANDS.put("kasar", "https://i.imgur.com/Cg3O3ur.png");
        IMAGE_COMMANDS.put("pici", "https://i.imgur.com/g4iAdJd.jpg");
        IMAGE_COMMANDS.put("pc", "https://i.imgur.com/g4iAdJd.jpg");
        IMAGE_COMMANDS.put("bokong", "https://i.imgur.com/20rFbQA.jpg");
        IMAGE_COMMANDS.put("homo", "https://i.imgur.com/Tkzxwsg.jpg");
        IMAGE_COMMANDS.put("latom", "https://cdn.discordapp.com/attachments/812956551320043523/812957385693724692/latom.jpg");
        IMAGE_COMMANDS.put("doa", "https://cdn.discordapp.com/attachments/812956551320043523/812957385693724692/latom.jpg");
        IMAGE_COMMANDS.put("amin", "https://cdn.discordapp.com/attachments/812956551320043523/812957385693724692/latom.jpg");
        IMAGE_COMMANDS.put("fubuki", "https://i.imgur.com/RYaGIq4.jpg");
        IMAGE_COMMANDS.put("fukuki", "https://i.imgur.com/RYaGIq4.jpg");
        IMAGE_COMMANDS.put("manual", "https://i.imgur.com/RYaGIq4.jpg");
        IMAGE_COMMANDS.put("jodoh", "https://i.imgur.com/ZQH4VqE.png");
        IMAGE_COMMANDS.put("sarjana", "https://i.imgur.com/ysXA7Kt.png");
        IMAGE_COMMANDS.put("ekonomi", "https://i.imgur.com/ysXA7Kt.png");
        IMAGE_COMMANDS.put("goblok", "https://cdn.discordapp.com/attachments/734394269871112212/843443030618669086/FB_IMG_1621162736987.jpg");
        IMAGE_COMMANDS.put("goblog", "https://cdn.discordapp.com/attachments/734394269871112212/843443030618669086/FB_IMG_1621162736987.jpg");
        IMAGE_COMMANDS.put("tomay", "https://i.imgur.com/L7VBJ8o.png");
        IMAGE_COMMANDS.put("tomat", "https://i.imgur.com/L7VBJ8o.png");
        IMAGE_COMMANDS.put("nabung", "https://i.imgur.com/93vMbPt.jpg");
        IMAGE_COMMANDS.put("taat", "https://i.imgur.com/XQzl6xr.jpg");
        IMAGE_COMMANDS.put("aturan", "https://i.imgur.com/XQzl6xr.jpg");
        IMAGE_COMMANDS.put("pagi", "https://i.imgur.com/stlnppa.jpg");
        IMAGE_COMMANDS.put("toxic", "https://i.imgur.com/zQeVSLN.jpg");
        IMAGE_COMMANDS.put("toksik", "https://i.imgur.com/zQeVSLN.jpg");
        IMAGE_COMMANDS.put("yes", "https://i.imgur.com/7v81o2C.png");
        IMAGE_COMMANDS.put("kuota", "https://i.imgur.com/LUCMJjI.jpg");
        IMAGE_COMMANDS.put("hamil", "https://i.imgur.com/rwStWn1.jpg");
        IMAGE_COMMANDS.put("kubus", "https://i.imgur.com/PA9sGAi.jpg");
        IMAGE_COMMANDS.put("kunus", "https://i.imgur.com/PA9sGAi.jpg");
        IMAGE_COMMANDS.put("biadam", "https://i.imgur.com/TrJzcPj.jpg");
        IMAGE_COMMANDS.put("ampas", "https://cdn.discordapp.com/attachments/812956551320043523/993522747516923984/ea.jpg");
        IMAGE_COMMANDS.put("emek", "https://i.imgur.com/vJnY6LS.jpg");
        IMAGE_COMMANDS.put("hantu", "https://i.imgur.com/dk6b6ak.jpg");
        IMAGE_COMMANDS.put("terhura", "https://i.imgur.com/cSdTyIX.jpg");
        IMAGE_COMMANDS.put("terharu", "https://i.imgur.com/cSdTyIX.jpg");
        IMAGE_COMMANDS.put("fendet", "https://i.imgur.com/BGogDHX.png");
        IMAGE_COMMANDS.put("gender", "https://i.imgur.com/BGogDHX.png");
        IMAGE_COMMANDS.put("capek", "https://i.imgur.com/oYtmhXI.png");
        IMAGE_COMMANDS.put("kecoa", "https://i.imgur.com/R1Ckzhp.jpg");
        IMAGE_COMMANDS.put("crot", "https://i.imgur.com/MGr6NwS.jpg");
        IMAGE_COMMANDS.put("mulai", "https://i.imgur.com/7qCr48S.jpg");
        IMAGE_COMMANDS.put("lah", "https://i.imgur.com/qwSuqo8.jpg");
        IMAGE_COMMANDS.put("ngatur", "https://i.imgur.com/qwSuqo8.jpg");
        IMAGE_COMMANDS.put("monthly", "https://i.imgur.com/Lsc5npu.jpg");
        IMAGE_COMMANDS.put("dokter", "https://i.imgur.com/f10pqB9.png");
        IMAGE_COMMANDS.put("konjol", "https://i.imgur.com/AGKYzvn.jpg");
        IMAGE_COMMANDS.put("laksek", "https://i.imgur.com/RkwVqZN.png");
        IMAGE_COMMANDS.put("ngambek", "https://cdn.discordapp.com/attachments/812956551320043523/1190135824059220039/image.png");
        IMAGE_COMMANDS.put("ketua", "https://i.imgur.com/CGBZ7Cd.jpg");
        IMAGE_COMMANDS.put("segar", "https://i.imgur.com/bVAAE6z.png");
        IMAGE_COMMANDS.put("hak", "https://i.imgur.com/omKfthb.jpg");
        IMAGE_COMMANDS.put("curhat", "https://i.imgur.com/RvNV9iw.jpg");
        IMAGE_COMMANDS.put("nasgor", "https://i.imgur.com/8H2mvQt.png");
        IMAGE_COMMANDS.put("gaguna", "https://i.imgur.com/1Ymuesg.jpg");
        IMAGE_COMMANDS.put("ngontol", "https://i.imgur.com/tskBuZZ.jpg");
        IMAGE_COMMANDS.put("selaw", "https://i.imgur.com/lHpz4Nw.png");
        IMAGE_COMMANDS.put("kekar", "https://i.imgur.com/YbxKWD5.jpg");
        IMAGE_COMMANDS.put("geh", "https://i.imgur.com/GNE5YLZ.jpg");
        IMAGE_COMMANDS.put("dildo", "https://i.imgur.com/rYYtJte.jpg");
        IMAGE_COMMANDS.put("telat", "https://cdn.discordapp.com/attachments/812956551320043523/993358037958017104/ea.jpg");
        IMAGE_COMMANDS.put("ngeri", "https://i.imgur.com/92Mcvo9.jpg");
        IMAGE_COMMANDS.put("achievement", "https://i.imgur.com/smNRG6C.jpg");
        IMAGE_COMMANDS.put("achivmen", "https://i.imgur.com/smNRG6C.jpg");
        IMAGE_COMMANDS.put("acivmen", "https://i.imgur.com/smNRG6C.jpg");
        IMAGE_COMMANDS.put("acimen", "https://i.imgur.com/smNRG6C.jpg");
        IMAGE_COMMANDS.put("percaya", "https://cdn.discordapp.com/attachments/734394376888778873/826372947186810920/PicsArt_03-30-03.30.57.jpg");
        IMAGE_COMMANDS.put("gay", "https://cdn.discordapp.com/attachments/812956551320043523/813066848529547279/gay.png");
        IMAGE_COMMANDS.put("sunat", "https://cdn.discordapp.com/attachments/812956551320043523/813066885855182902/sunat.jpg");
        IMAGE_COMMANDS.put("hujat", "https://cdn.discordapp.com/attachments/812956551320043523/813066855240433664/hujat.jpg");
        IMAGE_COMMANDS.put("tt", "https://cdn.discordapp.com/attachments/812956551320043523/813066895607070770/tt.jpg");
        IMAGE_COMMANDS.put("tete", "https://cdn.discordapp.com/attachments/812956551320043523/813066895607070770/tt.jpg");
        IMAGE_COMMANDS.put("pride", "https://cdn.discordapp.com/attachments/812956551320043523/813066841189908480/ayaka.jpg");
        IMAGE_COMMANDS.put("jaog", "https://cdn.discordapp.com/attachments/812956551320043523/813066861365166090/jaog.jpg");
        IMAGE_COMMANDS.put("jago", "https://cdn.discordapp.com/attachments/812956551320043523/813066861365166090/jaog.jpg");
        IMAGE_COMMANDS.put("ampun", "https://cdn.discordapp.com/attachments/812956551320043523/813066861365166090/jaog.jpg");
        IMAGE_COMMANDS.put("seram", "https://cdn.discordapp.com/attachments/812956551320043523/813066861365166090/jaog.jpg");
        IMAGE_COMMANDS.put("sram", "https://cdn.discordapp.com/attachments/812956551320043523/813066861365166090/jaog.jpg");
        IMAGE_COMMANDS.put("sramz", "https://cdn.discordapp.com/attachments/812956551320043523/813066861365166090/jaog.jpg");
        IMAGE_COMMANDS.put("melas", "https://cdn.discordapp.com/attachments/812956551320043523/813066866671091782/melas.png");
        IMAGE_COMMANDS.put("tau", "https://cdn.discordapp.com/attachments/812956551320043523/813066890779688960/tau.jpg");
        IMAGE_COMMANDS.put("retry", "https://cdn.discordapp.com/attachments/812956551320043523/813066880113311784/retry.png");
        IMAGE_COMMANDS.put("tetty", "https://cdn.discordapp.com/attachments/812956551320043523/813066880113311784/retry.png");
        IMAGE_COMMANDS.put("gangbang", "https://cdn.discordapp.com/attachments/812956551320043523/813786373168300112/gangbang.jpg");
        IMAGE_COMMANDS.put("isep", "https://cdn.discordapp.com/attachments/812956551320043523/815482469054152765/isep.jpg");
        IMAGE_COMMANDS.put("faisal", "https://cdn.discordapp.com/attachments/764373155313221632/816282025035038741/1614586954843.png");
        IMAGE_COMMANDS.put("jiwan", "https://cdn.discordapp.com/attachments/764373155313221632/816282336614285333/image0.jpg");
        IMAGE_COMMANDS.put("summon", "https://cdn.discordapp.com/attachments/764373155313221632/816283024748314644/IMG_20210302_191658.jpg");
        IMAGE_COMMANDS.put("cium", "https://cdn.discordapp.com/attachments/764373155313221632/816283024748314644/IMG_20210302_191658.jpg");
        IMAGE_COMMANDS.put("pekok", "https://cdn.discordapp.com/attachments/764373155313221632/816284996070932510/1614687894237.jpg");
        IMAGE_COMMANDS.put("sesat", "https://cdn.discordapp.com/attachments/764373155313221632/816286590497194034/20210302_193058.jpg");
        IMAGE_COMMANDS.put("nyimak", "https://cdn.discordapp.com/attachments/764373155313221632/816290405904809984/IMG_20210302_194617.jpg");
        IMAGE_COMMANDS.put("hode", "https://cdn.discordapp.com/attachments/764373155313221632/816294027610816532/IMG_20210302_200045.jpg");
        IMAGE_COMMANDS.put("canda", "https://cdn.discordapp.com/attachments/764373155313221632/816295627696373770/IMG_20210302_200655.jpg");
        IMAGE_COMMANDS.put("hdmi", "https://cdn.discordapp.com/attachments/812956551320043523/816300441687556096/ea.jpg");
        IMAGE_COMMANDS.put("pece", "https://cdn.discordapp.com/attachments/764373155313221632/816301885816438784/unknown.png");
        IMAGE_COMMANDS.put("babi", "https://cdn.discordapp.com/attachments/812956551320043523/966013228750614608/ea.jpg");
        IMAGE_COMMANDS.put("om", "https://cdn.discordapp.com/attachments/764373155313221632/819101058785476618/20210310_135454.jpg");
        IMAGE_COMMANDS.put("gapeduli", "https://cdn.discordapp.com/attachments/764373155313221632/816303633414488125/nobodycares.png");
        IMAGE_COMMANDS.put("bomat", "https://cdn.discordapp.com/attachments/764373155313221632/816303633414488125/nobodycares.png");
        IMAGE_COMMANDS.put("pervert", "https://cdn.discordapp.com/attachments/764373155313221632/817224265181954078/IMG_20210305_093616.jpg");
        IMAGE_COMMANDS.put("perv", "https://cdn.discordapp.com/attachments/764373155313221632/817224265181954078/IMG_20210305_093616.jpg");
        IMAGE_COMMANDS.put("atitut", "https://cdn.discordapp.com/attachments/764373155313221632/818175381147222036/PicsArt_03-08-12.34.22.jpg");
        IMAGE_COMMANDS.put("bandara", "https://cdn.discordapp.com/attachments/734258297145917461/818306161387372554/unknown.png");
        IMAGE_COMMANDS.put("barbara", "https://cdn.discordapp.com/attachments/734258297145917461/818306161387372554/unknown.png");
        IMAGE_COMMANDS.put("barabata", "https://cdn.discordapp.com/attachments/734258297145917461/818306161387372554/unknown.png");
        IMAGE_COMMANDS.put("gei", "https://cdn.discordapp.com/attachments/764373155313221632/818461450599137330/unknown.png");
        IMAGE_COMMANDS.put("chongyun", "https://cdn.discordapp.com/attachments/764373155313221632/818466143232458762/Screenshot_20210308-194845_Discord.jpg");
        IMAGE_COMMANDS.put("chong", "https://cdn.discordapp.com/attachments/764373155313221632/818466143232458762/Screenshot_20210308-194845_Discord.jpg");
        IMAGE_COMMANDS.put("tusuk", "https://cdn.discordapp.com/attachments/764373155313221632/818471616421036042/436649.jpg");
        IMAGE_COMMANDS.put("psikopat", "https://cdn.discordapp.com/attachments/734394376888778873/818704546750005278/unknown.png");
        IMAGE_COMMANDS.put("psokopay", "https://cdn.discordapp.com/attachments/734394376888778873/818704546750005278/unknown.png");
        IMAGE_COMMANDS.put("mention", "https://cdn.discordapp.com/attachments/764373155313221632/819087117341949962/image0.png");
        IMAGE_COMMANDS.put("nyambung", "https://cdn.discordapp.com/attachments/764373155313221632/819094092616957972/Screenshot_20210310-132721_Discord.jpg");
        IMAGE_COMMANDS.put("harem", "https://cdn.discordapp.com/attachments/812956551320043523/819097171991330836/ea.jpg");
        IMAGE_COMMANDS.put("ocincin", "https://cdn.discordapp.com/attachments/797114259149553724/819266433770455070/unknown.png");
        IMAGE_COMMANDS.put("mabar", "https://cdn.discordapp.com/attachments/764373155313221632/819444604755509288/IMG_20210311_123853.jpg");
        IMAGE_COMMANDS.put("npc", "https://cdn.discordapp.com/attachments/764373155313221632/821556220396961812/IMG_20210317_083051.jpg");
        IMAGE_COMMANDS.put("lupa", "https://cdn.discordapp.com/attachments/764373155313221632/822465593386336266/Screenshot_20210319-204356_Discord.jpg");
        IMAGE_COMMANDS.put("hadeh", "https://cdn.discordapp.com/attachments/764373155313221632/823498835527073812/362009.jpg");
        IMAGE_COMMANDS.put("ngantuk", "https://cdn.discordapp.com/attachments/764373155313221632/824117155217670174/Screenshot_20210324-100619_LINE.jpg");
        IMAGE_COMMANDS.put("klee", "https://cdn.discordapp.com/attachments/734388695049830470/832991412701626428/FB_IMG_1606374231893.jpg");
        IMAGE_COMMANDS.put("leyline", "https://cdn.discordapp.com/attachments/812956551320043523/1053561890296582195/ea.jpg");
        IMAGE_COMMANDS.put("salto", "https://cdn.discordapp.com/attachments/734258297145917461/834549559412654080/IMG_20210422_044835.jpg");
        IMAGE_COMMANDS.put("yuri", "https://cdn.discordapp.com/attachments/734258297145917461/839476132407410718/unknown.png");
        IMAGE_COMMANDS.put("hirji", "https://cdn.discordapp.com/attachments/734258297145917461/844136738570108928/unknown.png");
        IMAGE_COMMANDS.put("horny", "https://cdn.discordapp.com/attachments/734258297145917461/844136738570108928/unknown.png");
        IMAGE_COMMANDS.put("miskin", "https://cdn.discordapp.com/attachments/764373155313221632/846597982433837076/IMG_20210521_200731.jpg");
        IMAGE_COMMANDS.put("dompet", "https://cdn.discordapp.com/attachments/734388695049830470/848847011725836308/PicsArt_05-31-03.54.46.jpg");
        IMAGE_COMMANDS.put("konglol", "https://cdn.discordapp.com/attachments/734387450960412672/848870259128664094/PicsArt_05-31-05.26.33.jpg");
        IMAGE_COMMANDS.put("typo", "https://cdn.discordapp.com/attachments/734258297145917461/850008387658973194/unknown.png");
        IMAGE_COMMANDS.put("tipo", "https://cdn.discordapp.com/attachments/734258297145917461/850008387658973194/unknown.png");
        IMAGE_COMMANDS.put("gem", "https://cdn.discordapp.com/attachments/734388021620637716/851424087430397952/unknown.png");
        IMAGE_COMMANDS.put("wawasan", "https://cdn.discordapp.com/attachments/734258297145917461/854270787816128542/IMG_20210615_150654.jpg");
        IMAGE_COMMANDS.put("ss", "https://cdn.discordapp.com/attachments/734388695049830470/854617477493555220/ea.jpg");
        IMAGE_COMMANDS.put("yanfei", "https://cdn.discordapp.com/attachments/764373155313221632/854649566933680138/image0.jpg");
        IMAGE_COMMANDS.put("ayaka", "https://cdn.discordapp.com/attachments/764373155313221632/855996445190914048/149301307_3710108195708879_1620994372999686783_n.jpg");
        IMAGE_COMMANDS.put("kalah", "https://cdn.discordapp.com/attachments/734258297145917461/856003732344143872/IMG_20210620_105233.jpg");
        IMAGE_COMMANDS.put("genshin", "https://cdn.discordapp.com/attachments/734388695049830470/858930382670135307/unknown.png");
        IMAGE_COMMANDS.put("mengheningkan", "https://cdn.discordapp.com/attachments/734258297145917461/859947294273830932/unknown.png");
        IMAGE_COMMANDS.put("coklat", "https://cdn.discordapp.com/attachments/734258297145917461/860859650870083594/unknown.png");
        IMAGE_COMMANDS.put("keju", "https://cdn.discordapp.com/attachments/734258297145917461/860859650870083594/unknown.png");
        IMAGE_COMMANDS.put("saoi", "https://cdn.discordapp.com/attachments/734258297145917461/860863398705889310/IMG_20210703_204326.jpg");
        IMAGE_COMMANDS.put("update", "https://cdn.discordapp.com/attachments/729552134663831622/863344486012289084/unknown.png");
        IMAGE_COMMANDS.put("berak", "https://cdn.discordapp.com/attachments/734258297145917461/863367437021478912/unknown.png");
        IMAGE_COMMANDS.put("beraq", "https://cdn.discordapp.com/attachments/734258297145917461/863367437021478912/unknown.png");
        IMAGE_COMMANDS.put("jumatan", "https://cdn.discordapp.com/attachments/734258297145917461/863367301411242004/Screenshot_20210709114010.png");
        IMAGE_COMMANDS.put("laku", "https://cdn.discordapp.com/attachments/734258297145917461/862941469140713492/IMG_20210709_142103.jpg");
        IMAGE_COMMANDS.put("onat", "https://cdn.discordapp.com/attachments/734258297145917461/866655312164421633/unknown.png");
        IMAGE_COMMANDS.put("opini", "https://cdn.discordapp.com/attachments/734258297145917461/868751512082477096/FB_IMG_1627196888040.jpg");
        IMAGE_COMMANDS.put("perjaka", "https://cdn.discordapp.com/attachments/734394269871112212/872106867277561886/IMG_20210803_172303.jpg");
        IMAGE_COMMANDS.put("anal", "https://cdn.discordapp.com/attachments/734258297145917461/872493799014813706/unknown.png");
        IMAGE_COMMANDS.put("jelata", "https://cdn.discordapp.com/attachments/734258297145917461/877355694481891379/unknown.png");
        IMAGE_COMMANDS.put("baper", "https://cdn.discordapp.com/attachments/734388695049830470/877372182051835954/IMG_20210818_100330.jpg");
        IMAGE_COMMANDS.put("laper", "https://cdn.discordapp.com/attachments/734388695049830470/877372182051835954/IMG_20210818_100330.jpg");
        IMAGE_COMMANDS.put("bobi", "https://cdn.discordapp.com/attachments/734388695049830470/882179034937692162/unknown.png");
        IMAGE_COMMANDS.put("nguli", "https://cdn.discordapp.com/attachments/812956551320043523/993859407370792960/ea.jpg");
        IMAGE_COMMANDS.put("benar", "https://cdn.discordapp.com/attachments/734258297145917461/888037070080188476/Screenshot_2021_0916_202204.png");
        IMAGE_COMMANDS.put("ngocok", "https://cdn.discordapp.com/attachments/878668202048102410/889024368557051974/IMG_20210916_104219.jpg");
        IMAGE_COMMANDS.put("insekyur", "https://cdn.discordapp.com/attachments/890134926903627836/890180736630554634/1615600537455.jpg");
        IMAGE_COMMANDS.put("sopan", "https://cdn.discordapp.com/attachments/778481550701494302/890521190437900298/ea.jpg");
        IMAGE_COMMANDS.put("gacha", "https://cdn.discordapp.com/attachments/812956551320043523/994279002044899378/ea.jpg");
        IMAGE_COMMANDS.put("kimpeha", "https://cdn.discordapp.com/attachments/764373155313221632/905741843893981224/Untitled10_20211104155435.png");
        IMAGE_COMMANDS.put("tag", "https://cdn.discordapp.com/attachments/734388021620637716/895248598252519454/IMG_20211006_165748.jpg");
        IMAGE_COMMANDS.put("ceplok", "https://cdn.discordapp.com/attachments/734394269871112212/900597457178738748/IMG_20211021_111224.jpg");
        IMAGE_COMMANDS.put("nenen", "https://cdn.discordapp.com/attachments/829733282799026197/905446922347765761/received_259481762726523.jpeg");
        IMAGE_COMMANDS.put("monyet", "https://cdn.discordapp.com/attachments/734258297145917461/914101847822835794/Screenshot_20211127_183413.jpg");
        IMAGE_COMMANDS.put("henceut", "https://cdn.discordapp.com/attachments/764373155313221632/919226119654359122/unknown.png");
        IMAGE_COMMANDS.put("fetis", "https://cdn.discordapp.com/attachments/734394269871112212/924583623812849664/IMG_20211226_154507.jpg");
        IMAGE_COMMANDS.put("fetish", "https://cdn.discordapp.com/attachments/734394269871112212/924583623812849664/IMG_20211226_154507.jpg");
        IMAGE_COMMANDS.put("yoga", "https://cdn.discordapp.com/attachments/734394269871112212/924613777905811486/PicsArt_12-25-08.27.24.jpg");
        IMAGE_COMMANDS.put("kaya", "https://cdn.discordapp.com/attachments/734258297145917461/927839568147914792/unknown.png");
        IMAGE_COMMANDS.put("hayo", "https://cdn.discordapp.com/attachments/812956551320043523/937194253199765524/hayo_ngapain_pegang_tytyd.png");
        IMAGE_COMMANDS.put("lemah", "https://cdn.discordapp.com/attachments/734388695049830470/939040257456877628/IMG_20220204_105141.jpg");
        IMAGE_COMMANDS.put("mending", "https://cdn.discordapp.com/attachments/734388695049830470/941652603924803604/IMG_20220211_191111.jpg");
        IMAGE_COMMANDS.put("sore", "https://cdn.discordapp.com/attachments/734388695049830470/942721744563748885/IMG_20220214_175934.jpg");
        IMAGE_COMMANDS.put("cuma", "https://cdn.discordapp.com/attachments/734388695049830470/942727055789932644/IMG_20220214_182037.jpg");
        IMAGE_COMMANDS.put("burung", "https://cdn.discordapp.com/attachments/812956551320043523/949690853570543626/ea.jpg");
        IMAGE_COMMANDS.put("sedih", "https://cdn.discordapp.com/attachments/734258297145917461/956429287483928686/Screenshot_20220324-124825_Discord.jpg");
        IMAGE_COMMANDS.put("swdoj", "https://cdn.discordapp.com/attachments/734258297145917461/956429287483928686/Screenshot_20220324-124825_Discord.jpg");
        IMAGE_COMMANDS.put("elus", "https://cdn.discordapp.com/attachments/734258297145917461/956714223973572648/IMG_20220325_083529.jpg");
        IMAGE_COMMANDS.put("bohong", "https://cdn.discordapp.com/attachments/734388021620637716/961120770195591168/20220403_045258.jpg");
        IMAGE_COMMANDS.put("anjay", "https://cdn.discordapp.com/attachments/812956551320043523/961127445661102090/WhatsApp_Image_2022-04-03_at_12.56.39.jpeg");
        IMAGE_COMMANDS.put("shap", "https://cdn.discordapp.com/attachments/812956551320043523/962278913629884446/shap.png");
        IMAGE_COMMANDS.put("siap", "https://cdn.discordapp.com/attachments/812956551320043523/962278913629884446/shap.png");
        IMAGE_COMMANDS.put("duit", "https://cdn.discordapp.com/attachments/812956551320043523/965436153807396914/saya_butuh_1_triliyun.png");
        IMAGE_COMMANDS.put("duid", "https://cdn.discordapp.com/attachments/812956551320043523/965436153807396914/saya_butuh_1_triliyun.png");
        IMAGE_COMMANDS.put("darimana", "https://cdn.discordapp.com/attachments/812956551320043523/965436154096787496/dari_mana_duitnya.png");
        IMAGE_COMMANDS.put("kangen", "https://cdn.discordapp.com/attachments/734258297145917461/967415095359598702/unknown.png");
        IMAGE_COMMANDS.put("sipaling", "https://cdn.discordapp.com/attachments/812956551320043523/967732803682861056/si_paling.jpg");
        IMAGE_COMMANDS.put("dek", "https://cdn.discordapp.com/attachments/812956551320043523/968141974408429628/ea.jpg");
        IMAGE_COMMANDS.put("titit", "https://cdn.discordapp.com/attachments/734258297145917461/915094378219962398/Screenshot_20211130_121810.jpg");
        IMAGE_COMMANDS.put("titid", "https://cdn.discordapp.com/attachments/734258297145917461/915094378219962398/Screenshot_20211130_121810.jpg");
        IMAGE_COMMANDS.put("tovat", "https://cdn.discordapp.com/attachments/734394269871112212/970332519113310278/unknown.png");
        IMAGE_COMMANDS.put("banjir", "https://cdn.discordapp.com/attachments/812956551320043523/974288175440732170/download.png");
        IMAGE_COMMANDS.put("fakta", "https://cdn.discordapp.com/attachments/812956551320043523/974288175440732170/download.png");
        IMAGE_COMMANDS.put("fanta", "https://cdn.discordapp.com/attachments/812956551320043523/974288175440732170/download.png");
        IMAGE_COMMANDS.put("jelek", "https://cdn.discordapp.com/attachments/812956551320043523/974606472178708480/ea.jpg");
        IMAGE_COMMANDS.put("eregsi", "https://cdn.discordapp.com/attachments/734258297145917461/974942113047400488/FB_IMG_1651926127570.jpg");
        IMAGE_COMMANDS.put("off", "https://cdn.discordapp.com/attachments/734258297145917461/974942113047400488/FB_IMG_1651926127570.jpg");
        IMAGE_COMMANDS.put("tidur", "https://cdn.discordapp.com/attachments/734394269871112212/975781586085773312/Screenshot_2022-05-16-22-26-53-173_com.discord2.jpg");
        IMAGE_COMMANDS.put("mantap", "https://cdn.discordapp.com/attachments/829733282799026197/978259834036166726/IMG_20220523_183500.jpg");
        IMAGE_COMMANDS.put("cnuy", "https://cdn.discordapp.com/attachments/734394330562953259/978535525323522048/FB_IMG_1653012645413.jpg");
        IMAGE_COMMANDS.put("enak", "https://cdn.discordapp.com/attachments/734258297145917461/979348978653073488/unknown.png");
        IMAGE_COMMANDS.put("bagus", "https://cdn.discordapp.com/attachments/829733282799026197/979643188367216640/20220527_141201.jpg");
        IMAGE_COMMANDS.put("masuk", "https://cdn.discordapp.com/attachments/829733282799026197/981138451594350592/20220531_171327.jpg");
        IMAGE_COMMANDS.put("anjim", "https://cdn.discordapp.com/attachments/812956551320043523/981836591007957043/FB_IMG_1654153064442.jpg");
        IMAGE_COMMANDS.put("cina", "https://cdn.discordapp.com/attachments/734394269871112212/982955981224947742/unknown.png");
        IMAGE_COMMANDS.put("tusbol", "https://cdn.discordapp.com/attachments/812956551320043523/983667439827034182/ea.jpg");
        IMAGE_COMMANDS.put("ewe", "https://cdn.discordapp.com/attachments/734388695049830470/989732963929428018/unknown.png");
        IMAGE_COMMANDS.put("eue", "https://cdn.discordapp.com/attachments/734388695049830470/989732963929428018/unknown.png");
        IMAGE_COMMANDS.put("kentu", "https://cdn.discordapp.com/attachments/734388021620637716/993076213436391535/IMG_20220702_180656.jpg");
        IMAGE_COMMANDS.put("hijau", "https://cdn.discordapp.com/attachments/812956551320043523/996039773582000218/ea.jpg");
        IMAGE_COMMANDS.put("gitar", "https://cdn.discordapp.com/attachments/812956551320043523/999342727596613802/IMG_20220720_173557.jpg");
        IMAGE_COMMANDS.put("encok", "https://cdn.discordapp.com/attachments/812956551320043523/1000732805954818171/ea.jpeg");
        IMAGE_COMMANDS.put("tingkahmu", "https://cdn.discordapp.com/attachments/812956551320043523/1003130089455755305/ea.jpg");
        IMAGE_COMMANDS.put("mobil", "https://cdn.discordapp.com/attachments/812956551320043523/1004746674700304474/ea.jpg");
        IMAGE_COMMANDS.put("gigit", "https://cdn.discordapp.com/attachments/812956551320043523/1004749569210462288/ea.jpg");
        IMAGE_COMMANDS.put("lengah", "https://cdn.discordapp.com/attachments/812956551320043523/1010229815862898749/ea.png");
        IMAGE_COMMANDS.put("legion", "https://cdn.discordapp.com/attachments/812956551320043523/1010939241410334750/ea.jpg");
        IMAGE_COMMANDS.put("muak", "https://cdn.discordapp.com/attachments/812956551320043523/1017394620075876372/gw_udah_muak.jpg");
        IMAGE_COMMANDS.put("tolak", "https://cdn.discordapp.com/attachments/812956551320043523/1018698872589140059/ea.jpg");
        IMAGE_COMMANDS.put("hoki", "https://cdn.discordapp.com/attachments/812956551320043523/1021084087328460890/ea.jpg");
        IMAGE_COMMANDS.put("pendek", "https://cdn.discordapp.com/attachments/812956551320043523/1021367903855050803/ea.jpg");
        IMAGE_COMMANDS.put("f2p", "https://cdn.discordapp.com/attachments/812956551320043523/1021742091325411408/ea.jpg");
        IMAGE_COMMANDS.put("bisa", "https://cdn.discordapp.com/attachments/812956551320043523/1021744561179078706/ea.jpg");
        IMAGE_COMMANDS.put("membuahi", "https://cdn.discordapp.com/attachments/812956551320043523/1021745724070834226/ea.jpg");
        IMAGE_COMMANDS.put("dana", "https://cdn.discordapp.com/attachments/812956551320043523/1022087612988669962/ea.png");
        IMAGE_COMMANDS.put("gila", "https://cdn.discordapp.com/attachments/812956551320043523/1022157397168488448/ea.jpg");
        IMAGE_COMMANDS.put("baik", "https://cdn.discordapp.com/attachments/812956551320043523/1022184130089340948/ea.jpg");
        IMAGE_COMMANDS.put("khunul", "https://cdn.discordapp.com/attachments/812956551320043523/1022395661976604693/ea.jpg");
        IMAGE_COMMANDS.put("rog", "https://cdn.discordapp.com/attachments/812956551320043523/1023230952748617838/ea.jpg");
        IMAGE_COMMANDS.put("ngentod", "https://cdn.discordapp.com/attachments/812956551320043523/1023990996645712052/ea.png");
        IMAGE_COMMANDS.put("ngentot", "https://cdn.discordapp.com/attachments/812956551320043523/1023990996645712052/ea.png");
        IMAGE_COMMANDS.put("monly", "https://cdn.discordapp.com/attachments/812956551320043523/1024336460553408573/ea.jpg");
        IMAGE_COMMANDS.put("50k", "https://cdn.discordapp.com/attachments/812956551320043523/1024336460977016953/eaea.jpg");
        IMAGE_COMMANDS.put("tri", "https://cdn.discordapp.com/attachments/812956551320043523/1024530261498671114/ea.jpg");
        IMAGE_COMMANDS.put("anjing", "https://cdn.discordapp.com/attachments/812956551320043523/1024531326709284894/ea.jpg");
        IMAGE_COMMANDS.put("anjg", "https://cdn.discordapp.com/attachments/812956551320043523/1024531326709284894/ea.jpg");
        IMAGE_COMMANDS.put("ajg", "https://cdn.discordapp.com/attachments/812956551320043523/1024531326709284894/ea.jpg");
        IMAGE_COMMANDS.put("anj", "https://cdn.discordapp.com/attachments/812956551320043523/1024531326709284894/ea.jpg");
        IMAGE_COMMANDS.put("wibu", "https://cdn.discordapp.com/attachments/812956551320043523/1025956267518333058/ea.png");
        IMAGE_COMMANDS.put("lucu", "https://cdn.discordapp.com/attachments/812956551320043523/1026148077221974136/ea.jpg");
        IMAGE_COMMANDS.put("susu", "https://cdn.discordapp.com/attachments/812956551320043523/1027191091058987149/ea.png");
        IMAGE_COMMANDS.put("login", "https://cdn.discordapp.com/attachments/812956551320043523/1027943455651008562/ea.png");
        IMAGE_COMMANDS.put("pegal", "https://cdn.discordapp.com/attachments/812956551320043523/1031408862877716500/ea.jpg");
        IMAGE_COMMANDS.put("kihomo", "https://cdn.discordapp.com/attachments/812956551320043523/1033383911687979099/ea.jpg");
        IMAGE_COMMANDS.put("3jt", "https://cdn.discordapp.com/attachments/812956551320043523/1037938614732083250/ea.jpg");
        IMAGE_COMMANDS.put("dev", "https://cdn.discordapp.com/attachments/812956551320043523/1039379953038413844/ea.png");
        IMAGE_COMMANDS.put("fandom", "https://cdn.discordapp.com/attachments/812956551320043523/1039379953038413844/ea.png");
        IMAGE_COMMANDS.put("rasakan", "https://cdn.discordapp.com/attachments/812956551320043523/1043019515665064027/ohyarasakan-ganjar.gif");
        IMAGE_COMMANDS.put("malas", "https://cdn.discordapp.com/attachments/812956551320043523/1040548380713168926/eaea.jpg");
        IMAGE_COMMANDS.put("jokowi", "https://cdn.discordapp.com/attachments/812956551320043523/1044927134940024842/ea.jpg");
        IMAGE_COMMANDS.put("umam", "https://cdn.discordapp.com/attachments/812956551320043523/1048419919332655134/ea.png");
        IMAGE_COMMANDS.put("hooh", "https://cdn.discordapp.com/attachments/812956551320043523/1052129236271509524/hooh.gif");
        IMAGE_COMMANDS.put("permen", "https://cdn.discordapp.com/attachments/812956551320043523/1054961968391397436/ea.png");
        IMAGE_COMMANDS.put("tergantung", "https://cdn.discordapp.com/attachments/812956551320043523/1057358476877250601/ea.jpg");
        IMAGE_COMMANDS.put("favorit", "https://cdn.discordapp.com/attachments/812956551320043523/1059640308830306344/ea.png");
        IMAGE_COMMANDS.put("kasihan", "https://cdn.discordapp.com/attachments/812956551320043523/1060407233705418872/gadaakhlak-upin-ipin.gif");
        IMAGE_COMMANDS.put("jagoan", "https://cdn.discordapp.com/attachments/812956551320043523/1062734576658694205/ea.jpeg");
        IMAGE_COMMANDS.put("sunda", "https://cdn.discordapp.com/attachments/812956551320043523/1064456943747481630/ea.png");
        IMAGE_COMMANDS.put("waduh", "https://cdn.discordapp.com/attachments/812956551320043523/1064500329695162479/eaea.jpg");
        IMAGE_COMMANDS.put("dahulu", "https://cdn.discordapp.com/attachments/812956551320043523/1066016551704215672/ea.png");
        IMAGE_COMMANDS.put("slow", "https://cdn.discordapp.com/attachments/812956551320043523/1066320786404671548/ea.png");
        IMAGE_COMMANDS.put("pergi", "https://cdn.discordapp.com/attachments/812956551320043523/1064502374829408366/ea.png");
        IMAGE_COMMANDS.put("ada", "https://cdn.discordapp.com/attachments/812956551320043523/1064502375160762379/adaadasaja.jpg");
        IMAGE_COMMANDS.put("pepek", "https://cdn.discordapp.com/attachments/812956551320043523/1066628517644746812/ea.jpg");
        IMAGE_COMMANDS.put("udah", "https://cdn.discordapp.com/attachments/812956551320043523/1072751258651344947/ea.jpg");
        IMAGE_COMMANDS.put("iya", "https://cdn.discordapp.com/attachments/812956551320043523/1220671296350720101/432923708_285450184587483_3633676558330917373_n.png?ex=660fc9bc&is=65fd54bc&hm=5e3440f1cf9b3f3a38eea59e5bfbb318d34a4264c5fd441c5e14bdf4113fdad6&");
        IMAGE_COMMANDS.put("tolong", "https://cdn.discordapp.com/attachments/812956551320043523/1073088909359206400/eaea.jpg");
        IMAGE_COMMANDS.put("salam", "https://cdn.discordapp.com/attachments/812956551320043523/1073089019090571294/ea.jpg");
        IMAGE_COMMANDS.put("santai", "https://cdn.discordapp.com/attachments/812956551320043523/1077439434527604826/eaea.jpg");
        IMAGE_COMMANDS.put("keren", "https://cdn.discordapp.com/attachments/812956551320043523/1077441034335826050/eaea.png");
        IMAGE_COMMANDS.put("asu", "https://cdn.discordapp.com/attachments/812956551320043523/1077828828698779698/ea.png");
        IMAGE_COMMANDS.put("nanya", "https://cdn.discordapp.com/attachments/812956551320043523/1078480580301295626/ea.jpg");
        IMAGE_COMMANDS.put("gegabah", "https://cdn.discordapp.com/attachments/812956551320043523/1080289100608851998/ea.jpg");
        IMAGE_COMMANDS.put("wleo", "https://cdn.discordapp.com/attachments/812956551320043523/1082588496893583441/ea.jpg");
        IMAGE_COMMANDS.put("mindset", "https://cdn.discordapp.com/attachments/812956551320043523/1085127791760125982/ea.jpg");
        IMAGE_COMMANDS.put("allahu", "https://cdn.discordapp.com/attachments/812956551320043523/1085127792192127056/eaea.jpg");
        IMAGE_COMMANDS.put("kontribusi", "https://cdn.discordapp.com/attachments/812956551320043523/1086816617750605924/ea.jpg");
        IMAGE_COMMANDS.put("prinsip", "https://cdn.discordapp.com/attachments/812956551320043523/1090585308606767224/ea.jpg");
        IMAGE_COMMANDS.put("batang", "https://cdn.discordapp.com/attachments/812956551320043523/1091980692952469554/ea.png");
        IMAGE_COMMANDS.put("mw", "https://cdn.discordapp.com/attachments/812956551320043523/1092351228962418748/aku_jg_mw.jpg");
        IMAGE_COMMANDS.put("like", "https://cdn.discordapp.com/attachments/812956551320043523/1094885231888175144/ea.jpg");
        IMAGE_COMMANDS.put("likes", "https://cdn.discordapp.com/attachments/812956551320043523/1094885231888175144/ea.jpg");
        IMAGE_COMMANDS.put("laiks", "https://cdn.discordapp.com/attachments/812956551320043523/1094885231888175144/ea.jpg");
        IMAGE_COMMANDS.put("sulit", "https://cdn.discordapp.com/attachments/812956551320043523/1095286093680742430/ea.jpg");
        IMAGE_COMMANDS.put("skill", "https://cdn.discordapp.com/attachments/812956551320043523/1095723127826292846/ea.gif");
        IMAGE_COMMANDS.put("ngemut", "https://cdn.discordapp.com/attachments/812956551320043523/1097839553433309255/ea.png");
        IMAGE_COMMANDS.put("bye", "https://cdn.discordapp.com/attachments/812956551320043523/1102908537308446740/ea.jpg");
        IMAGE_COMMANDS.put("eee", "https://cdn.discordapp.com/attachments/812956551320043523/1103250449269792778/eee.png");
        IMAGE_COMMANDS.put("datang", "https://cdn.discordapp.com/attachments/812956551320043523/1107199791563276340/ea.jpg");
        IMAGE_COMMANDS.put("bagaimana", "https://cdn.discordapp.com/attachments/812956551320043523/1107284385650184192/bagaimana_mungkin.png");
        IMAGE_COMMANDS.put("item", "https://cdn.discordapp.com/attachments/812956551320043523/1108243822468673588/ea.jpg");
        IMAGE_COMMANDS.put("logika", "https://cdn.discordapp.com/attachments/812956551320043523/1110901805535219793/ea.jpg");
        IMAGE_COMMANDS.put("cukup", "https://cdn.discordapp.com/attachments/812956551320043523/1111127709309992971/cukub.png");
        IMAGE_COMMANDS.put("cukub", "https://cdn.discordapp.com/attachments/812956551320043523/1111127709309992971/cukub.png");
        IMAGE_COMMANDS.put("ngotak", "https://cdn.discordapp.com/attachments/812956551320043523/1118837165804228730/FB_IMG_1686801965485.png");
        IMAGE_COMMANDS.put("otw", "https://cdn.discordapp.com/attachments/812956551320043523/1369235879016529951/FB_IMG_1732005085801.jpg?ex=6968ab48&is=696759c8&hm=73e2c4f03555550182fade1ca8348c7016100349b180f4bcb2cd0b6c45aa349e&");
        IMAGE_COMMANDS.put("murka", "https://cdn.discordapp.com/attachments/812956551320043523/1121614913010409563/sticker-fan_11861203_o.png");
        IMAGE_COMMANDS.put("tai", "https://cdn.discordapp.com/attachments/812956551320043523/1123216702629490688/IMG-20230627-WA0021.jpg");
        IMAGE_COMMANDS.put("biar", "https://cdn.discordapp.com/attachments/812956551320043523/1127903812506615808/cca2771cd4c97f4236210ad73d8cf88b.jpg");
        IMAGE_COMMANDS.put("ngopi", "https://cdn.discordapp.com/attachments/812956551320043523/1128684352386125874/360086861_1997266183943600_4301115358852948335_n.png");
        IMAGE_COMMANDS.put("dislike", "https://cdn.discordapp.com/attachments/812956551320043523/1134421498896068638/1672227997095.jpg");
        IMAGE_COMMANDS.put("kafka", "https://cdn.discordapp.com/attachments/812956551320043523/1138789292685144114/Screenshot_20230809_175616_Instagram.jpg");
        IMAGE_COMMANDS.put("nyerah", "https://cdn.discordapp.com/attachments/812956551320043523/1144477150091677706/images_7.jpg");
        IMAGE_COMMANDS.put("furry", "https://cdn.discordapp.com/attachments/812956551320043523/1146333927695466506/image.png");
        IMAGE_COMMANDS.put("furi", "https://cdn.discordapp.com/attachments/812956551320043523/1146333927695466506/image.png");
        IMAGE_COMMANDS.put("miaw", "https://cdn.discordapp.com/attachments/812956551320043523/1146707296718688359/FB_IMG_1693245241032.png");
        IMAGE_COMMANDS.put("kau", "https://cdn.discordapp.com/attachments/812956551320043523/1147542768139382896/image0.jpg");
        IMAGE_COMMANDS.put("atmin", "https://cdn.discordapp.com/attachments/812956551320043523/1159843273163153428/atmin.jpg");
        IMAGE_COMMANDS.put("admin", "https://cdn.discordapp.com/attachments/812956551320043523/1159843273163153428/atmin.jpg");
        IMAGE_COMMANDS.put("sepuh", "https://cdn.discordapp.com/attachments/812956551320043523/1164085779232985108/FB_IMG_1697596629491.jpg");
        IMAGE_COMMANDS.put("iwak", "https://cdn.discordapp.com/attachments/812956551320043523/1169581394121465886/IWAK.png");
        IMAGE_COMMANDS.put("kecewa", "https://cdn.discordapp.com/attachments/812956551320043523/1184828302561644574/image.png");
        IMAGE_COMMANDS.put("tewas", "https://cdn.discordapp.com/attachments/812956551320043523/1186162479684919346/image.png");
        IMAGE_COMMANDS.put("besok", "https://cdn.discordapp.com/attachments/812956551320043523/1189493527852363837/FB_IMG_1703431373507.png");
        IMAGE_COMMANDS.put("dipikir", "https://cdn.discordapp.com/attachments/812956551320043523/1190134610487681034/image.png");
        IMAGE_COMMANDS.put("senyum", "https://cdn.discordapp.com/attachments/812956551320043523/1190135300245160037/image.png");
        IMAGE_COMMANDS.put("kesalahan", "https://cdn.discordapp.com/attachments/812956551320043523/1190135499482988555/image.png");
        IMAGE_COMMANDS.put("ketar", "https://cdn.discordapp.com/attachments/812956551320043523/1190135623911231509/image.png");
        IMAGE_COMMANDS.put("ngakak", "https://cdn.discordapp.com/attachments/812956551320043523/1190135554977841152/image.png");
        IMAGE_COMMANDS.put("apcb", "https://cdn.discordapp.com/attachments/812956551320043523/1190135686020481114/image.png");
        IMAGE_COMMANDS.put("menyesal", "https://cdn.discordapp.com/attachments/812956551320043523/1190135766194606180/image.png");
        IMAGE_COMMANDS.put("istigfar", "https://cdn.discordapp.com/attachments/812956551320043523/1190136015319470090/image.png");
        IMAGE_COMMANDS.put("istighfar", "https://cdn.discordapp.com/attachments/812956551320043523/1190136015319470090/image.png");
        IMAGE_COMMANDS.put("liat", "https://cdn.discordapp.com/attachments/812956551320043523/1194117807927988308/IMG_20240103_004740.jpg");
        IMAGE_COMMANDS.put("alhamdulillah", "https://cdn.discordapp.com/attachments/812956551320043523/1205364147965927454/blue-archive-takanashi-hoshino.gif");
        IMAGE_COMMANDS.put("alhamdulilah", "https://cdn.discordapp.com/attachments/812956551320043523/1205364147965927454/blue-archive-takanashi-hoshino.gif");
        IMAGE_COMMANDS.put("penis", "https://cdn.discordapp.com/attachments/812956551320043523/1210207471390425168/FB_IMG_1708600498731.jpg");
        IMAGE_COMMANDS.put("valid", "https://cdn.discordapp.com/attachments/812956551320043523/1220671773234692158/FB_IMG_1711058712910.jpg?ex=660fca2d&is=65fd552d&hm=4a304bfa7a578185b5597f32e277f8fa479e0d7588d2f90873d7c31be046c7a2&");
        IMAGE_COMMANDS.put("yanto", "https://cdn.discordapp.com/attachments/812956551320043523/1222141448913162291/IMG_20240326_122206.png?ex=661522eb&is=6602adeb&hm=f1439cbe459a44662ff9e19a2f3625d047b7eb9e13e6ba499a0cd1d297e5bedb&");
        IMAGE_COMMANDS.put("ngomong", "https://cdn.discordapp.com/attachments/812956551320043523/1224255484845101116/image.png?ex=661cd3c5&is=660a5ec5&hm=cf219e4ee312b60ec7db96bb859c0a8ce7b2e6ae60cff9fe521ebe59b8c39f89&");
        IMAGE_COMMANDS.put("pendidikan", "https://cdn.discordapp.com/attachments/812956551320043523/1224255614411341884/image.png?ex=661cd3e4&is=660a5ee4&hm=9e966ee38530ee4f916f754d61f39db81142087c42bd7f126ea3636012a0a8b8&");
        IMAGE_COMMANDS.put("banyak", "https://cdn.discordapp.com/attachments/812956551320043523/1224256218957221888/img_1_1710842819990.jpg?ex=661cd474&is=660a5f74&hm=0994fb4e79ae7d4e479166583f10f62c1a69470d630f28583d2536e734654787&");
        IMAGE_COMMANDS.put("terpukul", "https://cdn.discordapp.com/attachments/812956551320043523/1225011558204182589/FB_IMG_1712133778988.jpg?ex=661f93eb&is=660d1eeb&hm=7e4e38680496f04739f678205e602a54a8e7785a072ecfb74c57001065fcf0be&");
        IMAGE_COMMANDS.put("karbit", "https://cdn.discordapp.com/attachments/812956551320043523/1372160566826766347/rsz_162d05b109c72c7aa19d832dce40fd322.png?ex=69681a5c&is=6966c8dc&hm=0f6ce768d99ea540699d13a2112dc4e98a77c4e36e1d357d51d0425d4650681b&");
        IMAGE_COMMANDS.put("gamau", "https://cdn.discordapp.com/attachments/812956551320043523/1232899534544175164/FB_IMG_1685866419252.jpg?ex=662b22ab&is=6629d12b&hm=0590c04ec23c7b234714caf6db4fcb2b7b77b33e66ec7d1060b9b5882f97e627&");
        IMAGE_COMMANDS.put("gakmau", "https://cdn.discordapp.com/attachments/812956551320043523/1232899534544175164/FB_IMG_1685866419252.jpg?ex=662b22ab&is=6629d12b&hm=0590c04ec23c7b234714caf6db4fcb2b7b77b33e66ec7d1060b9b5882f97e627&");
        IMAGE_COMMANDS.put("awas", "https://cdn.discordapp.com/attachments/812956551320043523/1232899503162658826/FB_IMG_1705492325305.jpg?ex=662b22a3&is=6629d123&hm=58e7857f74913b51fba1ba2bc1ad13a2ae6b3cb7025768e2c9fb2e0833c71b2e&");
        IMAGE_COMMANDS.put("pikir", "https://cdn.discordapp.com/attachments/812956551320043523/1235565264842526830/IMG_7634.jpg?ex=6634d552&is=663383d2&hm=4f4ae96746560dd54ad38838937d24eb26a543cbd78f209e667664bc001a8d7b&");
        IMAGE_COMMANDS.put("pikirkan", "https://cdn.discordapp.com/attachments/812956551320043523/1235565264842526830/IMG_7634.jpg?ex=6634d552&is=663383d2&hm=4f4ae96746560dd54ad38838937d24eb26a543cbd78f209e667664bc001a8d7b&");
        IMAGE_COMMANDS.put("jawab", "https://cdn.discordapp.com/attachments/812956551320043523/1235811171999678484/image.png?ex=6635ba57&is=663468d7&hm=b52855257931c314486dfe33923a50c691305679499b310a2a2b9d0713a0285f&");
        IMAGE_COMMANDS.put("jawap", "https://cdn.discordapp.com/attachments/812956551320043523/1235811171999678484/image.png?ex=6635ba57&is=663468d7&hm=b52855257931c314486dfe33923a50c691305679499b310a2a2b9d0713a0285f&");
        IMAGE_COMMANDS.put("dapat", "https://cdn.discordapp.com/attachments/812956551320043523/1240976314060771369/FB_IMG_1715771949938.jpg?ex=664884c1&is=66473341&hm=40c7272f0bda04b879972dec4bc51ac72f85bc47fa8d74ce06a7f9e2494cd182&");
        IMAGE_COMMANDS.put("hitam", "https://cdn.discordapp.com/attachments/812956551320043523/1252856697333088286/image.png?ex=6673bd39&is=66726bb9&hm=ac177bd513adc1b3033cd126bc19c7f56cb17614d39dcfd8eb7ad91b7bb5c318&");
        IMAGE_COMMANDS.put("halah", "https://cdn.discordapp.com/attachments/812956551320043523/1252857019770081310/img_4_1715670246962.jpg?ex=6673bd86&is=66726c06&hm=3bf66904210fb2681774dd0c290315f48fb0b40bbdcbab01834048844619c28a&");
        IMAGE_COMMANDS.put("gk", "https://cdn.discordapp.com/attachments/812956551320043523/1261288024671522836/FB_IMG_1720183590038.jpg?ex=66926982&is=66911802&hm=a9beac60473014aab9e2442effa7dbff24d892159d6dbddce86bd94c96a5cfbd&");
        IMAGE_COMMANDS.put("gak", "https://cdn.discordapp.com/attachments/812956551320043523/1261288024671522836/FB_IMG_1720183590038.jpg?ex=66926982&is=66911802&hm=a9beac60473014aab9e2442effa7dbff24d892159d6dbddce86bd94c96a5cfbd&");
        IMAGE_COMMANDS.put("kadang", "https://cdn.discordapp.com/attachments/812956551320043523/1262630103977037907/FB_IMG_1720887681829.jpg?ex=66974b6b&is=6695f9eb&hm=5f545aa9e9e4e306a86b40f95956cd55983a07a1ebf1c1b2d39a117d99d78a2a&");
        IMAGE_COMMANDS.put("terkadang", "https://cdn.discordapp.com/attachments/812956551320043523/1262630103977037907/FB_IMG_1720887681829.jpg?ex=66974b6b&is=6695f9eb&hm=5f545aa9e9e4e306a86b40f95956cd55983a07a1ebf1c1b2d39a117d99d78a2a&");
        IMAGE_COMMANDS.put("burjo", "https://cdn.discordapp.com/attachments/812956551320043523/1280139088317517845/Screenshot_2024-08-30-08-46-21-523_com.discord-edit.jpg?ex=696831ae&is=6966e02e&hm=42f47e0a8bb1aedb826401d5a18b62bd1a4d525b0da41a06a6c3ea439f19903d&");
        IMAGE_COMMANDS.put("mahkota", "https://cdn.discordapp.com/attachments/812956551320043523/1285471816776679545/FB_IMG_1726339755710.jpg?ex=69687a6c&is=696728ec&hm=3f67a175ea15ba74d751ff5c61d74e08c177209736cd1c4b2464486c9d6bfea0&");
        IMAGE_COMMANDS.put("tutup", "https://cdn.discordapp.com/attachments/812956551320043523/1285471817112490035/FB_IMG_1726151786586.jpg?ex=69687a6c&is=696728ec&hm=249d3f3184495a5f1fe187a8f254203d6853770324b55729ec5108e11965c35f&");
        IMAGE_COMMANDS.put("sirkel", "https://cdn.discordapp.com/attachments/812956551320043523/1289096315401408513/FB_IMG_1727232059333-1.jpg?ex=69687aff&is=6967297f&hm=cc341e266e7f387d0a7c1997f8370597bdbfffbde6dd2d8ccc3a9e2cc3116a3e&");
        IMAGE_COMMANDS.put("berikan", "https://cdn.discordapp.com/attachments/812956551320043523/1290211488430166081/FB_IMG_1727678789552.jpg?ex=69689515&is=69674395&hm=70107b50bf7fcbc572b1850eb44b0ac4a60c1dff9e195167f640345913f39fa7&");
        IMAGE_COMMANDS.put("kelihatan", "https://cdn.discordapp.com/attachments/812956551320043523/1290571976880164915/IMG_20240818_235716.jpg?ex=69689350&is=696741d0&hm=535f0245d87cbce8301f63c87fee083c6be41c8dcb590c5f982ae96c6dcf5729&");
        IMAGE_COMMANDS.put("keliatan", "https://cdn.discordapp.com/attachments/812956551320043523/1290571976880164915/IMG_20240818_235716.jpg?ex=69689350&is=696741d0&hm=535f0245d87cbce8301f63c87fee083c6be41c8dcb590c5f982ae96c6dcf5729&");
        IMAGE_COMMANDS.put("bukan", "https://cdn.discordapp.com/attachments/812956551320043523/1293142675574227025/Untitled.png?ex=6968b2f7&is=69676177&hm=0d22497a31bb2d9ffc12e7e15b142876a79ff6bdb745a811b2d1ae7a29ba5c43&");
        IMAGE_COMMANDS.put("reaksi", "https://cdn.discordapp.com/attachments/812956551320043523/1301166965309706310/image_2.png?ex=69683a6b&is=6966e8eb&hm=0f51a1a0a2971661ef2805cabb4a39056de205090367f92170c997555a655db0&");
        IMAGE_COMMANDS.put("gelak", "https://cdn.discordapp.com/attachments/812956551320043523/1303249047594991647/FB_IMG_1727417448420.jpg?ex=69688d42&is=69673bc2&hm=66ccc7b84054291d7b23296dfd818fcfac96c71d46c9786896aaf212fa0c0564&");
        IMAGE_COMMANDS.put("rokok", "https://cdn.discordapp.com/attachments/812956551320043523/1308375217755918366/temp_Screenshot_20241119-171157.jpg?ex=696815a0&is=6966c420&hm=98d9a8eb20560c64eb9fcd0abf42c21fc2731c06e3c5f00e2fe991db7c6112a5&");
        IMAGE_COMMANDS.put("bapak", "https://cdn.discordapp.com/attachments/812956551320043523/1315649860443308113/FB_IMG_1733722815744.jpg?ex=69682eaa&is=6966dd2a&hm=9dee51c61081ce69eb25736993cc2c0cd197c138577d5c08658f1f381c1a38bf&");
        IMAGE_COMMANDS.put("fren", "https://cdn.discordapp.com/attachments/812956551320043523/1325700941223301223/image0.jpg?ex=69687e36&is=69672cb6&hm=034c24ba4d5c397abfda27a7a0280a70973ba6a65adad186c35f55f63b4ce481&");
        IMAGE_COMMANDS.put("gw", "https://cdn.discordapp.com/attachments/812956551320043523/1325736498120622120/ini_sangat_menggambarkan.jpg?ex=69689f54&is=69674dd4&hm=f2c14e153428ef13acb6d39f3bc01c570a5e5010d0edbea3210238a03e93043d&");
        IMAGE_COMMANDS.put("mood", "https://cdn.discordapp.com/attachments/812956551320043523/1339828976029274193/Screenshot_20250213_215614_Discord.jpg?ex=69687978&is=696727f8&hm=62d8794f9494dfbf1ff7eee6290586ae54aff2b7c93ad4f98c683b0d3094779c&");
        IMAGE_COMMANDS.put("pensiun", "https://cdn.discordapp.com/attachments/812956551320043523/1339828986947043389/DB6A8EB5-25DF-41B3-8A35-6DA42BB53743.png?ex=6968797b&is=696727fb&hm=8e8a98393eabd5a109664fc2da2c0a34fb02f2e018a5429779dae5c27d28df98&");
        IMAGE_COMMANDS.put("pensiunan", "https://cdn.discordapp.com/attachments/812956551320043523/1339828986947043389/DB6A8EB5-25DF-41B3-8A35-6DA42BB53743.png?ex=6968797b&is=696727fb&hm=8e8a98393eabd5a109664fc2da2c0a34fb02f2e018a5429779dae5c27d28df98&");
        IMAGE_COMMANDS.put("pensi", "https://cdn.discordapp.com/attachments/812956551320043523/1339828986947043389/DB6A8EB5-25DF-41B3-8A35-6DA42BB53743.png?ex=6968797b&is=696727fb&hm=8e8a98393eabd5a109664fc2da2c0a34fb02f2e018a5429779dae5c27d28df98&");
        IMAGE_COMMANDS.put("minggir", "https://cdn.discordapp.com/attachments/812956551320043523/1341732591950233661/FB_IMG_1739712821116.jpg?ex=6968261a&is=6966d49a&hm=b5e5846fc606cd01d296e12af798fb05fc587bf1778fcf8f0d22f42b122eb647&");
        IMAGE_COMMANDS.put("dingin", "https://cdn.discordapp.com/attachments/812956551320043523/1344905127861157970/20250228_103119.jpg?ex=69687c01&is=69672a81&hm=6d258803fdcb25a57dad6d5e4ddbd219cdd31aa5105d887bb20eead411a37fa0&");
        IMAGE_COMMANDS.put("hargai", "https://cdn.discordapp.com/attachments/812956551320043523/1351817087538040862/FB_IMG_1742364943021.jpg?ex=696894c5&is=69674345&hm=a05527a6b01ff5a4a372ce3a9d21ec2dcdd7210080e4bdbd84528cc295d51f01&");
        IMAGE_COMMANDS.put("istri", "https://cdn.discordapp.com/attachments/812956551320043523/1351817103996354591/FB_IMG_1742338814681.jpg?ex=696894c9&is=69674349&hm=8c6d4e754b606170738a04911ea100fb60a0063c3582dcd99fd9b2715d1fee41&");
        IMAGE_COMMANDS.put("sahabat", "https://cdn.discordapp.com/attachments/812956551320043523/1359793897961951322/image0.jpg?ex=696898c1&is=69674741&hm=5eb149aff409fb83b27f875d38bfb32f47bb64c80d0d6bd616107d4fa8eab93f&");
        IMAGE_COMMANDS.put("alamak", "https://cdn.discordapp.com/attachments/812956551320043523/1359794275516420259/images.jpeg?ex=6968991b&is=6967479b&hm=6ee1a5bc861061e57a1aa9585f2938d8270a954d3e7bfe932a29f7f735cfe3e6&");
        IMAGE_COMMANDS.put("kelas", "https://cdn.discordapp.com/attachments/812956551320043523/1359794544379433083/Untitled.png?ex=6968995b&is=696747db&hm=c9063d1d99e1c931b20ca462433c6acd89ea7773f2bd6a3208a48d767101c02f&");
        IMAGE_COMMANDS.put("siang", "https://cdn.discordapp.com/attachments/812956551320043523/1373922387900497970/Screenshot_2025-05-16-15-43-30-544_com.discord.png?ex=6968946f&is=696742ef&hm=4639b017b7b24f191e56bf3fcb5696834e3e89166dadb2433feacca61d83a5c0&");
        IMAGE_COMMANDS.put("bini", "https://cdn.discordapp.com/attachments/812956551320043523/1376510439038648430/FB_IMG_1748149421952.jpg?ex=69681b7e&is=6966c9fe&hm=69492f84d13ea68c887ca758480f9cc11477174af8bf38606df7326bd40ceb87&");
        IMAGE_COMMANDS.put("waktu", "https://cdn.discordapp.com/attachments/812956551320043523/1376807093561987113/image.png?ex=69688706&is=69673586&hm=b2dd871ad0314c2235a896a463bd282f44f3daf6f3bfab048ef5bfb2d2ce5099&");
        IMAGE_COMMANDS.put("doksli", "https://cdn.discordapp.com/attachments/812956551320043523/1384385972703072409/FB_IMG_1749802381587.jpg?ex=696869e8&is=69671868&hm=1b82573b22c3a1bf2a00921350845a4605825fdd3477d7c2cadf150d02905dd1&");
        IMAGE_COMMANDS.put("anda", "https://cdn.discordapp.com/attachments/812956551320043523/1384385986494074960/FB_IMG_1750003311618.jpg?ex=696869eb&is=6967186b&hm=fd493c150515cf379d088c764d5c789cec7b85bc4b19c732686b52fe7b27e564&");
        IMAGE_COMMANDS.put("ea", "https://cdn.discordapp.com/attachments/812956551320043523/1399242483392839772/image.png?ex=6968689c&is=6967171c&hm=bf14f4507fde2a3251f9f13e1056baa7b259d8df09b374700d952d3986488ecb&");
        IMAGE_COMMANDS.put("wareg", "https://cdn.discordapp.com/attachments/812956551320043523/1399242766223147148/image.png?ex=696868e0&is=69671760&hm=2cf009528bf5bc42a48bc808e07f7ef5faa142e29669c20ff0523f135eea0d51&");
        IMAGE_COMMANDS.put("umazing", "https://cdn.discordapp.com/attachments/812956551320043523/1399356769758875734/image.png?ex=69682a4c&is=6966d8cc&hm=7b54636052566d27bc9348e3e379bc5da45cc61e62a72611100de30d7466ce0c&");
        IMAGE_COMMANDS.put("bakekok", "https://cdn.discordapp.com/attachments/812956551320043523/1406288695522496713/image0.gif?ex=696855a8&is=69670428&hm=5d5aa168060453e1f0c30319820c5c5b0f23324ea8f587d208cef6991f490b85&");
        IMAGE_COMMANDS.put("hore", "https://cdn.discordapp.com/attachments/812956551320043523/1410472316801912954/hore.gif?ex=696864b5&is=69671335&hm=d33dd4e21c2e46d10ede04521f7994534135680a684be8e44a159fbcc9bdff81&");
        IMAGE_COMMANDS.put("ketebak", "https://cdn.discordapp.com/attachments/812956551320043523/1419994548683145257/image0.jpg?ex=6968193a&is=6966c7ba&hm=c6c9685d82036dda47751ed88949f0a5e5cacb15a629579adab85c1a7ff35ac2&");
        IMAGE_COMMANDS.put("komedi", "https://cdn.discordapp.com/attachments/812956551320043523/1430126545414131794/IMG_20251021_083947_437.jpg?ex=69680b62&is=6966b9e2&hm=82d79a21d0f5cd626ce5e505d349e6bcbb6916a1ee6c0a97277369c5b1aa1632&");
        IMAGE_COMMANDS.put("kecil", "https://cdn.discordapp.com/attachments/812956551320043523/1461001656194826363/image_2.png?ex=6968f752&is=6967a5d2&hm=0863f9ab8e3fa8e40d1a01ad3151d646cbf5df7a89b133579a75c830d56bac2b&");
        IMAGE_COMMANDS.put("sahur", "https://cdn.discordapp.com/attachments/812956551320043523/1488887401727131769/received_2064093094380697.png?ex=69ce69f2&is=69cd1872&hm=4ee057c7d0192dd401f8ab5cc712428e48f66033b4770c267782b57bb9e0d78d");

        MULTI_IMAGE_COMMANDS.put("bacot", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957291908562944/bacot.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/812957290881482782/bacot_2.jpg"));
        MULTI_IMAGE_COMMANDS.put("bavot", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957291908562944/bacot.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/812957290881482782/bacot_2.jpg"));
        MULTI_IMAGE_COMMANDS.put("nacot", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957291908562944/bacot.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/812957290881482782/bacot_2.jpg"));
        MULTI_IMAGE_COMMANDS.put("baxot", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957291908562944/bacot.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/812957290881482782/bacot_2.jpg"));
        MULTI_IMAGE_COMMANDS.put("vagot", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957291908562944/bacot.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/812957290881482782/bacot_2.jpg"));
        MULTI_IMAGE_COMMANDS.put("bagot", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957291908562944/bacot.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/812957290881482782/bacot_2.jpg"));
        MULTI_IMAGE_COMMANDS.put("ribut", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957282819375124/11702893809638.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/812957285911494666/11702893817986.jpg"));
        MULTI_IMAGE_COMMANDS.put("ribiw", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957282819375124/11702893809638.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/812957285911494666/11702893817986.jpg"));
        MULTI_IMAGE_COMMANDS.put("homuking", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957349038784512/homuking_2.png", "https://cdn.discordapp.com/attachments/812956551320043523/812957353615425546/homuking.png"));
        MULTI_IMAGE_COMMANDS.put("memek", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/812957287538360320/11702899958933.jpg", "https://cdn.discordapp.com/attachments/764373155313221632/816304978536038521/tuowpQR.jpg"));
        MULTI_IMAGE_COMMANDS.put("pukul", Arrays.asList("https://i.imgur.com/MQopSkq.jpg", "https://i.imgur.com/U0h925E.jpg"));
        MULTI_IMAGE_COMMANDS.put("berani", Arrays.asList("https://i.imgur.com/MQopSkq.jpg", "https://i.imgur.com/U0h925E.jpg"));
        MULTI_IMAGE_COMMANDS.put("sauce", Arrays.asList("https://i.imgur.com/qvb7dDI.jpg", "https://cdn.discordapp.com/attachments/734258297145917461/937966496125157426/IMG_20220110_150334.jpg"));
        MULTI_IMAGE_COMMANDS.put("saus", Arrays.asList("https://i.imgur.com/qvb7dDI.jpg", "https://cdn.discordapp.com/attachments/734258297145917461/937966496125157426/IMG_20220110_150334.jpg"));
        MULTI_IMAGE_COMMANDS.put("pasal", Arrays.asList("https://i.imgur.com/qvb7dDI.jpg", "https://cdn.discordapp.com/attachments/734258297145917461/937966496125157426/IMG_20220110_150334.jpg"));
        MULTI_IMAGE_COMMANDS.put("saos", Arrays.asList("https://i.imgur.com/qvb7dDI.jpg", "https://cdn.discordapp.com/attachments/734258297145917461/937966496125157426/IMG_20220110_150334.jpg"));
        MULTI_IMAGE_COMMANDS.put("keqing", Arrays.asList("https://i.imgur.com/oWIximk.jpg", "https://i.imgur.com/nWXDuOo.jpg"));
        MULTI_IMAGE_COMMANDS.put("qiqi", Arrays.asList("https://i.imgur.com/oRjyTck.jpg", "https://i.imgur.com/dPuVDJY.png"));
        MULTI_IMAGE_COMMANDS.put("takut", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/1023993399751221268/ea.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/1023993400137105518/eaea.jpg"));
        MULTI_IMAGE_COMMANDS.put("janji", Arrays.asList("https://cdn.discordapp.com/attachments/734258297145917461/977782244443815946/IMG_20220522_105724.jpg", "https://cdn.discordapp.com/attachments/734258297145917461/977782750557921290/IMG_20220522_114825.jpg"));
        MULTI_IMAGE_COMMANDS.put("track", Arrays.asList("https://cdn.discordapp.com/attachments/764373155313221632/816281492853489685/unknown.png", "https://cdn.discordapp.com/attachments/764373155313221632/816282386584698880/image0.jpg"));
        MULTI_IMAGE_COMMANDS.put("ip", Arrays.asList("https://cdn.discordapp.com/attachments/764373155313221632/816281492853489685/unknown.png", "https://cdn.discordapp.com/attachments/764373155313221632/816282386584698880/image0.jpg"));
        MULTI_IMAGE_COMMANDS.put("jijik", Arrays.asList("https://cdn.discordapp.com/attachments/764373155313221632/816283236950736906/image0.jpg", "https://cdn.discordapp.com/attachments/764373155313221632/816298396326821888/IMG_20210302_201811.jpg"));
        MULTI_IMAGE_COMMANDS.put("ijo", Arrays.asList("https://cdn.discordapp.com/attachments/764373155313221632/816295784558886942/IMG_20200903_221330.JPG", "https://cdn.discordapp.com/attachments/764373155313221632/816295784709357618/IMG_20200914_205740.jpg"));
        MULTI_IMAGE_COMMANDS.put("damai", Arrays.asList("https://cdn.discordapp.com/attachments/764373155313221632/816295661833551923/IMG_20210302_200058.jpg", "https://cdn.discordapp.com/attachments/764373155313221632/816295662017839114/IMG_20210302_200257.jpg"));
        MULTI_IMAGE_COMMANDS.put("ps5", Arrays.asList("https://cdn.discordapp.com/attachments/764373155313221632/816299256439635988/unknown.png", "https://cdn.discordapp.com/attachments/764373155313221632/816299905085079612/IMG_20210302_202406.jpg"));
        MULTI_IMAGE_COMMANDS.put("xing", Arrays.asList("https://cdn.discordapp.com/attachments/764373155313221632/816607704398430238/IMG_20210303_164720.jpg", "https://cdn.discordapp.com/attachments/764373155313221632/816606968059002880/IMG_20210303_164358.jpg", "https://cdn.discordapp.com/attachments/764373155313221632/819093367865737226/Screenshot_20210310-132430_Discord.jpg"));
        MULTI_IMAGE_COMMANDS.put("xingqiu", Arrays.asList("https://cdn.discordapp.com/attachments/764373155313221632/816607704398430238/IMG_20210303_164720.jpg", "https://cdn.discordapp.com/attachments/764373155313221632/816606968059002880/IMG_20210303_164358.jpg", "https://cdn.discordapp.com/attachments/764373155313221632/819093367865737226/Screenshot_20210310-132430_Discord.jpg"));
        MULTI_IMAGE_COMMANDS.put("badut", Arrays.asList("https://cdn.discordapp.com/attachments/734383000812388382/891035207682101308/E47m9tUXwAQddS5.png", "https://cdn.discordapp.com/attachments/734388695049830470/900680282896752660/PhotoGrid_Plus_1634795878005.png"));
        MULTI_IMAGE_COMMANDS.put("bokep", Arrays.asList("https://cdn.discordapp.com/attachments/734258297145917461/975937672960962620/Screenshot_20220517_094735.jpg", "https://cdn.discordapp.com/attachments/734394269871112212/974201839446814770/IMG_20220512_144937.jpg"));
        MULTI_IMAGE_COMMANDS.put("bocil", Arrays.asList("https://cdn.discordapp.com/attachments/734258297145917461/975937672960962620/Screenshot_20220517_094735.jpg", "https://cdn.discordapp.com/attachments/734394269871112212/974201839446814770/IMG_20220512_144937.jpg"));
        MULTI_IMAGE_COMMANDS.put("esse", Arrays.asList("https://cdn.discordapp.com/attachments/734258297145917461/990825916580126771/IMG_20220627_114606.jpg", "https://cdn.discordapp.com/attachments/734258297145917461/990825916982763580/IMG_20220627_114536.jpg"));
        MULTI_IMAGE_COMMANDS.put("sempit", Arrays.asList("https://cdn.discordapp.com/attachments/812956551320043523/1128385005958217778/Screenshot_20230711-192653_Discord.jpg", "https://cdn.discordapp.com/attachments/812956551320043523/1128696110907666535/20230712_183846.png"));
    }

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        String cmd = args[0].toLowerCase();
        String p = KochengController.prefix;

        // --- Image commands (looked up via HashMap, no giant if-chain) ---
        if (cmd.startsWith(p)) {
            String key = cmd.substring(p.length());
            if (IMAGE_COMMANDS.containsKey(key)) {
                EmbedBuilder embed = new EmbedBuilder();
                embed.setImage(IMAGE_COMMANDS.get(key));
                event.getChannel().sendTyping().queue();
                event.getChannel().sendMessageEmbeds(embed.build()).queue();
                return;
            }
            if (MULTI_IMAGE_COMMANDS.containsKey(key)) {
                event.getChannel().sendTyping().queue();
                for (String url : MULTI_IMAGE_COMMANDS.get(key)) {
                    EmbedBuilder embed = new EmbedBuilder();
                    embed.setImage(url);
                    event.getChannel().sendMessageEmbeds(embed.build()).queue();
                }
                return;
            }
        }

        if (args[0].equalsIgnoreCase(p + "list")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Command List Kocheng");
			embed.setDescription(
					"====================\n"+
					"3jt\n"+
					"50k\n"+
					"achievement / achivmen / acivmen / acimen\n"+
					"ada\n"+
					"alamak\n"+
					"alhamdulillah / alhamdulilah\n"+
					"allahu\n"+
					"ampas\n"+
					"anal\n"+
					"anda\n"+
					"anj / anjg / ajg / anjing\n"+
					"anjay\n"+
					"anjim\n"+
					"apcb \n"+
					"astaga / astava / asfava\n"+
					"asu\n"+
					"atitut\n"+
					"awas\n"+
					"ayaka\n"+
					"babi\n"+
					"bacot / nacot / bavot / baxot / vagot / bagot\n"+
					"badut\n"+
					"bagaimana\n"+
					"bagus\n"+
					"baik\n"+
					"baiwan / bewan / byone\n"+
					"bakekok\n"+
					"balon / balonku\n"+
					"banjir / fakta / fanta\n"+
					"banyak\n"+
					"bapak\n"+
					"baper / laper\n"+
					"barbara / barabata / bandara\n"+
					"batang\n"+
					"benar\n"+
					"berak / beraq\n"+
					"berikan\n"+
					"besok\n"+
					"biadam\n"+
					"biar\n"+
					"bini\n"+
					"bisa\n"+
					"bismillah\n"+
					"bobi\n"+
					"bohong\n"+
					"bokep / bocil\n"+
					"bokong\n"+
					"bomat / gapeduli\n"+
					"bosan\n"+
					"bukan\n"+
					"burjo\n"+
					"burung\n"+
					"bye\n"+
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
					"cukub / cukup\n"+
					"cuma\n"+
					"cupu / cupi / payah\n"+
					"curang\n"+
					"curhat\n"+
					"dahulu\n"+
					"damai\n"+
					"dana\n"+
					"darimana\n"+
					"datang\n"+
					"dek\n"+
					"des\n"+
					"dev / fandom\n"+
					"diem / diam\n"+
					"dildo\n"+
					"dingin\n"+
					"dipikir \n"+
					"dislike\n"+
					"doksli\n"+
					"dokter\n"+
					"dompet\n"+
					"duit / duid\n"+
					"ea\n"+
					"eee\n"+
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
					"====================\n"+
					"Ketik "+KochengController.prefix+"list2 untuk melihat command selanjutnya\n"
					);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}

        if (args[0].equalsIgnoreCase(p + "list2")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Command List Kocheng");
			embed.setDescription(
					"====================\n"+
					"fendet / gender\n"+
					"fetis / fetish\n"+
					"fren\n"+
					"fubuki / fukuki / manual\n"+
					"furry / furi\n"+
					"gacha\n"+
					"gaguna\n"+
					"gakreatif\n"+
					"gakmau / gamau\n"+
					"gangbang\n"+
					"gatal / gatel\n"+
					"gay\n"+
					"gegabah\n"+
					"geh\n"+
					"gei\n"+
					"gelak\n"+
					"gem\n"+
					"genshin\n"+
					"gesek\n"+
					"gila\n"+
					"gigit\n"+
					"gitar\n"+
					"gk / gak\n"+
					"goblog / goblok \n"+
					"gw\n"+
					"hadeh\n"+
					"hak\n"+
					"halah\n"+
					"hamil\n"+
					"hantu\n"+
					"harem\n"+
					"hargai\n"+
					"hayo\n"+
					"hdmi\n"+
					"henceut\n"+
					"hijau\n"+
					"hitam\n"+
					"hode\n"+
					"hoki\n"+
					"homo\n"+
					"homuking\n"+
					"hooh\n"+
					"hore\n"+
					"horny / hirji\n"+
					"hujat\n"+
					"ijo\n"+
					"ingat / tobat\n"+
					"insekyur\n"+
					"isep\n"+
					"istigfar / istighfar \n"+
					"istri\n"+
					"item\n"+
					"iwak\n"+
					"iya\n"+
					"janji\n"+
					"jaog / jago / ampun / seram / sram / sramz\n"+
					"jagoan\n"+
					"jawab / jawap\n"+
					"jelata\n"+
					"jelek\n"+
					"jembut / jembud\n"+
					"jijik\n"+
					"jiwan\n"+
					"jodoh\n"+
					"jokowi\n"+
					"jumatan\n"+
					"kadang / terkadang\n"+
					"kafka\n"+
					"kalah\n"+
					"kangen\n"+
					"karbit\n"+
					"kasar / laskar\n"+
					"kasihan\n"+
					"kau\n"+
					"kawaii / kawai\n"+
					"kaya\n"+
					"kecewa\n"+
					"kecil\n"+
					"kecoa\n"+
					"kekar\n"+
					"kelas\n"+
					"kelihatan / keliatan\n"+
					"kentu\n"+
					"keqing\n"+
					"keren\n"+
					"kesalahan \n"+
					"ketar\n"+
					"ketebak\n"+
					"ketua\n"+
					"kihomo\n"+
					"kimpeha\n"+
					"khunul\n"+
					"klee\n"+
					"kocheng\n"+
					"komedi\n"+
					"konglol\n"+
					"konjol\n"+
					"kontol\n"+
					"kontribusi\n"+
					"kubus / kunus\n"+
					"====================\n"+
					"Ketik "+KochengController.prefix+"list3 untuk melihat command selanjutnya\n"
					);
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}

        if (args[0].equalsIgnoreCase(p + "list3")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Command List Kocheng");
			embed.setDescription(
					"====================\n"+
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
					"liat\n"+
					"like / likes / laiks\n"+
					"logika\n"+
					"login\n"+
					"lonte / kobte\n"+
					"lucu\n"+
					"lupa\n"+
					"mabar\n"+
					"mahkota\n"+
					"malam / malem\n"+
					"malas\n"+
					"masuk\n"+
					"mati\n"+
					"mei / mei kita / mei gue\n"+
					"melas\n"+
					"membuahi\n"+
					"memek\n"+
					"mending\n"+
					"mengheningkan\n"+
					"mention\n"+
					"menyesal \n"+
					"meo / memeo\n"+
					"miaw\n"+
					"mindset\n"+
					"minggir\n"+
					"minta / bagi\n"+
					"miskin\n"+
					"mobil\n"+
					"monthly\n"+
					"monly\n"+
					"monyet\n"+
					"mood\n"+
					"muak\n"+
					"mulai\n"+
					"murka\n"+
					"mw\n"+
					"nangis\n"+
					"nabung\n"+
					"nahida\n"+
					"nanya\n"+
					"nasgor\n"+
					"nenen\n"+
					"ngakak \n"+
					"ngambek \n"+
					"ngangkang\n"+
					"ngantuk\n"+
					"ngentod / ngentot\n"+
					"ngeri\n"+
					"ngeyel\n"+
					"ngocok\n"+
					"ngomong\n"+
					"ngontol\n"+
					"ngopi\n"+
					"nguli\n"+
					"npc\n"+
					"ntr\n"+
					"nyambung\n"+
					"nyerah\n"+
					"nyimak\n"+
					"ocincin\n"+
					"ok\n"+
					"om\n"+
					"onat\n"+
					"opini\n"+
					"otw\n"+
					"out / pelatih / pelatuh\n"+
					"paansi / apasih / paansih / apaansih / apasi\n"+
					"pagi\n"+
					"pece\n"+
					"pegal\n"+
					"pekok\n"+
					"pendek\n"+
					"pendidikan\n"+
					"penis\n"+
					"pensiun / pensiunan / pensi\n"+
					"pepek\n"+
					"percaya\n"+
					"pergi\n"+
					"perjaka\n"+
					"permen\n"+
					"pervert / perv\n"+
					"pici / pc\n"+
					"pikir / pikirkan\n"+
					"pride\n"+
					"prinsip\n"+
					"ps5\n"+
					"psikopat / psokopaypukul / berani\n"+
					"qiqi\n"+
					"rapsodi\n"+
					"====================\n"+
					"Ketik "+KochengController.prefix+"list4 untuk melihat command selanjutnya\n"
					);
		event.getChannel().sendTyping().queue();
		event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}

        if (args[0].equalsIgnoreCase(p + "list4")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Command List Kocheng");
			embed.setDescription(
					"====================\n"+
					"rasakan\n"+
					"reaksi\n"+
					"rehab / rehabilitas / rebihalitas\n"+
					"retry / tetty\n"+
					"ribut / ribiw\n"+
					"rog\n"+
					"rokok\n"+
					"sahabat\n"+
					"sahur\n"+
					"salam\n"+
					"salto\n"+
					"sange / sangean\n"+
					"santai\n"+
					"saoi\n"+
					"sarapan\n"+
					"sarjana / ekonomi\n"+
					"saus / saos / sauce / pasal\n"+
					"sedih\n"+
					"segar\n"+
					"selaw\n"+
					"sempit\n"+
					"seno\n"+
					"senyum \n"+
					"sepuh\n"+
					"sesat\n"+
					"shap / siap\n"+
					"siang\n"+
					"sipaling\n"+
					"sirkel\n"+
					"skill\n"+
					"slow\n"+
					"smash / semes / smesh\n"+
					"sodok\n"+
					"sopan\n"+
					"sore\n"+
					"ss\n"+
					"sulit\n"+
					"summon / cium\n"+
					"sunat\n"+
					"sunda\n"+
					"susu\n"+
					"taat / aturan\n"+
					"tag\n"+
					"tai\n"+
					"takut\n"+
					"tani / thamngan\n"+
					"tau\n"+
					"telanjang / bugil\n"+
					"telat\n"+
					"tergantung\n"+
					"terhura / terharu\n"+
					"terpukul\n"+
					"test\n"+
					"tewas\n"+
					"tidur\n"+
					"tingkahmu\n"+
					"titit / titid\n"+
					"tolak\n"+
					"tolong\n"+
					"tovat\n"+
					"tomay / tomat\n"+
					"toxic / toksik\n"+
					"track / ip\n"+
					"tri\n"+
					"tt / tete\n"+
					"tumdur / bobo\n"+
					"tusbol\n"+
					"tusuk\n"+
					"tutup\n"+
					"ty / thx / thanks\n"+
					"typo / tipo\n"+
					"udah\n"+
					"umam\n"+
					"umazing\n"+
					"update\n"+
					"valid\n"+
					"waduh\n"+
					"waktu\n"+
					"wareg\n"+
					"wawasan\n"+
					"welcome\n"+
					"wibu\n"+
					"wleo\n"+
					"woi\n"+
					"woo / pantek\n"+
					"xingqiu / xing\n"+
					"yan / jajan\n"+
					"yanfei\n"+
					"yanto\n"+
					"yes\n"+
					"yoga\n"+
					"yuri\n"+
					"====================\n"
					);
		event.getChannel().sendTyping().queue();
		event.getChannel().sendMessageEmbeds(embed.build()).queue();
		}

        if (args[0].equalsIgnoreCase(p + "kocheng")) {
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("KochengBot");
			info.setDescription("Hai saya kocheng\nLO SEMUA KONTOOOOOOOOOLLLLLL");
			info.setFooter("Created by polrusak ft. para penyepong hoyomi");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(info.build()).queue();
			info.clear();
		}

        if (args[0].equalsIgnoreCase(p + "test")) {
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("tas tes tas tes kontol bapak kau pecah").queue();
		}

        if (args[0].equalsIgnoreCase(p + "nahida")) {
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("NAHIDA... NAHIDA NAHIDA NAHIDAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAA\r\n"
					+ "AAAAAAAAAAAAAAAAAGH AAAAAAAAAAAAAAAAAAAAAAAGH! WANGI WANGI WANGI WANGI HU HA HU HA HU HA, aaaah baunya Nahida wangi aku mau nyiumin aroma wanginya Nahida AAAAAAAAH Rambutnya. AAAHHH rambutnya juga pengen aku elus-elus ----- AAAAAH Nahida keluar pertama kali juga manis!!! Dia senyum itu juga manis banget AAAAAAAAH NAHIDA LUCCUUUUUUUUUUUUUUU......... GUA BAKAL RELA TOPUP 5 JUTA BUAT NAHIDA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAGH\r\n"
					+ "Apa? Nahida itu gak nyata? Cuma karakter 2 dimensi katamu?\r\n"
					+ "Nggak ngak ngak ngak ngak NGAAAAAAAAK GUA GAK PERCAYA ITU DIA NYATA NGAAAAAAAAAAAAAAAAAK WIBU BANGSAAAAAT!\r\n"
					+ "GUA GAK PEDULI SAMA KENYATAAN POKOKNYA GAK PEDULI Nahida ngeliat gw. Nahida di pici ngeliatin gw. Nahida... kamu percaya sama aku? AAAAAAAAHHH syukur Nahida gak malu merelakan aku aaaaaah!!! YEAAAAAAAAAAAH GUA MASIH PUNYA NAHIDA, SENDIRI PUN NGGAK SAMA AAAAAAAAAAAAAAH").queue();
		}

        if (args[0].equalsIgnoreCase(p + "bosan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://cdn.discordapp.com/attachments/812956551320043523/1006207047760625775/ea.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessageEmbeds(embed.build()).complete().addReaction("U+1F44D").queue();
		}
    }

    @Override
    public void onReady(@NotNull ReadyEvent event) {
		
	    ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
	    ZonedDateTime nextFirstLesson = now.withHour(1).withMinute(0).withSecond(0);
	    if (now.compareTo(nextFirstLesson) > 0) {
	        nextFirstLesson = nextFirstLesson.plusDays(1);
	    }

	    // duration between now and the beginning of the next first lesson
	    Duration durationUntilFirstLesson = Duration.between(now, nextFirstLesson);
	    // in seconds
	    long initialDelay = durationUntilFirstLesson.getSeconds();

	    // scheduler buat star rail
	    ScheduledExecutorService schedulerFirstLesson = Executors.newScheduledThreadPool(1);
	    schedulerFirstLesson.scheduleAtFixedRate(new Runnable() {
	    	public void run() {
	    		try {
			        JDA jda = event.getJDA();
			        Guild guild = jda.getGuildById("764360360047542293");
			        
			        guild.getTextChannelById("1101987461816655882").sendMessage("<@&1102931736792408064>").queue();
			        
			        EmbedBuilder embed = new EmbedBuilder();
			        embed.setTitle("Daily Web Login Reminder");
			        embed.setDescription("Halo, Trailblazers! Jangan lupa log in daily di HoYoLAB ya, click linknya ***SEKARANG*** biar gak lupa:\r\n"
			        		+ "\r\n"
			        		+ "https://act.hoyolab.com/bbs/event/signin/hkrpg/index.html?act_id=e202303301540311&bbs_auth_required=true&bbs_presentation_style=fullscreen&lang=id-id&utm_source=share&utm_medium=hoyolab&utm_campaign=app\r\n");
//			        		+ "\r\n"
//			        		+ "Juga jangan lupa ikuti web event:\r\n"
//			        		+ "https://t.co/lfthRhOY6j");
		            embed.setImage("https://upload-os-bbs.hoyolab.com/upload/2023/04/17/65d6ab931ddde1095a28c2aebe3852ce_1330164747074143287.png?x-oss-process=image/resize,s_1000/quality,q_80/auto-orient,0/interlace,1/format,png");
		            
		            guild.getTextChannelById("1101987461816655882").sendMessageEmbeds(embed.build()).queue();
			        
	    		} catch (Exception e) {
	    			e.printStackTrace();
	    		}
		        
	    	}
	    }, initialDelay, 86400, TimeUnit.SECONDS);
	    
	    // scheduler buat zzz
	    ScheduledExecutorService schedulerZzz = Executors.newScheduledThreadPool(1);
	    schedulerZzz.scheduleAtFixedRate(new Runnable() {
	    	public void run() {
	    		try {
			        JDA jda = event.getJDA();
			        Guild guild = jda.getGuildById("764360360047542293");
			        
			        guild.getTextChannelById("1261291295004037321").sendMessage("<@&1261291389182939229>").queue();
			        
			        EmbedBuilder embed = new EmbedBuilder();
			        embed.setTitle("Daily Web Login Reminder");
			        embed.setDescription("Halo, Master Proxy! Jangan lupa log in daily di HoYoLAB ya, click linknya ***SEKARANG*** biar gak lupa:\r\n"
			        		+ "\r\n"
			        		+ "https://act.hoyolab.com/bbs/event/signin/zzz/e202406031448091.html?act_id=e202406031448091&hyl_auth_required=true&hyl_presentation_style=fullscreen&utm_campaign=checkin&utm_id=8&utm_medium=tools&utm_source=hoyolab&lang=en-us&bbs_theme=dark&bbs_theme_device=0\r\n");
//			        		+ "\r\n"
//			        		+ "Juga jangan lupa ikuti web event:\r\n"
//			        		+ "https://t.co/lfthRhOY6j");
		            embed.setImage("https://upload-os-bbs.hoyolab.com/upload/2024/07/02/1f1d92145428317c656def81323c9fc1_9140666359521198100.png?x-oss-process=image/resize,s_1000/quality,q_80/auto-orient,0/interlace,1/format,png");
		            
		            guild.getTextChannelById("1261291295004037321").sendMessageEmbeds(embed.build()).queue();
			        
	    		} catch (Exception e) {
	    			e.printStackTrace();
	    		}
		        
	    	}
	    }, initialDelay, 86400, TimeUnit.SECONDS);
	}
}