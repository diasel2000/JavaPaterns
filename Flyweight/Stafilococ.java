package Flyweight;

public class Stafilococ implements Flyweight {
    String form = "инфузории-туфельки";

    @Override
    public void create(String name, char type) {
        name = "Я Стафилокок";
        type = 'С';
        System.out.println ( name + " типа " + type + " и формы " + form );
    }
}
