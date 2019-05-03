package Memento;

public class TicTacToe {
    private Integer[][] pole = new Integer[3][3];
    private int position, positionA, positionB;
    private int randomA, randomB;
    private SaveHistory saveHistory = new SaveHistory ();

    public TicTacToe() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++)
                pole[i][j] = -1;
        }
    }

    public String setPosition(int position) {
        if (!validPosition ( position )) return "";

        pole[positionA][positionB] = 1;
        save ();
        if (endGame ().equals ( "" )) return randomPosition ();
        else return endGame ();
    }

    private String randomPosition() {
        randPosition ();
        while (pole[randomA - 1][randomB - 1] != -1) {
            randPosition ();
        }
        pole[randomA - 1][randomB - 1] = 0;
        this.position = randomA * 10 + randomB;
        save ();
        print ();
        if (endGame ().equals ( "" )) return "";
        else return endGame ();
    }

    public void save() {

        saveHistory.save ( new Save ( position ) );
    }

    public void undo() {
        saveHistory.getLastSave ( this );
        saveHistory.getLastSave ( this );
        print ();
    }

    public void rewrite(Save memento) {

        pole[memento.getPositionA ()][memento.getPositionB ()] = -1;
    }

    private void randPosition() {
        randomA = (int) (Math.random () * 3 + 1);
        randomB = (int) (Math.random () * 3 + 1);
    }

    private boolean validPosition(int step) {
        int positionA = (step - (step % 10)) / 10 - 1;
        int positionB = step % 10 - 1;

        if (pole[positionA][positionB] == -1) {
            this.positionA = positionA;
            this.positionB = positionB;
            this.position = step;
            return true;
        }
        return false;
    }

    private String endGame() {
        int winerX = 0;
        int winerO = 0;

        for (int i = 0; i <= 2; i++) {
            winerX = 0;
            winerO = 0;
            for (int j = 0; j <= 2; j++) {
                if (pole[i][j] == 0) winerO++;
                if (pole[i][j] == 1) winerX++;
            }
            if (winerO == 3) return "O WINS!";
            if (winerX == 3) return "X WINS!";
        }

        for (int j = 0; j <= 2; j++) {
            winerX = 0;
            winerO = 0;
            for (int i = 0; i <= 2; i++) {
                if (pole[i][j] == 0) winerO++;
                if (pole[i][j] == 1) winerX++;
            }
            if (winerO == 3) return "O WINS!";
            if (winerX == 3) return "X WINS!";
        }

        winerX = 0;
        winerO = 0;
        for (int i = 0; i <= 2; i++) {
            if (pole[i][i] == 0) winerO++;
            if (pole[i][i] == 1) winerX++;
        }
        if (winerO == 3) return "O WINS!";
        if (winerX == 3) return "X WINS!";

        winerX = 0;
        winerO = 0;
        for (int i = 0; i <= 2; i++) {
            winerX = 0;
            for (int j = 0; j <= 2; j++) {
                if (i + j == 3 && pole[i][j] == 0) winerO++;
                if (i + j == 3 && pole[i][j] == 1) winerX++;
            }
        }
        if (winerO == 3) return "O WINS!";
        if (winerX == 3) return "X WINS!";

        if (saveHistory.countStep () == 9) return "NO ONE WINS!";
        return "";
    }

    public void print() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (pole[i][j] == 0) System.out.print ( "|O|" );
                if (pole[i][j] == 1) System.out.print ( "|X|" );
                if (pole[i][j] == -1) System.out.print ( "| |" );
            }
            System.out.println ();
        }
        System.out.println ();
    }
}

