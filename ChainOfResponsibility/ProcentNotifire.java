package ChainOfResponsibility;

public class ProcentNotifire extends Notifier {
    int procent;

    public ProcentNotifire(int priority, int procent) {
        super ( priority );
        this.procent = procent;
    }

    @Override
    public void write(String message, int sum) {
        System.out.print ( "Message to Bank --->" + message );

            sum += (procent / 100) * sum;
            System.out.println ( "Your money with procent bonus" + sum );

        }

    }

