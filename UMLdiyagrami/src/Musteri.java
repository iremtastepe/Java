public class Musteri {
    String ad;
    String lokasyon;

    Musteri(String ad , String lokasyon){
        this.ad=ad;
        this.lokasyon=lokasyon;
    }

    public void gonderilenSiparis(){
        System.out.println(ad  + " siparisiniz " +lokasyon + " a dogru gönderildi.");
    }

    public void alinanSiparis(){
        System.out.println(ad  + " siparisiniz alındı.");
    }
}
