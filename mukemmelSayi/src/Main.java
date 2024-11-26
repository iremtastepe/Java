import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
        // toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        Scanner input = new Scanner(System.in);
        int a , toplam=0;

        System.out.print("Sayıyı giriniz: ");
        a = input.nextInt();

            for (int i=1; i<a; i++) {
                if (a%i==0) {
                    toplam+=i;
                }
            }
            if (toplam == a) {
                System.out.println("Mükemmel Sayı");
            }
            else {
                System.out.println("Mükemmel Sayı Değil");
            }


    }
}