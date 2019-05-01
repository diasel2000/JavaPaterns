package Strategy;

public class Orc implements Strategy {


    int atack;

    public Orc(int atack) {
        this.atack = atack;
    }

    @Override
    public String move(String typeOfMove,int speed) {
        typeOfMove = "Go";
        speed = 5;
        return  "I have "+speed+" speed and"+" damage = "+atack +" my type of move "+typeOfMove;
    }
}
