import java.util.Scanner;

enum Scenarios {
    GAME_MODE,
    HELLO,
    FIRST_PLAYER_INPUT,
    SECOND_PLAYER_INPUT,

}

public class Scenary {
    protected Scenarios ScenaryState = Scenarios.GAME_MODE;
    protected int Round = 1;
    protected int Gamemode = 2;

    public void toNextScenario() {
        this.ScenaryState = Scenarios.values()[(this.ScenaryState.ordinal() + 1) % Scenarios.values().length];
    }

    public void helloScenario() {
        Utils.printHelloInfo();
        toNextScenario();
    }

    public void chooseGamemodeScenario() {
        Utils.printGamemodeInfo();
        Scanner in = new Scanner(System.in);
        this.Gamemode = in.nextInt();
        toNextScenario();
    }

    // if scenario is PvP (by default now):
    public void chooseUnitsScenario(Player[] players) {
        Utils.printUnitsChoice();

        players[0] = new Player()
    }


    public Scenarios getScenaryState() {
        return ScenaryState;
    }

    public int getRound() {
        return Round;
    }

    public int getGamemode() {
        return Gamemode;
    }
}
