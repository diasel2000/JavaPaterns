package Strategy;

public class Harpy extends Organizm implements Strategy {
    int flyAtack;

    public Harpy(int flyAtack,int health,String status) {
        super (health,status);
        this.flyAtack = flyAtack;
    }

    @Override
    public String move(String typeOfMove,int speed) {
        typeOfMove = "Go or Fly";
        speed=20;
        return "I can atacked in sky "+flyAtack+"dmg. And my type of move "+typeOfMove+" with speed"+speed;
    }
}
