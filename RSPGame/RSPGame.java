import java.util.ArrayList;

public class RSPGame {
    private Player player1;
    private Player player2;
    private Round round;
    private ArrayList<Player> players = new ArrayList<>();

    public void choosePlayer() {
        int id = 0, count = 1;
        boolean distinct = true;

        do {
            displayPlayers();
            System.out.print("WRITE ID OF PLAYER #" + count + ": ");
            id = Console.getInt();
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
        round = new Round(player1, player2);
    }

    public void setup(){
        registerPlayer();
    }

    public void execute() {
        round.executeRounds();
    }

    public void statistics(){
        round.determineWinner();
    }

    public void registerPlayer() {
        String name;
        int option = 1;
        boolean isHuman;
        do {
            System.out.println("\tADD NEW USER");
            System.out.print("Name: ");
            //name = sc.next();
            name = Console.getStringNext();
            System.out.print("Is a human?: ");
            isHuman = Console.getBoolean();
            if (isHuman == false) {
                Computer computer = new Computer(name, false);
                players.add(computer);
            } else {
                Human human = new Human(name, true);
                players.add(human);
            }
            System.out.print("Add another user? 0. No 1. Yes ");
            option = Console.getInt();
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
