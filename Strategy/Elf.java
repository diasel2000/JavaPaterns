package Strategy;

public class Elf extends Organizm implements Strategy {
    int atack;

    public Elf(int atack,int health, String status) {
        super (health,status);
        this.atack = atack;
    }

    @Override
    public String move(String typeOfMove, int speed) {
        typeOfMove = "Go";
        speed = 17;
        return "I can atacked in forest"+atack+" and my type of move"+typeOfMove+" with speed "+speed;
    }
}
