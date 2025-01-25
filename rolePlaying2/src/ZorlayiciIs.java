public class ZorlayiciIs extends IsAlim{
    @Override
    public int IsNotu(int sinav) {
        if (sinav>70) {
            System.out.println("Zorlayıcı is: sınavı geçtiniz");
        }
        else {
            System.out.println("Zorlayıcı is : sınavdan kaldınız");
        }
        return sinav;

    }
}
