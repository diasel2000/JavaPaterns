package ChainOfResponsibility;

public class TransferNotifier extends Notifier {
    int transfer;

    public TransferNotifier(int priority,int transfer) {
        super ( priority );
        this.transfer =transfer;
    }

    @Override
    public void write(String message, int sum) {
        System.out.print ( "Message to Bank --->" + message );
        sum =sum + transfer;
        System.out.println ("Value of your transfer "+sum);
    }
}
