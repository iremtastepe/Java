public class YariZamanli extends Performans{
    @Override
    public int PerfDegerlendirme(int perfNot){
        if (perfNot>60) {
            System.out.println("yari zamanli - degerlendirmeyi geçtiniz");
        } else {
            System.out.println("yari zamanli - degerlendirmeden kaldınız");
        }
        return perfNot;
    }
}
