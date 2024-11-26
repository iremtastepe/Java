import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        Scanner input = new Scanner(System.in);
        int a , toplam=0;

        do {
            System.out.print("Sayı Giriniz:");
            a = input.nextInt();
            if (a%2==0 && a%4==0) {
                    toplam += a;
            }

        }
        while (a%2==0);
        System.out.println("Çift ve 4e bölünenlerin toplamı: " +toplam);

    }
}