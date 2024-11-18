//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String password , answer , newPassword;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen şifrenizi Giriniz:");
        password =input.nextLine();

        if(password.equals("java123")) {
            System.out.println("Şifreniz Doğru");
        }
        else {
            System.out.println("Şifrenizi Sıfırlamak İster misiniz? E/H");
            answer = input.nextLine();
               if(answer.equals("E")) {
                  System.out.print("Lütfen Yeni Şifreyi Giriniz:");
                  newPassword = input.nextLine();
                    if(newPassword.equals("java123")) {
                        System.out.println("Yeni Şifreyle Eskisiyle Aynı Olamaz");
                }
                    else {
                        System.out.println("Şifre Başarıyla Oluşturuldu");
                    }

            }
               else{
                   System.out.println("Giriş Yapamazsınız");
               }
        }
    }
}