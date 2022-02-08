package KontrolYapilari;

public class WhileDongusu {

    public static void main(String[] args) {

        int i = 0;
        while (i < 20) {
            System.out.println(i + " -  Merhaba");
            i++;

        }

        //Koşul sağlansın veya sağlanmasın kodun bir kere çalışmasını sınra şarta bakılmasını istediğimiz durumlarda kullanıyoruz , do while 'ı.

        int s = 0;
        do {
            System.out.println(s + "  --  hi");
            s++;
        }while (s < 5);

    }
}
