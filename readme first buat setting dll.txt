cara setting kochengbot:
1. clone kochengbot pake github desktop
2. donlod eclipse. kalo cuma mau buat command tanpa running, ga perlu donlod eclipse dan skip no 5 ke bawah
3. isi command ada di CommandList.java
4. kalo mau buat command baru, tulis isi command setelah embed.setDescription seperti command lainnya. pastikan ada \n di belakang text, contohnya "test\n" atau "lawak\n". setelah itu, buat method if else nya dari command tersebut di bagian bawah. contohnya:

if(....prefix + "test") {
	EmbedBuilder embed = new EmbedBuilder();
	embed.setImage("url img kalian, bisa diupload di imgur atau terserah dimana");
	
	event.getChannel().sendTyping().queue();
	event.getChannel().sendMessage(embed.build()).queue();
}

kalian bisa ikutin contoh command list lain.
5. donlod JDA yang ada kata kata "with dependencies" nya di https://ci.dv8tion.net/job/JDA/ ukurannya biasanya yg paling gede sampe 10mb
6. visit https://github.com/DV8FromTheWorld/JDA/wiki/2%29-Eclipse-Setup lihat bagian jar setup, ikutin langkahnya
7. pasang JDA di properties > java build path > external jar > JDA with dependencies > apply
8. export > java > runnable jar > configurations: KochengController > select folder, mau diexport kemana file kochengbot nya
9. bilang bilang ke yg buat kalo mau ada perubahan ya