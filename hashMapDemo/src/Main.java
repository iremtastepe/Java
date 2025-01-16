import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashMap<String, String> sozluk = new HashMap<String , String>();
        sozluk.put("book" , "kitap");
        sozluk.put("pencil" , "kalem");
        sozluk.put("table" , "masa");

        System.out.println(sozluk);

        System.out.println(sozluk.get("book"));

       // sozluk.remove("pencil");

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman- " + " " +item + " Değeri- " + " " +sozluk.get(item));
        }
    }
}