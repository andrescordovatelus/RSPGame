public abstract class Shape {
    protected enum Shapes {
        ROCK,
        SCISSOR,
        PAPER
    }

    private int movement;

    public abstract int winsWith();

    public int getMovement() {
        return movement;
    }


    public void setMovement(int movement) {
        this.movement = movement;
    }
    
}
