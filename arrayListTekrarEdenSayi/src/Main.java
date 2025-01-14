import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] liste = {1 , 2 , 5 , 6 , 4 , 2 , 4 , 1 , 2};
        int[] tekrarEden = new int [liste.length];
        int indexBaslangic = 0;

        for (int i = 0; i < liste.length; i++) {
            // Sadece çift sayıları kontrol et
            if (liste[i] % 2 == 0) {
                for (int j = i + 1; j < liste.length; j++) {
                    // Aynı olanları bul
                    if (liste[i] == liste[j]) {
                        tekrarEden[indexBaslangic++] = liste[i];
                        break; // Aynı elemandan bir kez eklemek için iç döngüyü kırıyoruz
                    }
                }
            }
        }

        // Sonuçları yazdır
        System.out.print("Tekrar eden çift sayılar: ");
        for (int i = 0; i < indexBaslangic; i++) {
            System.out.print(tekrarEden[i] + " ");
        }
    }
}
    