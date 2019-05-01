package Composite;

public class Add extends IntNumber {
    public Add(Calculate rightValue, Calculate leftValue) {
        super ( leftValue, rightValue );
    }

    @Override
    public Integer add() {
        return leftValue.add () + rightValue.add ();
    }
}
