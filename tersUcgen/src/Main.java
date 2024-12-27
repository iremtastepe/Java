import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        int a = input.nextInt();

        for (int i=0; i<a; i++) {
            for (int j=a-i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}