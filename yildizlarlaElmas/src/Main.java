import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            // Boşlukları yazdır
            for (int k = 0; k < (a - i); k++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Elmasın alt kısmı
        for (int i = a - 2; i >= 0; i--) {
            // Boşlukları yazdır
            for (int k = 0; k < (a - i); k++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }


    }
