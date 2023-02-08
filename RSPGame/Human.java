import java.util.Scanner;

public class Human extends Player {
    public Human(String name, boolean isHuman) {
        super(name, isHuman);
    }

    @Override
    public int makeMovement() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    @Override
    public boolean getIsHuman() {
        return true;
    }
    
}
