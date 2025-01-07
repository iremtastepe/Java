public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name , String stuNo , String classes , Course c1 , Course c2 , Course c3) {
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0;
        this.isPass=false;
    }

    void addBulkExamNote(int note , int note2 , int note3) {
    if (note>=0 && note<=100) {
        this.c1.note=note;
    }
    if (note2>=0 && note2<=100) {
        this.c2.note=note2;
    }
    if (note3>=0 && note3<=100) {
        this.c3.note=note3;
    }

    }

    void isPass(){
        this.avarage= (this.c1.note+this.c2.note+this.c3.note)/3.0;
        if (this.avarage>60) {
            System.out.println("Geçtiniz");
        }
        else
            System.out.println("Kaldınız");
        printNote();
    }

    void printNote(){
        System.out.println(this.name + " " + this.c1.name + " notunuz: " +this.c1.note );
        System.out.println(this.name +  " " + this.c2.name + " notunuz: " +this.c2.note );
        System.out.println(this.name + " " + this.c3.name + " notunuz: " +this.c3.note );
        System.out.println(this.name + " " + " ortalamanız:" + this.avarage);

    }

}
