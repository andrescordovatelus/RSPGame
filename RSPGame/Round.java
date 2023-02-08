public class Round {
    private Player player1;
    private Player player2;
    private int movement1;
    private int movement2;
    private final int totalRounds = 3;
    private int roundsCounter = 1;
    private Shape shape;
    private Score score;

    public Round(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player executeRounds() {
        System.out.print("MOVEMENT FOR PLAYER 1: ");
        movement1 = player1.makeMovement();
        System.out.print("MOVEMENT FOR PLAYER 2: ");
        movement2 = player2.makeMovement();

        switch(movement1){
            case 1:
                shape = new Rock();
                break;
            case 2:
                shape = new Scissor();
                break;
            case 3:
                shape = new Paper();
                break;
        }

        int winsWith = shape.winsWith() + 1;
        if(winsWith == movement2){
            return player1;
        }else{
            return player2;
        }
    }

    public int getTotalRounds() {
        return totalRounds;
    }

    public int getRoundsCounter() {
        return roundsCounter;
    }

    public void setRoundsCounter(int roundsCounter) {
        this.roundsCounter = roundsCounter;
    }

    

}
