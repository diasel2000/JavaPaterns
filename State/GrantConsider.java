package State;

public class GrantConsider implements Grant {
    boolean status;

    public GrantConsider(boolean status) {
        this.status = status;
    }

    public String Status() {
        if (status == true) {
            return "Watched";
        }
        return "In proces....";
    }

    @Override
    public void status() {
        System.out.printf ( "STATUS" );
        System.out.println ( "-----------------------------------------------------" );
        System.out.printf (  Status () );
    }
}
