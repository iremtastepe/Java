public class Heron {
    double a;
    double b;
    double c;

    Heron(double a , double b , double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    double Alan() {
     double s=(a+b+c)/2;
     double alan=Math.sqrt(s*(s-a)*(s-b)*(s-c));
     return alan;
    }

    double Yaricap() {
        double alan = Alan();
        double r = (a*b*c)/4*alan;
        return r;
    }

    void Yazdir() {
        double r = Yaricap();
        double alan = Alan();
        System.out.println("Kenarları a b c olan üçgenin alanı " +alan + " yarıçapı ise " +r);

    }

}
