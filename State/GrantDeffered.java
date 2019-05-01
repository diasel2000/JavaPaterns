package State;

public class GrantDeffered implements Grant {
    @Override
    public void status() {
        System.err.printf ("DEFFERED" );
    }
}
