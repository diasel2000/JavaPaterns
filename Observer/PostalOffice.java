package Observer;

import java.util.ArrayList;
import java.util.List;

public class PostalOffice implements Observed {
    String newspaperName;
    String magazineName;

    public void setPostalOffice(String newspaperName, String magazineName) {
        this.newspaperName = newspaperName;
        this.magazineName = magazineName;
        notifyObservers ();
    }

    List<Observer> observers = new ArrayList<> (  );

    @Override
    public void addObserver(Observer o) {
        observers.add ( o );
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove ( o );
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.handleEvent (newspaperName,magazineName );
        }
    }
}
