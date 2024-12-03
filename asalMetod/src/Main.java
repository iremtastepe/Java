import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void asal(int a) {
        if (a < 2) { // Asal sayılar 2'den başlar
            System.out.println("Sayı asal değildir");
            return;
        }

        boolean isAsal = true;
        for (int i = 2; i <= a / 2; i++) { // Sadece 2'den a/2'ye kadar kontrol
            if (a % i == 0) {
                isAsal = false;
                break; // Asal olmadığını bulduktan sonra döngüyü durdur
            }
        }

        if (isAsal) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        System.out.print("Sayıyı giriniz: ");
        a = input.nextInt();
        asal(a);


    }
}