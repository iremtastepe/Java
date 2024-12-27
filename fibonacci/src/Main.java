import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayac = 0;
        int k=0;
        int b=1;

        System.out.print("Sayı giriniz:");
        int a = input.nextInt();

      for (int i=0; i<a; i++) {
          System.out.println(k + " ");
          int son = k+b;

          k=b;
          b=son;


      }

    }
}