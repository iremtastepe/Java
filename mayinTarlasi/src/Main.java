import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını giriniz: ");
        int satir = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: ");
        int sutun = scanner.nextInt();

        MayinTarlasi oyun = new MayinTarlasi(satir, sutun);
        oyun.oyunuBaslat();

    }
}