package AbstractFactory;

public class LanguageFactory implements Factory {
    @Override
    public Movi createMovi(String moviName) {
        return null;
    }

    @Override
    public Type createType(String type) {
        return null;
    }

    public Landuage create(String language) {
        switch (language) {
            case "ENG":
                return new English ();
            case "RU":
                return new Russian ();
            case "UA":
                return new Ukraine ();

            default:
                return null;
        }
    }
}
