package Flyweight;

import java.util.*;

public class BacteryFactory {
    public static void main(String[] args) {
        BacteryFactory bacteryFactory = new BacteryFactory ();

        List<Flyweight> bacteries = new ArrayList<> ();

        bacteries.add ( bacteryFactory.getBactery ( "бацил" ) );
        bacteries.add ( bacteryFactory.getBactery ( "стафилокок" ) );
        bacteries.add ( bacteryFactory.getBactery ( "стафилокок" ) );
        bacteries.add ( bacteryFactory.getBactery ( "вибрион" ) );
        bacteries.add ( bacteryFactory.getBactery ( "пневмокок" ) );
        bacteries.add ( bacteryFactory.getBactery ( "вибрион" ) );

        for (Flyweight bactery : bacteries) {
            bactery.create ( "", 'X' );
        }
    }

    private static final Map<String, Flyweight> bacteries = new HashMap<> ();

    public Flyweight getBactery(String bacteryName) {
        Flyweight bactery = bacteries.get ( bacteryName );
        if (bactery == null) {
            switch (bacteryName) {
                case "бацил":
                    bactery = new Bacill ();
                    break;
                case "стафилокок":
                    bactery = new Stafilococ ();
                    break;
                case "вибрион":
                    bactery = new Vibrion ();
                    break;
                case "пневмокок":
                    bactery = new Pnevmokoki ();
                    break;
            }
            bacteries.put ( bacteryName, bactery );
        }
        return bactery;
    }
}
