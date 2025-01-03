import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int metod(int sayi){
        
        if (sayi>0) {
            System.out.println(sayi + " ");
            metod(sayi-5);
            System.out.println(sayi + " ");
        }
       else
           System.out.println(sayi + " ");


        return sayi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi = input.nextInt();
        metod(sayi);


    }
}