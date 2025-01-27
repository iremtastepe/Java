public class Erkek extends Emeklilik {

    public double Sorgula(int calismaSuresi, String meslek , EYT eyt) {

        if (calismaSuresi > 5500 && eyt.sgkyil > 20) {
            System.out.println("erkek emekli oldu.");
        }
        if (meslek.equals("4A")) {
            calismaSuresi+= calismaSuresi*0.15;
        } else if (meslek.equals("4B") || meslek.equals("4C") ) {
            calismaSuresi+= calismaSuresi*0.07;
        }

        return calismaSuresi;
    }

}

