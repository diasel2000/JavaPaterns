package Composite;

public class Number implements Calculate {
    protected Integer number;

    public Number(Integer number) {
        this.number = number;
    }

    @Override
    public Integer add() {
        return number;
    }
}
