public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1 , Fighter f2 , int maxWeight , int minWeight) {
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }
    boolean Check(){
        return((this.f1.weight>minWeight && this.f1.weight<this.maxWeight) && (this.f2.weight>minWeight && this.f2.weight<this.maxWeight)) ;
    }

    public void Run() {
        if (Check()) {
            while (this.f1.health>0 && this.f2.health>0) {
                System.out.println("---------Yeni Raound--------");
                this.f2.health=this.f1.Hit(f2);
                System.out.println("Kalan can " + f2.health );
                if (isWin()) {
                    break;
                }
                this.f1.health=this.f2.Hit(f1);
                System.out.println("Kalan can " + f1.health );
                if (isWin()) {
                    break;
                }

            }
        }
        else {
            System.out.println("Ağırlıklar Eşleşmiyor");
        }
    }

    boolean isWin() {
        if(this.f1.health==0) {
            System.out.println(this.f2.name + " kazandı");
            return true;
        }
        else if(this.f2.health==0) {
            System.out.println(this.f1.name + " kazandı");
            return true;
        }

        return false;
    }
}
