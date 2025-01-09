public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    Fighter(String name , int damage , int health , int  weight) {
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
    }

    int Hit(Fighter foe) {
        System.out.println(this.name + " ==>" + foe.name +  " " +damage + " hasar verdi" );

        return foe.health - this.damage;
    }

}
