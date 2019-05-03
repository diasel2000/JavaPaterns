package Bilder;

public class Doctor {
    public void createShortRecept(Recept recept){
        recept.setName ( "Diarea" );
        recept.setType ( Type.PROFILACTIC );
        recept.setDay ( 3 );
        recept.setWeek ( 0 );
        recept.setMonth ( 0 );
    }
    public void createLongRecept(Recept recept){
        recept.setName ( "Hrip" );
        recept.setType ( Type.MEDICAL );
        recept.setDay ( 3 );
        recept.setWeek ( 2 );
        recept.setMonth ( 1 );
    }
    public void createKillerRecept(Recept recept){
        recept.setName ( "RAK" );
        recept.setType ( Type.KILLER );
        recept.setDay ( 6 );
        recept.setWeek ( 3 );
        recept.setMonth ( 20 );
    }
}
