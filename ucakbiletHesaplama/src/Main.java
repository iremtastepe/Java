import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, yolculukTipi;
        double mesafeUcret = 0.10;

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yolculuk tipini seçiniz 1-Tek Yön 2-Gidiş-Dönüş: ");
        yolculukTipi = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        if (km <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı veri girdiniz!");
        } else {
            double ucret = km * mesafeUcret;
            double indirim = 0;

               if (yas<12) {
                 indirim = ucret*0.50;
            }
               else if (yas<=24) {
                   indirim = ucret*0.10;
               }
               else if (yas>65) {
                   indirim = ucret*0.30;
               }

        double indirimliUcret = ucret - indirim;
            if (yolculukTipi == 2) {
                indirimliUcret *= 0.8; // %20 indirim
                indirimliUcret *= 2;   // Gidiş-Dönüş için iki katı ücret
            }
            System.out.println("Toplam Ücret: " +indirimliUcret);
        }




    }
}
