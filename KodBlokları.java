package Operatorler;

public class KodBlokları {

    public static void main(String[] args) {

        int a = 1;
        {
            int b = 2;

            System.out.println(a);
            System.out.println(b);

            {
                int c = 3;

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);

            }
        }

        int d = 4;
        System.out.println(a);
        System.out.println(d); // Yalnızca a ve d ifadeleri görünür çünkü diğer ifadeler bu kod bloğunun dışında kalır.

    }
}
