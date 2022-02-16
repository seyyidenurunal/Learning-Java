package Encapsulation;

public class OgrenciSınıf {
    //bknz. SınıfOgrenci....

    private int no;
    private String isim;
    private int sınıf;
    private boolean aktif;

    public void setNo(int yeniNo){  // Private bilgileri değişiklik yapabilmeyi sağlar.
        this.no = yeniNo;
    }

    public void setSınıf(int yeniSınıf){
        this.sınıf = yeniSınıf;
    }

    public int getNo(){ // Private bilgileri okuayabilmeyi sağlar.
        return this.no;
    }


    public OgrenciSınıf(int no, String isim, int sınıf, boolean aktif){
        this.isim = isim;
        this.no = no;
        this.sınıf = sınıf;
        this.aktif = aktif;
    }

    public void ogrenciYazdır(){

        System.out.println("Ad: " + isim + " -- Numara: " + no + "  -- Sınıf : " + sınıf  + "  --  Aktif : " + aktif);

    }


// Alt + Insert ile hazır olarak constructor, getter, setter oluşturabiliriz.
}
