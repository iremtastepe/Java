import java.util.Random;
import java.util.Scanner;

    public class MayinTarlasi {
        private String[][] tahta; // Oyuncuya gösterilecek tahta
        private String[][] mayinHaritasi; // Gerçek mayınların olduğu harita
        private int satirSayisi, sutunSayisi; // Matrisin boyutları
        private int mayinSayisi; // Toplam mayın sayısı

        // Yapıcı Metot
        public MayinTarlasi(int satir, int sutun) {
            this.satirSayisi = satir;
            this.sutunSayisi = sutun;
            this.mayinSayisi = (satir * sutun) / 4;
            this.tahta = new String[satir][sutun];
            this.mayinHaritasi = new String[satir][sutun];
            tahtaOlustur();
            mayinlariYerlestir();
        }

        // Tahtayı başlatır
        private void tahtaOlustur() {
            for (int i = 0; i < satirSayisi; i++) {
                for (int j = 0; j < sutunSayisi; j++) {
                    tahta[i][j] = "-"; // Oyuncunun göreceği tahta
                    mayinHaritasi[i][j] = "-"; // Gerçek mayın haritası
                }
            }
        }

        // Mayınları rastgele yerlestir
        private void mayinlariYerlestir() {
            Random random = new Random();
            int yerlestirilenMayin = 0;

            while (yerlestirilenMayin < mayinSayisi) {
                int satir = random.nextInt(satirSayisi);
                int sutun = random.nextInt(sutunSayisi);

                if (!mayinHaritasi[satir][sutun].equals("*")) {
                    mayinHaritasi[satir][sutun] = "*";
                    yerlestirilenMayin++;
                }
            }
        }

        // Tahtayı ekrana yazdır
        private void tahtaYazdir(String[][] matris) {
            for (int i = 0; i < satirSayisi; i++) {
                for (int j = 0; j < sutunSayisi; j++) {
                    System.out.print(matris[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Bir hücrenin çevresindeki mayınları sayar
        private int mayinSay(int satir, int sutun) {
            int sayac = 0;
            for (int i = satir - 1; i <= satir + 1; i++) {
                for (int j = sutun - 1; j <= sutun + 1; j++) {
                    if (i >= 0 && i < satirSayisi && j >= 0 && j < sutunSayisi && mayinHaritasi[i][j].equals("*")) {
                        sayac++;
                    }
                }
            }
            return sayac;
        }

        // Oyunu başlat
        public void oyunuBaslat() {
            Scanner scanner = new Scanner(System.in);
            int acilanHucre = 0;

            System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
            while (true) {
                System.out.println("================================");
                tahtaYazdir(tahta);

                System.out.print("Satır Giriniz: ");
                int satir = scanner.nextInt();
                System.out.print("Sütun Giriniz: ");
                int sutun = scanner.nextInt();

                // Koordinat sınırlarını kontrol et
                if (satir < 0 || satir >= satirSayisi || sutun < 0 || sutun >= sutunSayisi) {
                    System.out.println("Geçersiz koordinat. Tekrar deneyin.");
                    continue;
                }

                // Mayın kontrolü
                if (mayinHaritasi[satir][sutun].equals("*")) {
                    System.out.println("Game Over!!");
                    System.out.println("Mayınların Konumu:");
                    tahtaYazdir(mayinHaritasi);
                    break;
                }

                // Hücreyi aç
                if (tahta[satir][sutun].equals("-")) {
                    int mayinSayisi = mayinSay(satir, sutun);
                    tahta[satir][sutun] = String.valueOf(mayinSayisi);
                    acilanHucre++;
                }

                // Tüm güvenli hücreler açıldı mı kontrol et
                if (acilanHucre == (satirSayisi * sutunSayisi) - mayinSayisi) {
                    System.out.println("Tebrikler! Tüm güvenli hücreleri açtınız. Oyunu kazandınız!");
                    tahtaYazdir(tahta);
                    break;
                }
            }
            scanner.close();
        }



}
