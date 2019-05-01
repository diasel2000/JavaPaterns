package Strategy;

public class Pegas implements Strategy {

    @Override
    public String move(String typeOfMove, int speed) {
        typeOfMove ="Fly";
        speed = 25;
        return  "I move with speed = "+speed+" and my type of move"+typeOfMove;
    }
}
