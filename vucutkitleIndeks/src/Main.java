//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy , kilo;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz: ");
        boy = input.nextDouble();
        System.out.println("Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        double Indeks = kilo / (boy*boy);
        System.out.println(Indeks);

    }
}