//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calisan calisan = new Calisan();

        calisan.performansrolu =new Stajyer();
        System.out.println(calisan.performansrolu.PerfDegerlendirme(52));

        calisan.performansrolu =new TamZamanli();
        System.out.println(calisan.performansrolu.PerfDegerlendirme(52));

        calisan.isalimrolu=new StandarIs();
        System.out.println(calisan.isalimrolu.IsNotu(68));

        calisan.isalimrolu=new ZorlayiciIs();
        System.out.println(calisan.isalimrolu.IsNotu(68));
    }
}