package Composite;

public abstract class IntNumber implements Calculate {
    protected Calculate leftValue;
    protected Calculate rightValue;

    public IntNumber(Calculate rightValue, Calculate leftValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

}
