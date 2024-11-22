import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Doğum Yılınızı giriniz: ");
        yil = input.nextInt();

        if (yil%12==0) {
            System.out.println("Çin Zodyağına göre burcunuz Maymun.");
        } else if (yil%12==1) {
            System.out.println("Çin Zodyağına göre burcunuz Horoz.");
        } else if (yil%12==2) {
            System.out.println("Çin Zodyağına göre burcunuz Köpek.");
        } else if (yil%12==3) {
            System.out.println("Çin Zodyağına göre burcunuz Domuz.");
        }else if (yil%12==4) {
            System.out.println("Çin Zodyağına göre burcunuz Fare.");
        }else if (yil%12==5) {
            System.out.println("Çin Zodyağına göre burcunuz Öküz.");
        }else if (yil%12==6) {
            System.out.println("Çin Zodyağına göre burcunuz Kaplan.");
        }else if (yil%12==7) {
            System.out.println("Çin Zodyağına göre burcunuz Tavşan.");
        }else if (yil%12==8) {
            System.out.println("Çin Zodyağına göre burcunuz Ejderha.");
        } else if (yil%12==9) {
            System.out.println("Çin Zodyağına göre burcunuz Yılan.");
        }else if (yil%12==10) {
            System.out.println("Çin Zodyağına göre burcunuz At.");
        }else if (yil%12==11) {
            System.out.println("Çin Zodyağına göre burcunuz Koyun.");
        }
    }
}