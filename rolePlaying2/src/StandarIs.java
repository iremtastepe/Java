public class StandarIs extends IsAlim{
    @Override
    public int IsNotu(int sinav) {
        if (sinav>60) {
            System.out.println("Standart is: sınavı geçtiniz");
        }
        else {
            System.out.println("Standart is : sınavdan kaldınız");
        }
        return sinav;

    }
}
