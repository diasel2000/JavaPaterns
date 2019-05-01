package Factory;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Factory {
    public static void main(String[] args) {
        for (; ; ) {
            try {
                TimeUnit.SECONDS.sleep ( 2 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            Random rand = new Random ();
            int x = rand.nextInt ( 8 );
            create ( x );
        }
    }

    public static void create(int a) {
        if (a == 1) {
            new LFigura ().create ();
        }
        if (a == 2) {
            new TFigura ().create ();
        }
        if (a == 3) {
            new LFigura ().create ();
        }
        if (a == 4) {
            new Rectangel ().create ();
        }
        if (a == 5) {
            new LFigura ().superFigura ();
        }
        if (a == 6) {
            new TFigura ().superFigura ();
        }
        if (a == 7) {
            new LFigura ().superFigura ();
        }
        if (a == 8) {
            new Rectangel ().create ();
        } else System.out.println ( "Not create" );
    }
}
