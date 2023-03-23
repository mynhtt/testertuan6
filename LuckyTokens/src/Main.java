import Models.GamePlay;
public class Main {
    public static void main(String[] args) {
        GamePlay gamePlay = new GamePlay();
        gamePlay.startUp();
        gamePlay.gameLoop();
    }
}