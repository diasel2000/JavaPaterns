package ChainOfResponsibility;

public class BankTracker {
    public static void main(String[] args) {
        Notifier transfer = new TransferNotifier ( Priority.FIRST,5000 );
        Notifier procent = new ProcentNotifire ( Priority.SECOND ,25);
        Notifier subsidy = new SubsidyNotifier ( Priority.THIRD,2000 );

        transfer.setNextNotifire ( procent );
        procent.setNextNotifire ( subsidy );


        transfer.notifyToBank ( "TRANSFER:",Priority.THIRD,6500 );
        transfer.notifyToBank ( "PROCENT ",Priority.SECOND,6500 );
        transfer.notifyToBank ( "SUBSIDY ",Priority.FIRST,6500 );
    }
}
