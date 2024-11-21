import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a , b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: a:  ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: b:  ");
        b = input.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz: c:  ");
        c = input.nextInt();

        //Sayıları büyükten küçüğe sıralama

        if (a>b && a>c) {
            if (b>c) {
                System.out.println("a>b>c");
            }
            else {
                System.out.println("a>c>b");
            }
        }
        else if (b>c && b>a) {
            if (c>a) {
                System.out.println("b>c>a");
            }
            else {
                System.out.println("b>a>c");
            }
        }
        else if (c>b && c>a) {
            if (b>a) {
                System.out.println("c>b>a");
            }
            else {
                System.out.println("c>a>b");
            }
        }

    }
}