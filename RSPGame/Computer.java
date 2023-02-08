import java.util.Random;

public class Computer extends Player {

    private int[] opciones = {1,2,3};
    
    public Computer(String name, boolean isHuman) {
        super(name, isHuman);
    }

    @Override
    public int makeMovement() {

        Random nr = new Random();
        return opciones[nr.nextInt(3)];
    }

    @Override
    public boolean getIsHuman() {
        return false;
    }
    
}
