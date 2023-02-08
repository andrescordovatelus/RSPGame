import java.util.ArrayList;
import java.util.Scanner;

public class RSPGame {
    private Player player1;
    private Player player2;
    private Round round;
    private Shape shape;
    private Score score;
    private ArrayList<Player> players = new ArrayList<>();

    public void choosePlayer() {
        Scanner sc = new Scanner(System.in);
        int id = 0, count = 1;
        boolean distinct = true;

        do {
            displayPlayers();
            System.out.print("WRITE ID OF PLAYER #" + count + ": ");
            id = sc.nextInt();
            if (count == 1) {
                player1 = searchPlayer(id);
                count++;
            }
            player2 = searchPlayer(id);
            if (player1.equals(player2)) {
                System.out.println("Both players should be different");
                distinct = false;
            } else {
                distinct = true;
            }
        } while (distinct == false);
    }

    public void execute() {
        registerPlayer();
        choosePlayer();
        round = new Round(player1, player2);
        int totalRounds = round.getTotalRounds();
        int counter = round.getRoundsCounter();
        ArrayList<Score> scoreHistory = new ArrayList<>();
        do {
            Round currentRound = new Round(player1, player2);
            System.out.println("SELECT AN OPTION");
            System.out.println("1) ROCK");
            System.out.println("2) SCISSOR");
            System.out.println("3) PAPER");
            Player winner = currentRound.executeRounds();
            score = new Score(currentRound, winner.getId(), winner.getName());
            //counter++;
            currentRound.setRoundsCounter(counter++);
            scoreHistory.add(score);
            scoreHistory.forEach(score -> System.out.println(score.toString()));
        } while (counter <= totalRounds);
    }

    public void registerPlayer() {
        Scanner sc = new Scanner(System.in);
        String name;
        int option = 1;
        boolean isHuman;
        do {
            System.out.println("\tADD NEW USER");
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("Is a human?: ");
            isHuman = sc.nextBoolean();
            if (isHuman == false) {
                Computer computer = new Computer(name, false);
                players.add(computer);
            } else {
                Human human = new Human(name, true);
                players.add(human);
            }
            System.out.print("Add another user? 0. No 1. Yes ");
            option = sc.nextInt();
        } while (option == 1);
    }

    public void displayPlayers() {
        players.forEach(player -> System.out.println(player.toString()));
    }

    public Player searchPlayer(int id) {
        return players.stream()
                .filter(player -> player.getId() == id)
                .findAny()
                .orElse(null);
    }

}
