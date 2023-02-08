public class Round {
    private Player player1;
    private Player player2;
    private int movement1;
    private int movement2;
    private final int totalRounds = 3;
    private Shape shape;
    private Score score;

    public Round(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        score = new Score();
    }

    public void executeRounds() {
        int i = 1;
        while (i <= totalRounds) {
            System.out.println("\t========ROUND #" + i + "========");
            System.out.println("SELECT AN OPTION");
            System.out.println("1) ROCK");
            System.out.println("2) SCISSOR");
            System.out.println("3) PAPER");
            System.out.print("MOVEMENT FOR PLAYER 1: ");
            movement1 = player1.makeMovement();
            System.out.print("MOVEMENT FOR PLAYER 2: ");
            movement2 = player2.makeMovement();

            switch (movement1) {
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
            if (winsWith == movement2) {
                score.addScore(new ScoreItem(player1,i, movement1, true));
                score.addScore(new ScoreItem(player2,i, movement2, false));
            } else {
                score.addScore(new ScoreItem(player1,i, movement1, false));
                score.addScore(new ScoreItem(player2,i, movement2, true));
            }
            i++;
        }
    }

    public void determineWinner(){
        score.displayHistory();
        score.displayWinner();

    }

}
