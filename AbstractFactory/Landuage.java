package AbstractFactory;

public interface Landuage {
    String getLanguage();
}

class English implements Landuage {

    @Override
    public String getLanguage() {
        String str = "English";
        System.out.println ( str );
        return str;
    }
}

class Russian implements Landuage {

    @Override
    public String getLanguage() {
        String str = "Russian";
        System.out.println ( str );
        return str;
    }
}

class Ukraine implements Landuage {

    @Override
    public String getLanguage() {
        String str = "Ukraine";
        System.out.println ( str );
        return str;
    }
}