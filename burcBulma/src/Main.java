import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun , ay;
        boolean isError = false;

        System.out.print("Doğum Ayınızı giriniz:  ");
        ay = input.nextInt();
        System.out.print("Doğum Gününüzü giriniz:  ");
        gun = input.nextInt();

        switch (ay) {
            case 1:
                if (gun>=1 && gun<=31) {
                    if (gun<=22) {
                        System.out.println("Burcunuz oğlak");
                    }
                    else {
                        System.out.println("Burcunuz kova");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 2:
                if (gun>=1 && gun<=28) {
                    if (gun<=19) {
                        System.out.println("Burcunuz kova");
                    }
                    else {
                        System.out.println("Burcunuz balık");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 3:
                if (gun>=1 && gun<=31) {
                    if (gun<=20) {
                        System.out.println("Burcunuz balık");
                    }
                    else {
                        System.out.println("Burcunuz koç");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 4:
                if (gun>=1 && gun<=30) {
                    if (gun<=20) {
                        System.out.println("Burcunuz koç");
                    }
                    else {
                        System.out.println("Burcunuz boğa");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 5:
                if (gun>=1 && gun<=31) {
                    if (gun<=21) {
                        System.out.println("Burcunuz boğa");
                    }
                    else {
                        System.out.println("Burcunuz ikizler");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 6:
                if (gun>=1 && gun<=30) {
                    if (gun<=22) {
                        System.out.println("Burcunuz ikizler");
                    }
                    else {
                        System.out.println("Burcunuz yengeç");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 7:
                if (gun>=1 && gun<=31) {
                    if (gun<=22) {
                        System.out.println("Burcunuz yengeç");
                    }
                    else {
                        System.out.println("Burcunuz aslan");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 8:
                if (gun>=1 && gun<=31) {
                    if (gun<=22) {
                        System.out.println("Burcunuz aslan");
                    }
                    else {
                        System.out.println("Burcunuz başak");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 9:
                if (gun>=1 && gun<=30) {
                    if (gun<=22) {
                        System.out.println("Burcunuz başak");
                    }
                    else {
                        System.out.println("Burcunuz terazi");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 10:
                if (gun>=1 && gun<=31) {
                    if (gun<=22) {
                        System.out.println("Burcunuz terazi");
                    }
                    else {
                        System.out.println("Burcunuz akrep");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 11:
                if (gun>=1 && gun<=30) {
                    if (gun<=21) {
                        System.out.println("Burcunuz akrep");
                    }
                    else {
                        System.out.println("Burcunuz yay");
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 12:
                if (gun>=1 && gun<=31) {
                    if (gun<=21) {
                        System.out.println("Burcunuz yay");
                    }
                    else {
                        System.out.println("Burcunuz kova");
                    }
                }
                else {
                    isError = true;
                }
                break;
            default:
                System.out.println("Hatalı ay girdiniz.");
        }
             if (isError) {
                 System.out.println("Hatalı bir gün girdiniz.");
             }




    }
}