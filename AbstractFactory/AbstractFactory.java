package AbstractFactory;

import java.util.Scanner;

public class AbstractFactory {
    public static void main(String[] args) {
        System.out.println ( "Enter by wich parametr you wont get movi:(Type,Language,Movi)" );
        menu ();
    }

    public static void menu(){
        Scanner sc = new Scanner ( System.in );
        String parametr = sc.nextLine ();
        Factory factory = new AbstractFactory ().createFactory ( parametr );
        switch (parametr) {
            case "Type":
                System.out.println ( "Enter type:" );
                System.out.println ( "1.Dramma" );
                System.out.println ( "2.Comady" );
                System.out.println ( "3.War" );
                System.out.println ( "4.Serials" );
                String num = sc.nextLine ();
                Type type = factory.createType ( num );
                System.out.println ( type.type () );
            case "Movi":
                parametr = "Movi";
                Factory factory2 = new AbstractFactory ().createFactory ( parametr );
                System.out.println ( "Enter movi name:" );
                String name = sc.nextLine ();
                Movi movi = factory2.createMovi ( name );
                movi.getName ();
            case "Language":
                parametr = "Language";
                Factory factory3 = new AbstractFactory ().createFactory ( parametr );
                System.out.println ( "Enter movi language:" );
                String language = sc.nextLine ();
                Landuage languages = factory3.create ( language );
                languages.getLanguage ();
        }
    }
    Factory createFactory(String typeOfFactory) {

        switch (typeOfFactory) {
            case "Type":
                return new TypeFactory ();
            case "Language":
                return new LanguageFactory ();
            case "Movi":
                return new MoviFactory ();
            default:
                return null;
        }
    }
}
