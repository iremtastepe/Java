import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int sayi;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        a = input.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        sayi = input.nextInt();
        int enBuyuk=sayi;
        int enKucuk=sayi;

        for (int i=2; i<=a; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();
        }

        if (sayi>enBuyuk) {
            enBuyuk=sayi;
        }
        else if (sayi<enKucuk) {
            enKucuk=sayi;
        }

        System.out.println("En büyük sayı: " +enBuyuk);
        System.out.print("En küçük sayı: " +enKucuk);



    }
}