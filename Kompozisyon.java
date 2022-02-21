package Kompozisyon;

public class Kompozisyon {

    public static void main(String[] args) {

        Araba myAraba = new Araba();
        myAraba.hareketeGec();
        myAraba.dur();

    }


    }


class Motor{
     String isim;
     int beygirGücü;

    public Motor(){
        isim = "Hyundai";
        beygirGücü = 135;
        System.out.println(isim + " isimli motor oluşturuldu.");
    }

    public Motor(String isim, int beygirGücü) {
        this.isim = isim;
        this.beygirGücü = beygirGücü;
    }

    public void calistir(){
        System.out.println(isim + " isimli motor Çalıştı...");
    }

    public void durdur(){
        System.out.println(isim + " isimli motor Durdu...");
    }


}

class Araba {
    Motor arabaMotoru; // Kompozisyon örneği : bir sınıfı başka bir sınıf içerisinde kullanmaktır. Herhangi bir alt-üst ilişkisi yoktur.
    String renk; // String'ler de birer kompozisyon örneğidir.
    String marka;
    int üretimYılı;

    public Araba() {
        arabaMotoru = new Motor();
        renk = "Gri";
        marka = "Hyundai";
        üretimYılı = 2015;
        System.out.println( marka + " markalı araba oluşturuldu.");
    }

    public void hareketeGec() {
        System.out.println("Araba harekete geçiyor.. --  " + marka );
    }

    public void dur() {
        System.out.println("Araba durdu... --  " + marka );
    }

}
