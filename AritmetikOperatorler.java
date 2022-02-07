package Operatorler;

public class AritmetikOperatorler {
    public static void main(String[] args) {

        int sayi1 = 60;
        int sayi2 = 40;

        System.out.println("sayı 1 : " + sayi1 + " sayı 2 : " + sayi2 + "  --  TOPLAM : " + (sayi1 + sayi2));
        System.out.println("sayı 1 : " + sayi1 + " sayı 2 : " + sayi2 + "  --  FARK : " + (sayi1 - sayi2));
        System.out.println("sayı 1 : " + sayi1 + " sayı 2 : " + sayi2 + "  --  ÇARPIM : " + (sayi1 * sayi2));
        System.out.println("sayı 1 : " + sayi1 + " sayı 2 : " + sayi2 + "  --  BÖLÜM : " + ((double)sayi1 / sayi2));
        System.out.println("sayı 1 : " + sayi1 + " sayı 2 : " + sayi2 + "  --  MOD : " + (sayi1 % sayi2));

    }
}
