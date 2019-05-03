package Composite;


public class Main {
    public static void main(String[] args) {
        System.out.println ( Composite () );
    }

    private static Integer Composite() {
        Calculate calculate = new Add (
                new Multiple (
                        new Add ( new Number ( 1 ), new Number ( 2 ) ),
                        new Number ( 4 ) ),
                new Multiple (
                        new Add ( new Number ( 3 ), new Number ( 6 ) ),
                        new Number ( 5 ) ) );
        return calculate.add ();
    }
}
