package State;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "ID:" );
        int id = scanner.nextInt ();
        System.out.println ( "Name:" );
        String name = scanner.nextLine ();
        System.out.println ( "Last Name:" );
        String lastName = scanner.nextLine ();
        System.out.println ( "Balls:" );
        int balls = scanner.nextInt ();
        System.out.println ( "Consider:" );
        boolean consider = scanner.nextBoolean ();
        System.out.println ( "Status:" );
        boolean status = scanner.nextBoolean ();
        GrantCreate create = new GrantCreate ( id, name, lastName, balls );
        Context context = new Context ( id, name, lastName, balls, consider, status );
        context.setGrant ( create );
        for (int i =0;i<5;i++){
        context.status ();
        context.operation ();}
    }
}
