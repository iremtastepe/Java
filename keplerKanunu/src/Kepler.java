public class Kepler {
    double a;
    double b;
    int aci;

    Kepler(double a, double b, int aci) {
        this.a= a;
        this.b= b;
        this.aci= aci;
    }

    double Eksentri() {
         double e;
             e = Math.sqrt(1 - Math.pow(b / a , 2) );

         return e;

     }
     double Polar(double e) {
        double r;
        r= a*(1-Math.pow(e , 2)) / (1+ e* Math.cos(Math.toRadians(aci)));
         return r;
     }

     void Yazdir() {
         double e = Eksentri();
         double r = Polar(e);

         System.out.println("Kepler Kanunu için elipsin büyük yarıçapı " +a +
                 " küçük yarıçapı " +b +" açı değeri " +aci +" dır. Ekstanri değeri " + e + " Polar değeri " +r );
     }

}
