package ChainOfResponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifire;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifire(Notifier nextNotifire) {
        this.nextNotifire = nextNotifire;
    }

    public void notifyToBank(String message,int prior,int sum){
        if(prior >= priority){
            write(message,sum);
        }
        if(nextNotifire != null){
            nextNotifire.notifyToBank ( message,prior,sum );
        }
    }

    public abstract void write(String message,int sum);
}
