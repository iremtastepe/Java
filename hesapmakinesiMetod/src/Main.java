import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int toplam(int a , int b) {
        int sonuc = a+b;
        System.out.print("Toplam: " +sonuc + "\n");
        return sonuc;
    }
    static int cikarma(int a , int b) {
        int sonuc = a-b;
        System.out.print("Çıkarma: " +sonuc + "\n");
        return sonuc;
    }
    static int carpma(int a , int b) {
        int sonuc = a*b;
        System.out.print("Çarpım: " +sonuc + "\n");
        return sonuc;
    }
    static int bolme(int a , int b) {
        if (b==0) {
            System.out.println("Taban 0 olamaz!");
            return 0;
        }
        int sonuc = a/b;
        System.out.print("Bölme: " +sonuc + "\n");
        return sonuc;
    }
    static int us(int a , int b) {
        int sonuc=1;
        for (int i=1; i<=b; i++) {
             sonuc = sonuc*a;
        }
        System.out.print("üs İşlemi: " +sonuc + "\n");
        return sonuc;
    }
    static int mod(int a , int b) {
       int sonuc = a%b;
        System.out.print("Mod:" +sonuc + "\n");
        return sonuc;
    }
    static void dik(int a , int b) {
        System.out.print("Cevre: " + 2*(a+b) + "\n");

        System.out.print("Alan: " + a*b + "\n");

    }





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim , a , b;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println("Menü");

        while (true) {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            secim = input.nextInt();
            if (secim==0) {
                System.out.println("Çıkış Yapıldı");
                break;
            }
            System.out.print("Birinci sayı: ");
            a = input.nextInt();
            System.out.print("İkinci sayı: ");
            b = input.nextInt();

            switch (secim) {
                case 1:
                    toplam(a, b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a, b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    us(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    dik(a,b);
                    break;
                default:
                    System.out.println("YANLIŞ DEĞER GİRDİNİZ.");

            }
        }



    }
}