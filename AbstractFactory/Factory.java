package AbstractFactory;

public interface Factory {
    Movi createMovi(String moviName);

    Type createType(String type);

    Landuage create(String language);
}
