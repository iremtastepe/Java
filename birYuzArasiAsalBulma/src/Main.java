//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i =2; i<=100; i++) {
            boolean asal= true;
            for (int bolen=2;  bolen<i; bolen++ ) {
                if (i%bolen==0) {
                    asal = false;
                    break;

                }

            }
            if (asal) {
                System.out.print(i + " ");
            }


            }
        }


    }
