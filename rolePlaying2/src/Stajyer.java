public class Stajyer extends Performans{
    @Override
    public int PerfDegerlendirme(int perfNot){
        if (perfNot>50) {
            System.out.println("stajyer - degerlendirmeyi geçtiniz");
        } else {
            System.out.println("stajyer - degerlendirmeden kaldınız");
        }
        return perfNot;
    }
}
