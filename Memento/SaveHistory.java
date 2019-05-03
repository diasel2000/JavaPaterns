package Memento;

import java.util.Stack;

public class SaveHistory {
    private Stack<Save> saveHistory = new Stack ();

    public void getLastSave(TicTacToe XO) {
        if (saveHistory.size () == 1)
            XO.rewrite ( saveHistory.peek () );
        else
            XO.rewrite ( saveHistory.pop () );
    }

    public void save(Save memento) {
        saveHistory.push ( memento );
    }

    public int countStep() {
        return saveHistory.size ();
    }
}
