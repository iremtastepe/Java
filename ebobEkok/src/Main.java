import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, ebob = 1 , ekok=1;
        System.out.print("Birinci sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();


        if (a < b) {
                for (int i = 1; i <= a; i++) {
                    if (a % i == 0 && b % i == 0) {
                        System.out.println(i);
                        ebob = i;
                    }
                }
                System.out.println("Ebob: " + ebob);
            }

            else {
                System.out.println("Birinci sayı ikinci sayıdan küçük olmamalı!!");
            }

        if (a < b) {
            for (int i = 1; i <= (a*b); i++) {
                if (i % a == 0 && i % b == 0) {
                    System.out.println(i);
                    break;
                }
            }

        }






    }
}
