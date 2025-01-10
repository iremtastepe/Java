import java.util.Scanner;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Dizideki elemanların girilen sayıdan küçük en
        // yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Integer enBuyuk =null;
        Integer enKucuk = null;

        for (int num: list ) {
            if (num<n) {
                enKucuk=num;
            } else if (num>n && enBuyuk==null) {
                enBuyuk=num;
                break;
            }

        }

        if (enBuyuk!=null) {
            System.out.println("en büyük: " +enBuyuk);
        }


        if (enKucuk!=null) {
            System.out.println("en küçük: " +enKucuk);
        }







    }
}