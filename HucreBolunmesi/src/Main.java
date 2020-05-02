
public class Main {

	public static void main(String[] args) {
		//Programımın Başlığı
		System.out.println("Hücre Bölünmesi Programı");
		
		//Ana Hücremin Özelliklerini Tutan değişkenleri tanımladım
		double besinMiktari;
		double telomerazMiktari;
		int bulunduguNesilSayisi;
		boolean mutasyonGecirdiMi;
		//Gen dizilimini sonra tanımlamak daha mantıklı!
		
		besinMiktari =17.168;
		telomerazMiktari = 3.109;
		bulunduguNesilSayisi = 1;
		mutasyonGecirdiMi = false;
		//ÖNEMLİ!
		//Gen dizilimini burada tanımladım çünkü bir diziyi tek seferde tanımlamak sadece oluştururken geçerli!
		char[] genDizilimi ={'A','A','T','A','G','T','U','A','U','G'};
		
		//Sonucumu tutacak yeni bir değişken tanımladım ve atama olarak istediğim işlemi girdim!
		double besinBoluEnzimDegeri = besinMiktari / telomerazMiktari;
		
		//Ekrana sonucumu kullanıcıyı da düşünerek yazdırdım
		System.out.println("Besin / Telomeraz oranı: "+ besinBoluEnzimDegeri);
		
		//Çalıştırdınca sonuç 5.22032 geldi. Değer 10 dan küçük o yüzden hücreyi besliyorum
		
		//Besin miktarını arttırdım
		besinMiktari += 11.62;
		//Hesaplamamı yeniden yaptım
		besinBoluEnzimDegeri = besinMiktari / telomerazMiktari;
		//Ekrana tekrar yazdırdım
		System.out.println("Besin / Telomeraz oranı: "+ besinBoluEnzimDegeri);
		
		//Oran 9.2595 yani hala 10 değerinden az. tekrar besliyorum
		
		//Tekrar besledim
		besinMiktari += 11.62;
		//Tekrar hesapladım
		besinBoluEnzimDegeri = besinMiktari / telomerazMiktari;
		//Tekrar yazdırdım
		System.out.println("Besin / Telomeraz oranı: "+ besinBoluEnzimDegeri);
		
		//Sonuç 12.9971 geldi. Artık Hücre Bölünmesi başlayabilir!
		
			//Doğacak hücrelerin değerlerini tutacak değişkenleri tanımladım!
		double besinMiktari2;
		double telomerazMiktari2;
		int bulunduguNesilSayisi2;
		boolean mutasyonGecirdiMi2;
		char[] genDizilimi2= new char[10];//Gen uzunluğum belli olduğu için array'imin uzunluğunu belirttim
		
		double besinMiktari3;
		double telomerazMiktari3;
		int bulunduguNesilSayisi3;
		boolean mutasyonGecirdiMi3;
		char[] genDizilimi3= new char[10];//Gen uzunluğum belli olduğu için array'imin uzunluğunu belirttim
		
		//Yeni Hücrelerin değerlerini atadım
		besinMiktari2 = besinMiktari/2;
		telomerazMiktari2 = telomerazMiktari/2;
		bulunduguNesilSayisi2 = bulunduguNesilSayisi+1;
		mutasyonGecirdiMi2 = true;

		//Genleri tek tek eşitledim. !! BAŞKA SEÇENEĞİM YOK. Arrayleri doğrudan atayamam!
		genDizilimi2[0] = genDizilimi[0];
		genDizilimi2[1] = genDizilimi[1];
		genDizilimi2[2] = genDizilimi[2];
		genDizilimi2[3] = genDizilimi[3];
		genDizilimi2[4] = 'T';
		genDizilimi2[5] = genDizilimi[5];
		genDizilimi2[6] = genDizilimi[6];
		genDizilimi2[7] = genDizilimi[7];
		genDizilimi2[8] = genDizilimi[8];
		genDizilimi2[9] = genDizilimi[9];
		
		
		//Diğer hücrenin değerlerini de atadım
		besinMiktari3 = besinMiktari/2;
		telomerazMiktari3 = telomerazMiktari/2;
		bulunduguNesilSayisi3 = bulunduguNesilSayisi+1;
		mutasyonGecirdiMi3 = false;
		
		
		//Genleri tek tek eşitledim. !! BAŞKA SEÇENEĞİM YOK. Arrayleri doğrudan atayamam!
		genDizilimi3[0] = genDizilimi[0];
		genDizilimi3[1] = genDizilimi[1];
		genDizilimi3[2] = genDizilimi[2];
		genDizilimi3[3] = genDizilimi[3];
		genDizilimi3[4] = genDizilimi[4];
		genDizilimi3[5] = genDizilimi[5];
		genDizilimi3[6] = genDizilimi[6];
		genDizilimi3[7] = genDizilimi[7];
		genDizilimi3[8] = genDizilimi[8];
		genDizilimi3[9] = genDizilimi[9];
		
		//Ana hücre artık 2 tane yeni hücre gibi tanımladığım için eski değerleri sildim!
		besinMiktari = 0;
		telomerazMiktari = 0;
		
		
	}
	
}
