import java.util.Scanner;

public class Human extends Player {
    public Human(String name, boolean isHuman) {
        super(name, isHuman);
    }

    @Override
    public int makeMovement() {
        Scanner sc = new Scanner(System.in);
        int movement = 0;
        while(movement <= 0 || movement > 3){
            movement = sc.nextInt();
        }
        return movement;
    }

    @Override
    public boolean getIsHuman() {
        return true;
    }
    
}
