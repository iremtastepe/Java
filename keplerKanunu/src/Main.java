import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a değerini giriniz: ");
        double a = input.nextDouble();
        System.out.print("b değerini giriniz: ");
        double b = input.nextDouble();
        System.out.print("aci değerini giriniz: ");
        int aci = input.nextInt();

        if (a > b && b > 0) {
            Kepler kepler = new Kepler(a, b, aci);
            kepler.Yazdir();
        } else {
            System.out.println("Hatalı girdi! a > b ve b > 0 olmalıdır.");
        }

    }
}