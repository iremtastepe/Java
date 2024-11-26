import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner input = new Scanner(System.in);
        int k , i;

        System.out.print("Sınır sayısını giriniz: ");
        k = input.nextInt();

        System.out.println("4ün kuvvetleri");
        for (i=1; i<k; i*=4){
            System.out.println(i);
        }

        System.out.println("5in kuvvetleri");
        for (i=1; i<k; i*=5){
            System.out.println(i);
        }

    }
}