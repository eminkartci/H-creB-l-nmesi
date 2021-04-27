package src;

import java.util.Random;

public class Ortam {

    // Genel Sabitler
    private char[] nukleikAsitler       = {'A','G','T','S'};
    private String[] HUCRE_ISIMLERI     = {"Bitki Hucresi","Mantar Hucresi","Hayvan Hucresi","Bakteri","Arke"};
    private double MAX_BESIN_MIKTARI    = 10;
    private double MAX_BUYUKLUK         = 80;
    private int DNA_UZUNLUGU            = 150;

    // Genel Değişkenler
    ArrayList<Hucre> hucreList = new ArrayList<Hucre>();
    Random random = new Random();

    public static void main(String[] args){
        
    }

    // Bu method verilen sayı kadar rastgele hücre oluşturur
    public void rastgeleHucreOlustur(int hucreSayisi){

        for(int i=0 ; i < hucreSayisi ; i++){
            // rastgele bir isim sec
            String randomHucreIsmi      = HUCRE_ISIMLERI[random.nextInt(HUCRE_ISIMLERI.length)];
            // rastgele besin miktari sec
            double randomBesinMiktari   = random.nextDouble() * MAX_BESIN_MIKTARI;
            // rastgele buyukluk sec
            double randomBuyukluk       = random.nextDouble() * MAX_BUYUKLUK;

            // Hucre olustur
            Hucre yeniHucre = new Hucre(i,randomHucreIsmi,randomBesinMiktari,randomBuyukluk,rastgeleDNAOlustur(DNA_UZUNLUGU));
            // Hucreyi Ortam'daki array list'e ekle
            hucreList.add(yeniHucre);
        }
    }
    
    // Verilen uzunlukta random bir DNA char arraylist'i oluşturma
    public ArrayList<Character> rastgeleDNAOlustur(int DNAUzunlugu){

        // Geçici bir arraylist oluştur
        ArrayList<Character> geciciDNA = new ArrayList<Character>();

        for(int i=0 ; i < DNAUzunlugu ; i++){
            // rastgele bir nukleik asit sec ve sonuna ekle
            geciciDNA.add(nukleikAsitler[random.nextInt(nukleikAsitler.length)]);

        }

        // Oluşturduğun arraylist'i geri gönder
        return geciciDNA;
    }




    
}
