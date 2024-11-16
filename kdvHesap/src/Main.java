//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar;
        System.out.println("Tutarı giriniz:");
        tutar =input.nextDouble();
        double kdvOran = 0.18;
        double kdvOran2 = 0.08;

        if(tutar<1000 && tutar>0 ) {
          double kdv =tutar*kdvOran;
          double kdvliHesap=tutar+kdv;
            System.out.println(kdv);
            System.out.println(kdvliHesap);

        }
        else if (tutar>=1000) {
            double kdv =tutar*kdvOran2;
            double kdvliHesap=tutar+kdv;
            System.out.println(kdv);
            System.out.println(kdvliHesap);
        }
        else {
            System.out.println("Geçersiz");
        }
    }
}