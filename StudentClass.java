package OOP;

public class StudentClass {
    //bknz. ClassStudent....

    public static void main(String[] args) {

        ClassStudent[] tumOgrenciler = new ClassStudent[150];

        ClassStudent c = new ClassStudent(458,"Cemile", 7,true);
        c.ogrenciBilgileri();

        ClassStudent ogr1 = new ClassStudent(154);
        ClassStudent ogr2 = new ClassStudent(155, "Hayriye");
        ClassStudent ogr3 = new ClassStudent(156, "Nuriye", 8);
        ClassStudent ogr4 = new ClassStudent(157, "Nesime", 9,true );



        ogr1.ogrenciBilgileri();
        ogr2.ogrenciBilgileri();
        ogr3.ogrenciBilgileri();
        ogr4.ogrenciBilgileri();


        tumOgrenciler[0] = ogr1;
        tumOgrenciler[1] = ogr2;
        tumOgrenciler[2] = ogr3;
        tumOgrenciler[3] = ogr4;
        tumOgrenciler[4] = new ClassStudent(15,"Ceylan"); //İstersek dizi içerisinde yeni bir nesne de oluşturabiliriz.

        System.out.println("Listedeki Öğrenciler");
        tumOgrenciler[0].ogrenciBilgileri();




    }
}
