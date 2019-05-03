package Factory;

public class LFigura implements Figura {
    @Override
    public void create() {
        for(int i=0; i<1; i++){
            for(int j=0; j<3; j++){
                System.out.print("l ");
                System.out.print(" l ");
            }
            System.out.println();
        }
    }

    @Override
    public void superFigura() {
        for(int i=0; i<1; i++){
            for(int j=0; j<5; j++){
                System.out.print("L ");
                System.out.print(" L ");
            }
            System.out.println();
        }
    }
}
