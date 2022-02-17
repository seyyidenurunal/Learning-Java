package StaticKavrami;

public class StaticKavramı {
    public static void main(String[] args) {

        Memur m1 = new Memur();
        m1.setIsim("İnan İlhan");
        m1.setMaas(5000);

        Memur m2 = new Memur();
        m2.setIsim("Ayşe Işım");
        m2.setMaas(6000);

        Memur.kanunuSoyle();

    }
}

class Memur{
    private String isim;
    private int maas;
    private static int memurSayısı;

    public Memur(){
        memurSayısı ++ ;
        System.out.println("Memur Sayısı : " + memurSayısı);
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setMaas(int maas) {
        if(maas< 0){
            maas = 0;
        }else{
            this.maas = maas;
        }
    }

    public String getIsim() {
        return isim;
    }

    public int getMaas() {
        return maas;
    }

   public void bilgiler(){
       System.out.println("isim : " + isim );
   }

   public static void kanunuSoyle(){  //Sınıfa özgü değişken
       System.out.println("657 Sayılı Kanun : ");
       //bilgiler();'i burada çağıramayız.
   }


}