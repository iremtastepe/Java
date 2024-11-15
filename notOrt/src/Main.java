
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mat , fizik, kimya , biyoloji;

        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextDouble();
        System.out.println(mat);

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextDouble();
        System.out.println(fizik);

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextDouble();
        System.out.println(kimya);

        System.out.print("Biyoloji notunuzu giriniz:");
        biyoloji = input.nextDouble();
        System.out.println(biyoloji);

       double ort = (mat+fizik+kimya+biyoloji)/4;
        System.out.println("Not ortalamanız " + ort);

        if(ort>60) {
            System.out.println("Geçti");

        }
        else {
            System.out.println("Kaldı");
        }


    }
}