package Strategy;

public class Orc extends Organizm implements Strategy {


    int atack;

    public Orc(int atack,int health, String status) {
        super (health,status);
        this.atack = atack;
    }

    @Override
    public String move(String typeOfMove,int speed) {
        typeOfMove = "Go";
        speed = 5;
        return  "I have "+speed+" speed and"+" damage = "+atack +" my type of move "+typeOfMove;
    }
}
