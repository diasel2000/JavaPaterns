package Observer;

public class Postal {
    public static void main(String[] args) {
        PostalOffice office = new PostalOffice ();

        office.addObserver ( new ConsoleObserver () );
        office.addObserver ( new FileObserve () );
        office.setPostalOffice ( "Astral News","Fashion is my Profesion");
        office.setPostalOffice ( "Oscar News","Sales and You" );
        office.removeObserver ( new ConsoleObserver());
    }
}
