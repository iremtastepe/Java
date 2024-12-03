import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int us(int a , int b) {
        int sonuc =1;
        for (int i=1; i<=b; i++) {
            if (b==0) {
                return 1;
            }
            sonuc*=a;
        }
        System.out.println("Sonucunuz: " +sonuc);
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b;
        System.out.print("Üs alınacak birinci sayı: ");
        a = input.nextInt();
        System.out.print("Üs alınacak birinci sayı: ");
        b = input.nextInt();

        us(a,b);


    }
}