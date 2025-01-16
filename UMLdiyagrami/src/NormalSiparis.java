

public class NormalSiparis extends Siparis{

    NormalSiparis(String tarih, String numara , Musteri musteri) {
        super(tarih , numara , musteri );
    }

   // @Override
    public void Sevk() {
        System.out.println( musteri.ad+ " " + numara + " no'lu siparişiniz sevk ediliyor.");
    }
     public void TeslimAl(){
         System.out.println(musteri.ad+ " " + numara + " no'lu siparişiniz teslim edildi.");
     }


}
