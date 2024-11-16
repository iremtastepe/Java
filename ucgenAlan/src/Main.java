//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a , b , c;


        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz: ");
        a = input.nextDouble();
        System.out.print("2. Kenarı Giriniz: ");
        b = input.nextDouble();
        System.out.print("3. Kenarı Giriniz: ");
        c = input.nextDouble();

      
        double u = (a+b+c)/2;


        double alan =  Math.sqrt(u * (u - a) * (u-b) * (u-c));


        //Math.sqrt() = karekök alır

        System.out.println("Üçgenin alanı : " +alan);




    }
}