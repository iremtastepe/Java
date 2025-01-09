//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] list = {1 , 2 , 3 , 4 ,5};
        double sum =0.0;
        for (int i=0; i<list.length; i++) {
            sum+=list[i];
        }

        double ort = sum / list.length;
        System.out.println(ort);
    }
}