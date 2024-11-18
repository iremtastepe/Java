//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     int n1 , n2 , select;

     Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        n2 = input.nextInt();

        System.out.println("İşlem yapmak istediğiniz sayıyı giriniz:");

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam: " + n1+n2);
                break;
            case 2:
                System.out.print("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çaprma: " + n1*n2);
                break;
            case 4:
                if (n2!=0){
                    System.out.print("Bölme: " + n1/n2);
            } else if (n2==0) {
                    System.out.println("Hiçbir Sayı 0'a bölünemez");
                }

                break;
            default:
                System.out.println("Yanlış Sayı Girdiniz");

        }
    }
}