//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int derece;

        Scanner input = new Scanner(System.in);

        System.out.print("Havanın sıcaklığını giriniz: " );
        derece = input.nextInt();

        if (derece<5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (derece>=5 && derece<=15 ) {
            if(derece<15) {
                System.out.println("Sinemaya gidebilirsin");
            }
            if(derece>10) {
                System.out.println("Pikniğe gidebilirsin");
            }
        } else if (derece>25) {
            System.out.println("Yüzme Yapabilirsin");
        }


    }
}