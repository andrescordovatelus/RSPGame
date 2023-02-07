import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Player player1;
    private Player payer2;
    private int RoundsCounter = 0;
    private ArrayList<Player> players = new ArrayList<>();
    
    public void execute() {
        registerPlayer();
    }

    public void registerPlayer(){
        Scanner sc = new Scanner(System.in);
        String name;
        int option = 1;
        boolean isHuman;
        do{
            System.out.println("\tADD NEW USER");
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("Is a human?: ");
            isHuman = sc.nextBoolean();
            if(isHuman == false){
                Computer computer = new Computer(name, false);
                players.add(computer);
            }else{
                Human human = new Human(name, true);
                players.add(human);
            }
            System.out.print("Add another user? 0. No 1. Yes ");
            option = sc.nextInt();
        }while(option == 1);
        displayPlayers();
    }

    public void displayPlayers(){
        players.forEach(player -> System.out.println(player.toString()));
    }


    
}
