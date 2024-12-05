import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("V1: ");
        int hiz = input.nextInt();

        System.out.println("V2: ");
        int hiz2 = input.nextInt();


        Arac arac = new Arac(hiz,hiz2 , 10);
        arac.String();
    }
}