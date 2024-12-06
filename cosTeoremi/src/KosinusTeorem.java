public class KosinusTeorem {
    int a;
    int b;
    int aci;

    KosinusTeorem(int a , int b , int aci) {
        this.a =a;
        this.b =b;
        this.aci=aci;
    }

    double Kosinus () {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(aci)));
        return c;
    }

    void Bilgi () {
        double cos = Kosinus();
        System.out.println("Bir kenarı " +a +" bir kenarı " +b +" açısı değeri " +aci + " olan üçgenin diğer kenarı " +cos    );
    }
}
