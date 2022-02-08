package KontrolYapilari;

public class IfElseifElse {

    public static void main(String[] args) {

        int x = 5;
        int y = 55;

        if (x < y){
            System.out.println("x < y");
        }else if (x > y){
            System.out.println("x > y");
        }else {
            System.out.println("x = y");
        }




        int a = 1, b = 5, c = 0;

        if (a > b){
            c = a - b;
        }else{
            c = a + b;
        }
        System.out.println("C'nin değeri : " + c);

      //Yukarıdaki ifadeyi tek satırda yazabiliriz.

        c = (a > b) ? (a - b) : (a + b);
        System.out.println("C'nin değeri : " + c);

    }
}
