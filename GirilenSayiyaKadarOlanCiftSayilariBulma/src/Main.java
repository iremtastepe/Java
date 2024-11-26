import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner input = new Scanner(System.in);
        int k , i , sayac=0;
        int toplam =0;


        System.out.print("Sayıyı giriniz:");
        k = input.nextInt();

        for(i=0; i<k; i++) {
            if (i%3==0 && i%4==0) {
                System.out.println(i);
                toplam=toplam+i;
                sayac++;
            }
        }
        System.out.println("Sayıların toplamı " + toplam);
        System.out.print("Sayıların ortalaması " + toplam/sayac);
        

    }
}