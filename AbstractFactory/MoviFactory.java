package AbstractFactory;

public class MoviFactory implements Factory {
    public Movi createMovi(String moviName) {
        switch (moviName) {
            case "Avangers":
                return new Avangers ();
            case "BreakinBad":
                return new BreakinBad ();
            case "GameOfThrones":
                return new GameOfThrones ();
            case "BriliantArm":
                return new BriliantArm ();
            case "SilenKiller":
                return new SilenKiller ();
            default:
                return null;
        }
    }


    @Override
    public Type createType(String type) {
        return null;
    }

    @Override
    public Landuage create(String language) {
        return null;
    }
}
