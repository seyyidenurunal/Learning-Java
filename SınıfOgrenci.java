package Encapsulation;

public class SınıfOgrenci {

    public static void main(String[] args) {

        OgrenciSınıf a = new OgrenciSınıf(458,"Ayşe Ünal", 5, true);
        a.ogrenciYazdır();
        a.setNo(111);
        System.out.println("Ayşe Ünal'ın numarası güncellendi...");
        a.ogrenciYazdır();
        a.setSınıf(6);
        System.out.println("Ayşe Ünal'ın sınıfı güncellendi...");
        a.ogrenciYazdır();

        System.out.println("Ayşe Ünal'ın Numarası : " + a.getNo()); //Private bilgileri okumayı sağlar.




    }



}
