package Operatorler;

public class ArttırmaVeAzaltmaOperatorleri {
    public static void main(String[] args) {

        int sayi1 =  10;
        int sayi2 = ++sayi1; //Önce sayıyı bir arttır sonra atama yap.
        int sayi3 = sayi1--; //Önce sayıyı ata sonra bir azalt.

        System.out.println("SONUÇ : " + ( (sayi1) + (--sayi2) + (sayi3++) ) ); //Toplama işlemi yapabilmek için sayıları eksta bir parantez içine almak gerekiyor.
                                                                               // Eğer yazdırılmak istenen ifade içerisinde bir tane bile string ifade varsa.


        



    }
}
