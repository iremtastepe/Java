import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a kenarını giriniz: ");
        int a = input.nextInt();
        System.out.print("a kenarını giriniz: ");
        int b = input.nextInt();
        System.out.print("açı değerini giriniz: ");
        int aci = input.nextInt();

        KosinusTeorem kosinusTeorem = new KosinusTeorem(a , b  , aci);
        kosinusTeorem.Bilgi();
    }
}