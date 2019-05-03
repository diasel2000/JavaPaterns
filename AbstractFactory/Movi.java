package AbstractFactory;

public interface Movi {
    void getName();
}
class Avangers implements Movi{

    @Override
    public void getName() {
        System.out.println ("you got to procat Avangers");
    }

}
class BriliantArm implements Movi{

    @Override
    public void getName() {
        System.out.println ("you got to procat BriliantArm");
    }

}
class GameOfThrones implements Movi{

    @Override
    public void getName() {
        System.out.println ("you got to procat GameOfThrones");
    }

}
class SilenKiller implements Movi{

    @Override
    public void getName() {
        System.out.println ("you got to procat SilenKiller");
    }

}
class BreakinBad implements Movi{

    @Override
    public void getName() {
        System.out.println ("you got to procat BreakinBad");
    }

}