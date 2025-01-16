public class OzelSiparis extends Siparis {

    OzelSiparis(String tarih , String numara , Musteri musteri){
     super(tarih , numara , musteri);
    }
    public void Sevk() {
        System.out.println(  musteri.ad +  " " + numara + " no'lu siparişiniz sevk ediliyor.");
    }





}
