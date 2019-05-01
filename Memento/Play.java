package Memento;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        TicTacToe play = new TicTacToe ();

        String response = "";
        int cmd = 1;
        System.out.print ( "Enter position: " );
        Scanner in = new Scanner ( System.in );

        while ((cmd = in.nextInt ()) != 0) {
            if (cmd == 17) {
                play.undo ();
                System.out.print ( "Enter position: " );
                continue;
            }
            if (!(response = play.setPosition ( cmd )).equals ( "" )) break;
            System.out.print ( "Enter position: " );
        }

        play.print ();
        System.out.println ( response );
    }
}
