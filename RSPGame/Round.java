public class Round {
    private Player playerOne;
    private Player playerTwo;
    private int movementPlayerOne;
    private int movementPlayerTwo;
    private final int totalRounds = 3;
    private int roundCounter = 1;
    private Shape shape;
    private Score score;

    public Round(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        score = new Score();
    }

    public void executeRounds() {
        while (roundCounter <= totalRounds) {
            System.out.println("\t========ROUND #" + roundCounter + "========");
            System.out.println("SELECT AN OPTION");
            System.out.println("1) ROCK");
            System.out.println("2) SCISSOR");
            System.out.println("3) PAPER");
            if(playerOne.getIsHuman() == true){
                System.out.print("MOVEMENT FOR PLAYER 1: ");
                movementPlayerOne = playerOne.makeMovement();
            }else{
                movementPlayerOne = playerOne.makeMovement();
            }
            if(playerTwo.getIsHuman() == true){
                System.out.print("MOVEMENT FOR PLAYER 2: ");
                movementPlayerTwo = playerTwo.makeMovement();
            }else{
                movementPlayerTwo = playerTwo.makeMovement();
            }

            determineRoundWinner();
        }
    }

    public void determineRoundWinner() {
        switch (movementPlayerOne) {
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

        if (movementPlayerOne != movementPlayerTwo) {
            int winsWith = shape.winsWith() + 1;
            if (winsWith == movementPlayerTwo) {
                score.addScore(new ScoreItem(playerOne, roundCounter, movementPlayerOne, true));
                score.addScore(new ScoreItem(playerTwo, roundCounter, movementPlayerTwo, false));
            } else {
                score.addScore(new ScoreItem(playerOne, roundCounter, movementPlayerOne, false));
                score.addScore(new ScoreItem(playerTwo, roundCounter, movementPlayerTwo, true));
            }
            roundCounter++;
        } else {
            System.out.println("IIE! PLAY AGAIN");
        }
    }

    public void determineWinner() {
        score.displayHistory();
        score.displayWinner();

    }

}
