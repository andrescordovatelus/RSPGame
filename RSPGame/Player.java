public abstract class Player {
    private static int count = 0;
    private int id;
    private String name;
    private boolean isHuman;

    
    public Player(String name, boolean isHuman) {
        this.id = ++count;
        this.name = name;
        this.isHuman = isHuman;
    }

    
    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", isHuman=" + isHuman + "]";
    }

    public abstract int makeMovement();
    public abstract boolean getIsHuman();


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    
}