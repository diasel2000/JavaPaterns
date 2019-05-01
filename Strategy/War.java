package Strategy;

public class War {
    private Strategy strategy;

    public War(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String move(String type, int speed){
        return strategy.move ( type,speed );
    }
}
