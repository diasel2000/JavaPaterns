package State;

public class GrantCreate implements Grant {
    int id;
    String name;
    String lastName;
    double balls;

    public GrantCreate(int id, String name, String lastName, double balls) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.balls = balls;
    }

    @Override
    public void status() {
        System.out.format ( "+-------+---------+------------+---------+%n" );
        System.out.format ( "| ID    |Name     |Last Name   |Balls    |%n" );
        System.out.format ( "+-------+---------+------------+---------+%n" );
        System.out.format ( "| " + id + "|" + name + " |" + lastName + "|" + balls + "|%n" );
        System.out.format ( "+-------+---------+------------+---------+%n" );
    }
}
