package OOP;

public class ClassStudent {
    
    //bknz. StudentClass...

    int no;
    String isim;
    int sınıf;
    boolean aktif;

   
    public ClassStudent(){

    }

    public ClassStudent(int no){
        this.no = no;
    }

    public ClassStudent(int no, String isim){
        this(no);
        this.isim = isim;
    }

    public ClassStudent(int no, String isim, int sınıf){
        this(no,isim);
        this.sınıf= sınıf;
    }

    public ClassStudent(int no, String isim, int sınıf, boolean aktif){
        //this.isim = isim;
        //this.no = no;
        //this.sınıf = sınıf;  //Buradaki kodları referansla kısaltıyoruz.
        this(no,isim,sınıf); //Ve tek satır haline getiriyoruz. Buradaki constructur anlamına geliyor.
        this.aktif = aktif;
    }

    public void ogrenciBilgileri(){
       /*
       if (aktif) {
           System.out.println("Ad: " + isim + " -- Numara: " + no + "  --  Aktif : " + aktif + "  -- Sınıf : " + sınıf);
       }else{
           System.out.println("Öğrenci aktif değil....");
       }
       */
        System.out.println("Ad: " + isim + " -- Numara: " + no + "  -- Sınıf : " + sınıf  + "  --  Aktif : " + aktif);

    }

}
