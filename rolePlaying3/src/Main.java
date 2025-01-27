//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EYT eyt = new EYT(50 , 10);
        EYT eyt2 = new EYT(45 , 5);
        eyt.Emeklilikrolu = new Kadin();
        eyt.Emeklilikrolu.Sorgula(3000 , "4C" , eyt );

       eyt.Emeklilikrolu=new Erkek();
       eyt.Emeklilikrolu.Sorgula(2000 , "4B" , eyt2);



    }
}