//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        int r , a ;
        double pi= 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = input.nextInt();

        double alan = (pi*(r*r)*a)/360;
        System.out.println(alan);

    }
}