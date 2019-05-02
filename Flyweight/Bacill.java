package Flyweight;

public class Bacill implements Flyweight {
    int size;

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void create(String name, char type) {
        size = 12;
        name = "Я Бацилла";
        type = 'A';
        System.out.println ( name + " типа " + type );
    }
}
