package AbstractFactory;


public interface Type {
    String type();
}

class Dramma implements Type {
    String type;

    public Dramma(String type) {
        this.type = type;
    }

    @Override
    public String type() {

        if (type == "Dramma") {
            System.out.println ( "you got to procat SilenKiller" );
        } else {
            System.out.println ( "We haven't that type movi" );
        }
        return new SilenKiller ().toString ();
    }
}

class War implements Type {
    String type;

    public War(String type) {
        this.type = type;
    }

    @Override
    public String type() {

        if (type == "War") {
            System.out.println ( "you got to procat Avangers " );
        } else {
            System.out.println ( "We haven't that type movi" );
        }
        return new Avangers ().toString ();
    }
}

class Comedy implements Type {
    String type;

    public Comedy(String type) {
        this.type = type;
    }

    @Override
    public String type() {
        if (type == "Comedy") {
            System.out.println ( "you got to procat BriliantArm" );
        } else {
            System.out.println ( "We haven't that type movi" );
        }
        return new BriliantArm ().toString ();
    }
}

class Serial implements Type {
    String type;

    public Serial(String type) {
        this.type = type;
    }

    @Override
    public String type() {

        if (type == "Serial") {
            System.out.println ( "you got to procat BreakingBad" );
            return new BreakinBad ().toString ();
        } else {
            System.out.println ( "you got to procat GameOfThrones" );
            return new GameOfThrones ().toString ();
        }
    }
}