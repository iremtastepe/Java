public class Kadin extends Emeklilik{


    public double Sorgula(int calismaSuresi , String meslek , EYT eyt) {
        if (calismaSuresi>5000 && eyt.sgkyil>20 ) {
            System.out.println("kadın emekli oldu.");
        }
        if (meslek.equals("4A")) {
            calismaSuresi+=calismaSuresi*0.15;
        }
        else if (meslek.equals("4B") || meslek.equals("4C") ) {
            return calismaSuresi;
        }

        return calismaSuresi;
    }
}
