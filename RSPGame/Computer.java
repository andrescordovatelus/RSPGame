public class Computer extends Player {
    
    public Computer(String name, boolean isHuman) {
        super(name, isHuman);
    }

    @Override
    public int makeMovement() {
        return 3;
        
    }

    @Override
    public boolean getIsHuman() {
        return false;
    }
    
}
