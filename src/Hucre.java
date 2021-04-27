package src;


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
                        +"| ID: " + this.ID
                        +"| Isim: " + this.isim
                        +"| Besin Miktari: " + this.besinMiktari
                        +"| Büyüklük: " + this.buyukluk
                         ;

        return content;
    }


    // Ekranda Göster
    public void hucreyi_ekrana_yazdir(){
        System.out.println(this.toString());
    }


}