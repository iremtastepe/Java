import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi, parola;
        int hak = 3;
        int secim , para;
        int bakiye =1500;


        while (hak > 0) {
            System.out.print("Kullanıcı Adı: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Parola: ");
            parola = input.nextLine();

            if (kullaniciAdi.equals("irem") && parola.equals("irem123")) {
                System.out.println("Giriş Yaptınız");
                do {

                    System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış");
                    System.out.print("Yapmak İstediğiniz işlemi seçiniz: ");
                    secim = input.nextInt();
                    if (secim==1) {
                        System.out.println("Yatırılacak para miktarı: ");
                        para = input.nextInt();
                        bakiye+=para;
                    }
                    if (secim==2) {
                        System.out.println("Çekilecek para miktarı: ");
                        para = input.nextInt();

                        if (para>bakiye) {
                            System.out.println("Bakiyeniz yetersiz");
                        }
                        else {
                            bakiye-=para;
                        }
                    }
                    if (secim==3) {
                        System.out.println("Bakiyeniz: " +bakiye);
                    }
                }
                while (secim !=4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;



            } else {
                hak--;
                System.out.println("Kullanıcı adınız veya şifreniz yanlış. Tekrar Deneyin.");
                if (hak==0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                }
                else {
                    System.out.println("Sisteme giriş yapmak için kalan hakkınız " +hak);
                }


            }


        }
    }
}