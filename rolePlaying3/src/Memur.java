public class Memur extends Ucret{

    public double setMaas(int primGunu , double primTl) {
        if (primGunu>5200*0.11 && primGunu<5200*0.20) {
            primTl=7500+(primTl*0.03);
        } else if (primGunu>5000*0.21 && primGunu<5000*0.50) {
            primTl=8300+(primTl*0.06);
        }
        return primTl;
    }
    }

