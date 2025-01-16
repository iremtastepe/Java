

public abstract class Siparis {
    String tarih;
    String numara;
    Musteri musteri;

    Siparis(String tarih, String numara , Musteri musteri){
        this.numara=numara;
        this.tarih=tarih;
        this.musteri=musteri;
    }

    public void Onayla() {
        System.out.println(musteri.ad + " " + numara + "no'lu siparişiniz olaylandı.");
    }

    public void Kapat(){
        System.out.println( musteri.ad +" " + numara + "no'lu siparişiniz kapatıldı.");
    }


}
