import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , n;


        System.out.print("dizinin boyutunu giriniz: ");
         n = input.nextInt();
        int[] liste = new int[n];

        for (int i=0; i<n; i++){
            System.out.print(i+1 +". eleman:");
            liste[i]=input.nextInt();
        }
        Arrays.sort(liste);


        System.out.println(Arrays.toString(liste));

    }
}