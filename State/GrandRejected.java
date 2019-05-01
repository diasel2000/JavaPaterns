package State;

public class GrandRejected implements Grant {
    boolean status;

    public GrandRejected(boolean status) {
        this.status = status;
    }

    public String Rejected() {
        if (status == true) {
            return "Принят";
        }
        return "Отклонен";
    }

    @Override
    public void status() {
        System.out.printf (  "STATUS" );
        System.out.println ( "-----------------------------------------------------" );
        System.out.printf (  Rejected () );
    }
}
