package Strategy;

public abstract class Organizm {
    int health;
    String status;

    public Organizm(int health, String status) {
        this.health = health;
        this.status = status;
    }

    public void healthStatus(){
        System.out.println ("Your health = "+this.health+": "+this.status);
    }
}
