package ChainOfResponsibility;

public class SubsidyNotifier extends Notifier {
    int subsidy;

    public SubsidyNotifier(int priority,int subsidy) {
        super ( priority );
        this.subsidy=subsidy;
    }

    @Override
    public void write(String message, int sum) {
        System.out.print ( "Message to Bank --->" + message );
        sum +=subsidy*0.8;
        System.out.println ("Your money with subsidy "+sum);
    }
}
