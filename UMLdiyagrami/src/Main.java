//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musteri m = new Musteri("İrem" ,  "ADANA" );
        m.alinanSiparis();
        m.gonderilenSiparis();

        OzelSiparis o = new OzelSiparis(  "16-01-2025" , "A456" , m);
        o.Onayla();
        o.Sevk();
        o.Kapat();

        NormalSiparis n = new NormalSiparis("16-01-2025" , "A456" , m);
        n.Onayla();
        n.Sevk();
        n.TeslimAl();
        n.Kapat();


    }
}