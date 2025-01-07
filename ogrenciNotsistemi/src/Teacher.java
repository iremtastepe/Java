public class Teacher {
    String name;
    String mbpo;
    String branch;

    Teacher(String name , String mbpo , String branch) {
        this.name=name;
        this.mbpo=mbpo;
        this.branch=branch;
    }

    void print(){
        System.out.println("Adı:" + this.name);
        System.out.println("Telefon no:" + this.mbpo);
        System.out.println("Bölümü:" + this.branch);
    }
}
