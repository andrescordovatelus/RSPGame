public abstract class Player {
    private static int count = 0;
    private int id;
    private String name;
    private boolean isHuman;
    private int winningTimes = 0;
    //private int tieTimes = 0;
    private int lostTimes = 0;

    
    public Player(String name, boolean isHuman) {
        this.id = ++count;
        this.name = name;
        this.isHuman = isHuman;
    }

    
    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", isHuman=" + isHuman + ", winningTimes=" + winningTimes
                 + ", lostTimes=" + lostTimes + "]";
    }


    public abstract void makeMovement();
    public abstract boolean getIsHuman();

}