package AbstractFactory;

import java.util.Scanner;

public class TypeFactory implements Factory {
    @Override
    public Movi createMovi(String moviName) {
        return null;
    }


    public Type createType(String type) {
        Scanner sc = new Scanner ( System.in );
        String types = sc.nextLine ();
        switch (type) {
            case "1":
                return new Dramma ( types );
            case "2":
                return new Comedy ( types );
            case "3":
                return new War ( types );
            case "4":
                return new Serial ( types );
            default:
                return null;
        }
    }

    @Override
    public Landuage create(String language) {
        return null;
    }


}
