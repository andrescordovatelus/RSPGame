public class ScoreItem {
    private Player player;
    private int round;
    private int movement;
    private boolean winner;

    public ScoreItem(Player player,int round, int movement, boolean winner) {
        this.player = player;
        this.round = round;
        this.movement = movement;
        this.winner = winner;
    }

    public boolean isWinner() {
        return winner;
    }
    

    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "ScoreItem [player=" + player + ", round=" + round + ", movement=" + movement + ", winner=" + winner
                + "]";
    }

    
    
    
}
