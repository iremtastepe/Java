import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İsminizi giriniz: ");
        String name = input.nextLine();

        Employee emp = new Employee(name , 2000 , 45,  2000);
        emp.tax();
        emp.bonus();
        emp.raiseSalary();
        emp.string();

    }
}