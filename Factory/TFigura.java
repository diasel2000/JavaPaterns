package Factory;

public class TFigura implements Figura {
    @Override
    public void create() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 != 1) {
                    System.out.print ( "t" );
                } else {
                    System.out.print ( " " );
                }
            }
            System.out.println ();
        }
    }

    @Override
    public void superFigura() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 1) {
                    System.out.print ( "T" );
                } else {
                    System.out.print ( " " );
                }
            }
            System.out.println ();
        }
    }
}
