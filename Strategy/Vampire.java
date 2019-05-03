package Strategy;

public class Vampire extends Organizm implements Strategy {
    boolean bloodDrinker;

    public Vampire(boolean bloodDrinker,int health, String status) {
        super (health,status);
        this.bloodDrinker = bloodDrinker;
    }

    @Override
    public String move(String typeOfMove, int speed) {
        if(bloodDrinker==true){
            System.out.println ("I drink blood");
        }else System.out.println ("I drink water");
        typeOfMove = "Jump at night";
        speed = 15;
        return "I can "+typeOfMove+"with speed"+speed;
    }
}
