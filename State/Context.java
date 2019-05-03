package State;

public class Context {
    Grant grant;
    int id;
    String name;
    String lastName;
    int balls;
    boolean consider;
    boolean status;

    public Context(int id, String name, String lastName, int balls, boolean consider, boolean status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.balls = balls;
        this.consider = consider;
        this.status = status;
    }

    void setGrant(Grant gr) {
        grant = gr;
    }

    void operation() {
        if (grant instanceof GrantCreate) {
            setGrant ( new GrantConsider ( consider ) );
        } else if (grant instanceof GrantConsider) {
            setGrant ( new GrantDeffered () );
        } else if (grant instanceof GrantDeffered) {
            setGrant ( new GrandRejected ( status ) );
        } else if (grant instanceof GrandRejected) {
            setGrant ( new GrantRecalled () );
        } else if (grant instanceof GrantRecalled) {
            setGrant ( new GrantCreate ( id, name, lastName, balls ) );
        }
    }

    void status() {
        grant.status ();
    }

}
