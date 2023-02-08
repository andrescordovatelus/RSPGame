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
            Player[] winnerPerRound = new Player[3];
            int j = 0;
            for(int i = 0; i < scores.size(); i++){
                if(scores.get(i).isWinner() == true){
                    winnerPerRound[j] = scores.get(i).getPlayer();
                    j++;
                }
            }

            Player winner = winnerPerRound[0];

            for(int i = 1; i < winnerPerRound.length; i++){
                if(winner.getId() == winnerPerRound[i].getId()){
                    i++;
                }else{
                    winner = winnerPerRound[i];
                }
            }
            System.out.println(winner.toString());
        
    }

}
