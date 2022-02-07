package Operatorler;

public class AritmetikAtamaOperatorleri {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        int sonuc = 0;

        sonuc += sayi1; // sonuc = sonuc + sayi1
        System.out.println("TOPLAM : " + sonuc);

        sonuc -= sayi2; // sonuc = sonuc - sayi2
        System.out.println("FARK : " + sonuc);

        sonuc *= sayi2; // sonuc = sonuc * sayi2
        System.out.println("ÇARPIM : " + sonuc);

        sonuc /= sayi2; // sonuc = sonuc / sayi2
        System.out.println("BÖLÜM : " + sonuc);


        //ALIŞTIRMA:

        double osayi = 6.50;
        double snc = 0;

        snc++;
        osayi *= snc;

        System.out.println("SONUÇ : " + osayi);

    }

}
