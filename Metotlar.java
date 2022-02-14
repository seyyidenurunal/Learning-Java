public class Metotlar {

    public static void main(String[] args) {
        menu(); // Ana metotta menü metodunu çalıştırmayı sağlar.
        sayilariTopla(5,8);
        sayilariCikar(5,8);

        int i = 5;
        sayiyiDegistir(i);

        int donulenDeger = sayilariCikar(57,44);
        System.out.println("dönülen değer : " + donulenDeger);

        //Parametre almayan ve geriye değer döndüren metot örneği
        double rastgeleSayi =  Math.random();
        System.out.println("Rastgele Sayı : " + rastgeleSayi );
        System.out.println("Rastgele Sayı : " + Math.random() );

    }


    public static int topla (int s1, int s2){ //İnt ifadesi geri döndürülecek ifadenin dönüş tipi'ni gösterir. Geriye değer döndürmeyen metotların dönüş tipi void olur.
        //topla = isim ve parantez içerisindeki parametreler : Metot Signature olarak adlandırılır.
        return s1 +s2 ;
    }


    public static void menu(){
        System.out.println("---------------MENÜ---------------");
        System.out.println("1- İki sayının toplamını bul");
        System.out.println("2- İki sayının farkını bul");
        System.out.println("3- İki sayının çarpımını bul");
    }


    //Parametre alan metot örneği :
    public static void sayilariTopla(int x, int y){
        System.out.println("x = " + x + " , y = " + y + " -- " + "Toplam : " + (x+y));

    }


    //Parametre alan ve geriye değer döndüren metot örneği:
    public static int sayilariCikar(int k, int d) {
        System.out.println("x = " + k + " , y = " + d + " -- " + "Fark : " + (k-d));
        return (k - d);
    }


    public static void sayiyiDegistir(int i) {
        i = i+10;
        System.out.println("Gönderilen sayının 10 fazlası : " + i);
    }


}
