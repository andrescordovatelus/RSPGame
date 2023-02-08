public class Human extends Player {
    public Human(String name, boolean isHuman) {
        super(name, isHuman);
    }

    @Override
    public int makeMovement() {
        int movement = 0;
        while(movement <= 0 || movement > 3){
            movement = Console.getInt();
        }
        return movement;
    }

    @Override
    public boolean getIsHuman() {
        return true;
    }
    
}
