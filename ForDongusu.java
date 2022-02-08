package KontrolYapilari;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ForDongusu {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i ++) {
            System.out.println("İ ' nin değeri : " + i);
            System.out.println("JAVA ÖĞRENİYORUM");

        }

        for (int i =0, j=0 ; i+j<10; i++,j++) {
            System.out.println("değer : " + i + " - " + j );
        }
/*
        //Sonsuz döngü :
        for(;;){
            System.out.println("A");
        }
*/


        
    }
}
