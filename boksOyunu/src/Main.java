//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Tony" , 10 , 120 , 100);
        Fighter f2 = new Fighter("Steve" , 20 , 80 , 90);

        Match match = new Match(f1 , f2 , 110 , 70);
        match.Run();

    }
}