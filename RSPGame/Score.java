public class Score {
    private Round round;
    private int winner;
    private String name;
    
    public Score(Round round, int winner, String name) {
        this.round = round;
        this.winner = winner;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Score [round=" + round.getRoundsCounter() + ", winner=" + winner + ", name=" + name + "]";
    }

    
    
}
