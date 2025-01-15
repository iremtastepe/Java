//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] matris = {
                {2,3,4},
                {5,6,4}  };

        int rows= matris.length;
        int cols = matris[0].length;
        int[][] transpoz = new int[cols][rows];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                transpoz[j][i]=matris[i][j];
            }
        }
        System.out.println("Matris");

        //orijinal matris
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoz");
        //transpozu
        for (int i=0; i<cols; i++) {
            for (int j=0; j<rows; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }



    }
}