package KontrolYapilari;

public class SwitchCaseKullanimi {

    public static void main(String[] args) {

        int gun = 3;

        if (gun == 1){
            System.out.println("Pazar");
        }else if (gun == 2){
            System.out.println("Pazartesi");
        } else if (gun == 3){
        System.out.println("Salı");
        } else if (gun == 4){
        System.out.println("Çarşamba");
        } else if (gun == 5){
        System.out.println("Perşembe");
        } else if (gun == 6){
        System.out.println("Cuma");
        } else if (gun == 7){
        System.out.println("Cumartesi");
        }

        //Switch Case Yapısı

        switch (gun){

            case 1 : System.out.println("Switch Pazar") ; break; //İlk şartın sağlandığı satırdan sonra eğer break ifadesini görmezse, tüm günleri yazmaya devam eder
            case 2 : System.out.println("Switch Pazartesi"); break;
            case 3 : System.out.println("Switch Salı"); break;
            case 4 : System.out.println("Switch Çarşamba"); break;
            case 5 : System.out.println("Switch Perşembe"); break;
            case 6 : System.out.println("Switch Cuma"); break;
            case 7 : System.out.println("Switch Cumartesi"); break; // Tek seferde alt alta olan, seçilen satırlara aynı şeyi yazmak için sağ tıklayıp "Column Selection Mod"u seçebiliriz. (Switch'ler böyle yazıldı)
            default: System.out.println("Yanlış bir gün değeri girildi...");
        }
        System.out.println("Switch Sonlandırıldı...");
        //Switch float ve double ile çalışmaz. Char, short, byte ve intiger değerlerle kullanılır.
        //Değişkenin hangi aralıkta olduğu incelenemez.

    }
}
