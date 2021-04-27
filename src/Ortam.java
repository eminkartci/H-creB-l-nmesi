package src;

import java.util.Random;

public class Ortam {

    // Genel Sabitler
    private String[] HUCRE_ISIMLERI     = {"Bitki Hucresi","Mantar Hucresi","Hayvan Hucresi","Bakteri","Arke"};
    private double MAX_BESIN_MIKTARI    = 10;
    private double MAX_BUYUKLUK         = 80;

    // Genel Değişkenler
    ArrayList<Hucre> hucreList = new ArrayList<Hucre>();
    Random random = new Random();

    public static void main(String[] args){
        
    }

    // Bu method verilen sayı kadar rastgele hücre oluşturur
    public void rastgeleHucreOlustur(int hucreSayisi){

        for(int i=0 ; i < hucreSayisi ; i++){

            String randomHucreIsmi      = HUCRE_ISIMLERI[random.nextInt(HUCRE_ISIMLERI.length)];
            double randomBesinMiktari   = random.nextDouble() * MAX_BESIN_MIKTARI;
            double randomBuyukluk       = random.nextDouble() * MAX_BUYUKLUK;
            new Hucre(i,randomHucreIsmi,randomBesinMiktari,randomBuyukluk);
        }
    }
    
}
