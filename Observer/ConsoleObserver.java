package Observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(String magazName, String newspName) {
        System.out.println ("Add new magazine '"+magazName+"' and new newspaper '"+newspName+"'");
    }
}
