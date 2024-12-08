import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a kenarını giriniz: " );
        double a = input.nextDouble();
        System.out.print("b kenarını giriniz: " );
        double b = input.nextDouble();
        System.out.print("c kenarını giriniz: " );
        double c = input.nextDouble();

        Heron heron = new Heron(a , b, c);
        heron.Yazdir();
      


    }
}