package Strategy;

public class Pegas extends Organizm implements Strategy {

    public Pegas(int health, String status) {
        super ( health, status );
    }

    @Override
    public String move(String typeOfMove, int speed) {
        typeOfMove ="Fly";
        speed = 25;
        return  "I move with speed = "+speed+" and my type of move"+typeOfMove;
    }
}
