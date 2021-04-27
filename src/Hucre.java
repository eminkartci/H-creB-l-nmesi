import java.util.ArrayList;

public class Hucre {

    // Özellikler
    private int ID;         
    private String isim;    

    private double besinMiktari;    
    private double buyukluk;        

    private ArrayList<Character> DNA;

    // Yapılandırıcı
    public Hucre(int ID,String isim,double besinMiktari,double buyukluk,ArrayList<Character> DNA){

        this.ID = ID;
        this.isim = isim;
        this.besinMiktari = besinMiktari;
        this.buyukluk = buyukluk;
        this.DNA = DNA;

    }


    // toString ile bilgileri al
    public String toString(){

        String content = "\n-------> HÜCRE <-------\n"
                        +"| ID: " + this.ID                         + "\n"
                        +"| Isim: " + this.isim                     + "\n"
                        +"| Besin Miktari: " + this.besinMiktari    + "\n"
                        +"| Büyüklük: " + this.buyukluk             + "\n"
                         ;

        return content;
    }


    // Ekranda Göster
    public void hucreyi_ekrana_yazdir(){
        System.out.println(this.toString());
    }

    // GETTER SETTER 

    public void setBesinMiktari(double besinMiktari){
        this.besinMiktari = besinMiktari;
    }

    public void setBuyukluk(double buyukluk){
        this.buyukluk = buyukluk;
    }

    public double getBesinMiktari(){
        return this.besinMiktari;
    }

    public double getBuyukluk(){
        return this.buyukluk;
    }

}