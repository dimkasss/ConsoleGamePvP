import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private final String name;
    private final Scanner in = new Scanner(System.in);
    public List<Unit> units = new ArrayList<>();

    private int unitsAliveCount = 3;

    public Player(String name) { this.name = name; this.initializeUnits(); }

    public String getName() {
        return name;
    }

    public void setUnit(int unitType) {
        switch(unitType) {
            case 1:
                this.units.add(new Wizard(this));
                break;
            case 2:
                this.units.add(new Knight(this));
                break;
            case 3:
                this.units.add(new Terminator(this));
        }
    }

    public void initializeUnits() {
        Scenario.printPlayer(name);
        Scenario.printPlayerPeekInfo();
        for (int i = 0; i != 3; ++i) {
            int unitType = in.nextInt();
            this.setUnit(unitType);
        }
    }

    public void makeMove(Player opponent) {
        Scenario.printMakeMoveWith(this);
        Unit attackUnit = units.get(in.nextInt() - 1);
        Scenario.printMakeMoveOnto(opponent);
        Unit defenceUnit = opponent.units.get(in.nextInt() - 1);
        attackUnit.attack(defenceUnit);
    }

    public void setUnitsAliveCount(int unitsAliveCount) { this.unitsAliveCount = unitsAliveCount; }

    public int getUnitsAliveCount() { return this.unitsAliveCount; }

    public String getUnits() {
        String unitsFormatted = "";
        List<Unit> aliveUnits = units.stream().filter(c -> c.isAlive).toList();
        for (int i = 0; i != aliveUnits.size(); i++) {
            unitsFormatted += aliveUnits.get(i);
            unitsFormatted += "\n";
        }
        return unitsFormatted;
    }

    @Override
    public String toString() {
        return name + ":\n" + getUnits();
    }
}