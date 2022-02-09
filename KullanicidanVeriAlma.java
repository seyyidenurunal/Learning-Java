package KontrolYapilari;
import java.util.Scanner;
public class KullanicidanVeriAlma {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        int kullanici = tara.nextInt(); //Kullanıcıdan intiger veri alır.
        System.out.println("Kullanıcınn girdiği değer : " + kullanici);

        double kullanicidouble = tara.nextDouble(); //Kullanıcıdan double veri alır.
        System.out.println("Kullanıcınn girdiği double değer : " + kullanicidouble);

        String isim = tara.next(); //Kullanıcıdan tek kelimelik veri alır.
        System.out.println("Girilen isim : "+ isim);

        tara.nextLine();
        String isimsoyisim = tara.nextLine(); // Kullanıcıdan birden fazla kelime almayı sağlar.
        System.out.println("Girilen isim soyisim : "+ isimsoyisim);


        char harf = tara.next().charAt(0);
        System.out.println("Girilen ilk harf : " + harf); //Kullanıcının girdiği ifadedeki ilk harfi alır.



    }

}
