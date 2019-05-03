package Flyweight;

public class Vibrion implements Flyweight {
    double liveTime = 2.35;

    @Override
    public void create(String name, char type) {
        name = "Я Вибриона";
        type = 'Е';
        System.out.println ( name + " типа " + type + " и я живу " + liveTime + "сек." );
    }
}
