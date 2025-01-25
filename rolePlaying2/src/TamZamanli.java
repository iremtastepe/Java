public class TamZamanli extends Performans{
    @Override
    public int PerfDegerlendirme(int perfNot){
        if (perfNot>70) {
            System.out.println("tam zamanli - degerlendirmeyi geçtiniz");
        } else {
            System.out.println("tam zamanli - degerlendirmeden kaldınız");
        }
        return perfNot;
    }
}
