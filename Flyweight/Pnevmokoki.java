package Flyweight;

public class Pnevmokoki implements Flyweight {
    @Override
    public void create(String name, char type) {
        name = "Я Пневмокок";
        type = 'К';
        System.out.println ( name + " типа " + type );
    }
}
