package Bilder;

public class Main {
    public static void main(String[] args) {
        Doctor doctor =new Doctor ();

        ReceptBilder bilder = new ReceptBilder ();
        doctor.createShortRecept ( bilder );

        Blanc blanc = bilder.getResult ();
        System.out.println ("Recept type "+blanc.getType ());
        System.out.println ("Recept name "+blanc.getName ());
        System.out.println ("Recept day "+blanc.getDay ());
        System.out.println ("Recept week "+blanc.getWeek ());
        System.out.println ("Recept month "+blanc.getMonth ());


    }
}
