public class Boxer {
    String name;
    int weight;
    int health;
    int damage;

    Boxer(String name, int weight, int health, int damage) {
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.damage = damage;
    }

    //egzersiz ile güç artar
    int exercise(int decrease) {
        this.damage += decrease;
        return this.damage;
    }

    //yemek ile kilo artar
    int eat(int decrease) {
        this.weight += decrease;
        return this.weight;
    }


}
