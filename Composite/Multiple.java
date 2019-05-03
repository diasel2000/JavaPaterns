package Composite;

public class Multiple extends IntNumber {
    public Multiple(Calculate rightValue, Calculate leftValue) {
        super ( rightValue, leftValue );
    }

    @Override
    public Integer add() {
        return rightValue.add () * leftValue.add ();
    }
}
