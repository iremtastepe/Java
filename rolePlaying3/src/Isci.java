public class Isci extends Ucret{

    public double setMaas(int primGunu , double primTl) {
        if (primGunu>5000*0.11 && primGunu<5000*0.20) {
            primTl=5500+(primTl*0.11);
        } else if (primGunu>5000*0.21 && primGunu<5000*0.50) {
            primTl=6750+(primTl*0.13);
        }
        return primTl;
    }
}
