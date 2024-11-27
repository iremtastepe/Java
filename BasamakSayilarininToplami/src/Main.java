import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, basamak = 0, toplam = 0;
        int tempSayi, sayiDegisken;

        System.out.print("Sayıyı giriniz: ");
        sayi = input.nextInt();

        tempSayi = sayi;

        // Basamak sayısını bul
        while (tempSayi != 0) {
            tempSayi /= 10;
            basamak++;
        }

        System.out.println("Basamak sayısı: " + basamak);

        // Her basamaktaki rakamı for ile işle
        tempSayi = sayi; // Sayıyı sıfırlanmış olduğu için tekrar ata
        for (int i = 0; i < basamak; i++) {
            sayiDegisken = tempSayi % 10; // Son basamağı al
            toplam += sayiDegisken;      // Toplama ekle
            tempSayi /= 10;             // Sayıyı bir basamak küçült
        }

        System.out.println("Basamakların toplamı: " + toplam);

    }
}