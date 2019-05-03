package Strategy;

public class Start {
    public static void main(String[] args) {
        War war =new War ( new Harpy ( 14 ) );
        War war2 =new War ( new Elf ( 17 ));
        War war3 =new War ( new Orc ( 8 ) );
        War war4 =new War ( new Pegas ( ) );
        War war5 =new War ( new Vampire ( true ) );

        System.out.println (war.move ( "war",0 ));
        System.out.println (war2.move ( "war",0 ));
        System.out.println (war3.move ( "war",0 ));
        System.out.println (war4.move ( "war",0 ));
        System.out.println (war5.move ( "war",0 ));
    }
}
