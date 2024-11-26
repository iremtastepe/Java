import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Java ile kombinasyon hesaplayan program yazınız.
        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner input = new Scanner(System.in);
        int i , n , r;
        int nfak=1, rfak=1, nrfak = 1;

        System.out.println("C(n,r)=?  Kombinasyon işlemi için sayıları girininiz:");
        System.out.print("n= ");
        n = input.nextInt();
        System.out.print("r= ");
        r = input.nextInt();

        for (i=1; i<=n; i++) {
            nfak=nfak*i;
        }

        for (i=1; i<=r; i++) {
            rfak=rfak*i;
        }

        for (i=1; i<=(n-r); i++) {
            nrfak=nrfak*i;
        }

        if (n>r) {
            double kombinasyon = nfak/(rfak*nrfak);
            System.out.println("sonuç: " +kombinasyon );
        }
        else {
            System.out.println("r n den büyük olamaz.");
        }

    }
}