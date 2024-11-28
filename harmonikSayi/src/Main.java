import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Java ile girilen sayının harmonik serisini bulan program yazacağız.
        Scanner input = new Scanner(System.in);
        double toplam=0;
        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();

        for (double i=1; i<=n; i++){

            toplam+=(1/i);

        }
        System.out.println(toplam);
    }
}