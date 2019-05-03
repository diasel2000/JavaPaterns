package Factory;

public class Rectangel implements Figura {
    @Override
    public void create() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print ( "* " );
            }
            System.out.println ();
        }
    }

    @Override
    public void superFigura() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print ( "* " );
            }
            System.out.println ();
        }
    }
}
