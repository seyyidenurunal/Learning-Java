package OOP;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import jdk.internal.org.objectweb.asm.util.TraceAnnotationVisitor;

public class Student {

    public static void main(String[] args) {

        Class[] tumOgrenciler = new Class[150];

        Class c = new Class(458,"Cemile", 7,true);
        c.ogrenciBilgileri();

        Class ogr1 = new Class(154);
        Class ogr2 = new Class(155, "Hayriye");
        Class ogr3 = new Class(156, "Nuriye", 8);
        Class ogr4 = new Class(157, "Nesime", 9,true );


        ogr1.aktif= true;
        ogr1.ogrenciBilgileri();
        ogr2.ogrenciBilgileri();
        ogr3.ogrenciBilgileri();
        ogr4.ogrenciBilgileri();


        tumOgrenciler[0] = ogr1;
        tumOgrenciler[1] = ogr2;
        tumOgrenciler[2] = ogr3;
        tumOgrenciler[3] = ogr4;
        tumOgrenciler[4] = new Class(15,"Ceylan"); //İstersek dizi içerisinde yeni bir nesne de oluşturabiliriz.

        System.out.println("Listedeki Öğrenciler");
        tumOgrenciler[0].ogrenciBilgileri();




    }
}
