//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        double km;
        Scanner input = new Scanner(System.in);
        System.out.print("KM giriniz: ");
        km = input.nextDouble();

        int acilis = 10;
        double taksimetre = 2.20;
        double ucret = (km*taksimetre) + acilis;

        ucret = (ucret < 20) ? 20 : ucret;

        System.out.println("Ödeyeceğiniz tutar : " +ucret);
        
    }
}