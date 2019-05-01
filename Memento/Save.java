package Memento;

public class Save {
    private int position, positionA, positionB;

    public Save(int position) {
        this.position = position;
        positionA = (position - (position % 10)) / 10 - 1;
        positionB = position % 10 - 1;
    }

    public int getPositionA() {
        return positionA;
    }

    public int getPositionB() {
        return positionB;
    }
}
