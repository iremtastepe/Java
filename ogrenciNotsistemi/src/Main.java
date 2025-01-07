//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("İrem" , "0000" , "ALG");
        Teacher t2 = new Teacher("Eda" , "5555" , "PROG");
        Teacher t3 = new Teacher("Berfin" , "2222" , "NTP");

        Course algoritma = new Course("Algoritma" , "101" , "ALG");
        Course programlama = new Course("Programlama" , "101" , "PROG");
        Course nesne = new Course("Nesne" , "101" , "NTP");

        Student s1 = new Student("Nil" , "123" , "3" , algoritma , programlama , nesne);
        Student s2 = new Student("Rüya" , "789" , "3" , algoritma , programlama , nesne);
        Student s3 = new Student("Esmahan" , "456" , "3" , algoritma , programlama , nesne);
        s1.addBulkExamNote(25 , 56 , 80);
        s1.isPass();





    }
}