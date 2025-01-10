//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int[] list = {5, 9 , 0 , 4, 7 , 20 , 45};
         double sum = 0;
         double n=0;

         for (int i=0; i<list.length; i++) {
             if (list[i]!=0) {
                 sum+=1.0/list[i];
                 n++;

             }
         }
         if (n>0) {
             double harmonik= n/ sum;
             System.out.println(harmonik);
         }





    }
}