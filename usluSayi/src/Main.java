import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n , k , i;
        int carpim=1;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Üssü giriniz:  ");
        k = input.nextInt();

        // 3^4=3*3*3*3
        for (i=1; i<=k; i++) {
            carpim*=n;

        }
        System.out.println("Sayiniz " + n +"^" +k +"=" +carpim);
    }
}