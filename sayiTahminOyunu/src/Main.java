import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right =0; //hak
        int seleceted;
        int[] wrong = new int[5];
        boolean isWin=false;

        System.out.println(number);

        while (right<5) {
            System.out.print("Sayı Tahminizi giriniz: ");
            seleceted = input.nextInt();

            if (seleceted<0 || seleceted>100) {
                System.out.println("Girilen sayı değeri 0 ile 100 arasında olmalı");
                continue;
            }

            if (seleceted==number) {
                System.out.println("Doğru Tahmin Yaptınız!");
                isWin=true;
                break;
            }
            else {
                wrong[right]=seleceted;
                right++;
                System.out.println("Hatalı sayı girdiniz tekrar deneyiniz");
                if (seleceted > number) {
                    System.out.println(seleceted + " sayısı gizli sayıdan büyüktür" );
                }
                else  {
                    System.out.println(seleceted + " sayısı gizli sayıdan küçüktür" );
                }
                System.out.println("Kalan hakkınız: " + (5-right));

            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahminleriniz" + Arrays.toString(wrong));
        }
    }
}