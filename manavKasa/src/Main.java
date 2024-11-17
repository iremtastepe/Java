//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double Armut = 2.14 , Elma = 3.67 ,  Domates = 1.11 , Muz= 0.95  , Patlican = 5.00;
        int adet1 , adet2 , adet3 , adet4 , adet5;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Adedi: ");
        adet1 = input.nextInt();
        System.out.print("Elma Adedi: ");
        adet2 = input.nextInt();
        System.out.print("Domates Adedi: ");
        adet3 = input.nextInt();
        System.out.print("Muz Adedi: ");
        adet4 = input.nextInt();
        System.out.print("Patlıcan Adedi: ");
        adet5 = input.nextInt();

        double tutar = (Armut*adet1)+(Elma*adet2)+(Domates*adet3)+(Muz*adet4)+(Patlican*adet5);
        System.out.println("Toplam Tutar: " +tutar);
    }
}