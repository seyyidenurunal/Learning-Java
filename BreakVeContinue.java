package KontrolYapilari;

public class BreakVeContinue {

    public static void main(String[] args) {

        System.out.println("1--------------------------------------");
        for (int k = 0; k < 10; k++ ){
                if(k == 4) {  //Break'i yukarı yazarsak 3'e kadar çalıştıracaktır.
                       break;
            }
            System.out.println(k + " -- ");
        }


        System.out.println("2--------------------------------------");
        for (int i = 0; i < 10; i++ ){

            System.out.println(i + " -- ");

            if(i == 4); {
                break;
            }
        }


        System.out.println("3--------------------------------------");
        distakifor:
        for (int i = 0; i < 10; i++ ) {

            iceridekifor:
            for (int d = 0; d < 3; d++) {

                System.out.println("i : " + i + "  d : " + d);

                if (i == 1 && d == 2) {
                    break distakifor; //Eğer bu etiketi vermeseydik direk hangi for'un ,çindeyse onun için çalışacaktı.

                }
            }
        }


        System.out.println("4--------------------------------------");
        for (int i = 0; i < 10 ; i++){

            if (i == 2){
                continue;  // 2'yi gördüğünde geç, yazma, diğerlerini yazmaya dvam et demek oluyor.
            }

            System.out.println(i + " -- ");
        }


        System.out.println("5--------------------------------------");
        for (int i = 0; i < 10 ; i++){

            if (i == 2){
                return;  // return'un break'den farkı return tamamen metodu sonlandırır.
            }

            System.out.println(i + " -- return ");

        }


        System.out.println("BU RETURN'DAN DOLAYI EKRANA YAZILMAZ.");


    }

}
