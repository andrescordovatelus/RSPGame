import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Score {
    private ArrayList<ScoreItem> scores = new ArrayList<>();

    public void addScore(ScoreItem scoreItem) {
        scores.add(scoreItem);
    }

    public void displayHistory() {
        System.out.println("\t========SCORES HISTORY========");
        scores.forEach(scoreItem -> System.out.println(scoreItem.toString()));
    }

    public void displayWinner(){
        System.out.println("\t========WINNER========");
        /*scores.stream()
            .filter(scoreItem -> scoreItem.isWinner());*/
            Player[] winnerPerRound = new Player[3];
            int j = 0;
            scores.forEach(scoreItem -> {
                if(scoreItem.isWinner() == true){
                    winnerPerRound[j] = scoreItem.getPlayer();
                }
            });
        
    }

}
