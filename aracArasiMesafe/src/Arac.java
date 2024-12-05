public class Arac {
    int hiz;
    int hiz2;
    int sure;

    Arac(int hiz , int hiz2 , int sure) {
        this.hiz=hiz;
        this.hiz2=hiz2;
        this.sure=sure;
    }

    int AyniYon() {
        int mesafe;
        mesafe = Math.abs(hiz-hiz2)*sure;
        return mesafe;
    }

    int ZitYon() {
        int mesafe;
        mesafe = Math.abs(hiz+hiz2)*sure;
        return mesafe;
    }

    void String() {
        double mesafe = AyniYon();
        double mesafe2 = ZitYon();

        System.out.println("Aynı yöne giden araçlardan birinin hızı " +hiz +"diğerinin hızı " +hiz2 +" iken " +sure +  " süre sonra aralarındaki mesafe " +mesafe);
        System.out.println("Zıt yöne giden araçlardan birinin hızı " +hiz +"diğerinin hızı " +hiz2 +" iken " +sure + " süre sonra aralarındaki mesafe " +mesafe2);

    }



}
