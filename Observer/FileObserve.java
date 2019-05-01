package Observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserve implements Observer {
    @Override
    public void handleEvent(String magazName, String newspName) {
        //File f;
        try {

            PrintWriter pw = new PrintWriter ( "the-file-name.txt", "UTF-8" );
            pw.print ("Add new magazine '"+magazName+"' and new newspaper '"+newspName+"'");
            pw.println ();
            pw.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }


    }
}
