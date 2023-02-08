public class Main {
    public static void main(String[] args) {
        RSPGame game = new RSPGame();
        game.setup();
        game.choosePlayer();
        game.execute();
        game.statistics();
    }
}
