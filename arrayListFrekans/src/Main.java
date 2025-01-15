import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] list = {10,20,20,10,10,20,5,20};
        boolean[] checked = new boolean[list.length];

        System.out.println("Tekrar Sayıları:");

        for (int i = 0; i < list.length; i++) {
            if (checked[i]) {
                // Eğer eleman kontrol edildiyse, atla
                continue;
            }

            int count = 1; // Elemanın tekrar sayısını tutar

            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    count++; // Aynı eleman bulundu, sayacı artır
                    checked[j] = true; // Bu elemanı işaretle
                }
            }

            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
    }

