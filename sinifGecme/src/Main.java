//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat , fiz , kim , turk;
        int toplam = 0; //notların toplamını tutar
        int sayac = 0; // kaç tane not girildiğini tutar
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat >=0 && mat<=100) {
            toplam = toplam+mat;
            sayac++;
        }
        else {
            System.out.println("Notunuz Ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = input.nextInt();
        if (fiz >=0 && fiz<=100) {
            toplam = toplam+fiz;
            sayac++;
        }
        else {
            System.out.println("Notunuz Ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextInt();
        if (kim >=0 && kim<=100) {
            toplam = toplam+kim;
            sayac++;
        }
        else {
            System.out.println("Notunuz Ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turk = input.nextInt();
        if (turk >=0 && turk<=100) {
            toplam = toplam+turk;
            sayac++;
        }
        else {
            System.out.println("Notunuz Ortalamaya dahil edilmeyecektir.");
        }






        if (sayac > 0) {
            double ort = toplam / sayac;
            System.out.println("Ortalamanız: " +ort);

            if(ort>=55) {
                System.out.println("Geçtiniz");
            }
            else {
                System.out.println("Kaldınız");
            }

        }
       
    }
}