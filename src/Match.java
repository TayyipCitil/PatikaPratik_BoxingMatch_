public class Match {
    Boxer boxerBlue;
    Boxer boxerRed;
    int maxWeight;
    int minWeight;
    int round;

    Match(Boxer boxerBlue, Boxer boxerRed, int maxWeight, int minWeight, int round) {
        this.boxerBlue = boxerBlue;
        this.boxerRed = boxerRed;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.round = round;
    }

    boolean wighDay() {
        boolean isFightBlue = false;
        boolean isFightRed = false;
        if (this.boxerBlue.weight < this.minWeight) {
            System.out.println(this.boxerBlue.name + " kilo almalı");
        } else if (this.boxerBlue.weight > maxWeight) {
            System.out.println(this.boxerBlue.name + " kilo vermeli");
        } else {
            isFightBlue = true;
        }
        if (this.boxerRed.weight < this.minWeight) {
            System.out.println(this.boxerRed.name + " kilo almalı");
        } else if (this.boxerRed.weight > maxWeight) {
            System.out.println(this.boxerRed.name + " kilo vermeli");
        } else {
            isFightRed = true;
        }
        return isFightBlue && isFightRed;
    }

    void startMatch() {
        if (wighDay()) {
            for (int i = 1; i <= this.round; i++) {

                if((this.boxerBlue.health <= 0&&this.boxerRed.health <= 0)||(i==12 && this.boxerBlue.health > 0 && this.boxerRed.health > 0)) {
                    System.out.println("Müsabaka bitti.");
                    System.out.println("Beraberlik");
                    break;
                }else if (this.boxerBlue.health <= 0) {
                    System.out.println("Müsabaka bitti.");
                    System.out.println("Kazanan:" + this.boxerRed.name);
                    break;
                } else if (this.boxerRed.health <= 0) {
                    System.out.println("Müsabaka bitti.");
                    System.out.println("Kazanan:" + this.boxerBlue.name);
                    break;
                } else {
                    this.boxerBlue.health -= this.boxerRed.damage;
                    this.boxerRed.health -= this.boxerBlue.damage;
                    System.out.println("Round: " + i);
                    if(this.boxerBlue.health>=0){
                    System.out.println(this.boxerBlue.name + "'in sağlığı :" + this.boxerBlue.health);
                    }else{
                        System.out.println(this.boxerBlue.name + "'in sağlığı :" + 0);
                    }
                    if(this.boxerRed.health>=0){
                    System.out.println(this.boxerRed.name + "'in sağlığı :" + this.boxerRed.health);
                    }else{
                        System.out.println(this.boxerRed.name + "'in sağlığı :" + 0);
                    }
                }
            }
        } else {
            System.out.println("Müsabaka iptal");
        }
    }
}
