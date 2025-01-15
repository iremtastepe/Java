//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isPalindrom(String str) {

        int i=0;
        int j=str.length()-1;
        while (i<j) {
            if(str.charAt(i)!= str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


    public static void main(String[] args) {

        System.out.println(isPalindrom("asa"));

    }
}