import java.util.List;
import java.util.Scanner;

public class Game {
    private final Player[] players = new Player[2];
    private Player currentPlayer;
    private Player anotherPlayer;
    private static boolean gameIsOver = false;

    public static int playersCount = 0;

    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }
    public Player getAnotherPlayer() {
        return this.anotherPlayer;
    }
    public boolean isOver() { return gameIsOver; }
    public static void setGameOver() {
        gameIsOver = true;
    }
    public Player[] getPlayers() { return players; }

    public void startGame() {
        Scenario.printHelloInfo();
        this.initializePlayers();
        while(!this.isOver()) {
            Scenario.printPlayer(this.getCurrentPlayer().getName());
            this.getCurrentPlayer().makeMove(this.getAnotherPlayer());
            Scenario.printPlayersInfo(this.getPlayers());
            this.switchCurrentPlayer();
        }
        Scenario.printVictoryMessage(this.getAnotherPlayer());
    }

    public void initializePlayers() {
        players[0] = new Player("Player 1");
        players[1] = new Player("Player 2");
        currentPlayer = players[0];
        anotherPlayer = players[1];
    }

    public void switchCurrentPlayer() {
        Player tempPlayer = currentPlayer;
        currentPlayer = anotherPlayer;
        anotherPlayer = tempPlayer;
    }
}
