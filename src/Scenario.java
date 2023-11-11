public class Scenario {
    public static void printHelloInfo() { System.out.println(Utils.helloInfo); }


    public static void printPlayer(String player) { System.out.println(player); }

    public static void printPlayersInfo(Player[] players) {
        System.out.println("################ PLAYERS INFO ################");
        System.out.println(players[0]);
        System.out.println(players[1]);
        System.out.println("##############################################");
    }
    public static void printPlayerPeekInfo() {
        System.out.println(Utils.chooseUnitsInfo);
        System.out.println("1: " + new Wizard().toString("info"));
        System.out.println("2: " + new Knight().toString("info"));
        System.out.println("3: " + new Terminator().toString("info"));
    }

    private static void printPlayerUnits(Player player) {
        for (int i = 0; i != player.units.size(); i++) {
            if (player.units.get(i).isAlive) {
                System.out.println(i+1 + ": " + player.units.get(i));
            }
        }
    }

    public static void printMakeMoveWith(Player player) {
        System.out.println(Utils.playerMakeMoveWithWho);
        printPlayerUnits(player);
    }

    public static void printMakeMoveOnto(Player player) {
        System.out.println(Utils.playerMakeMoveOntoWho);
        printPlayerUnits(player);
    }

    public static void printDamageIsCritical(int critDamage) {
        System.out.printf("[GAME] Critical hit! Did %d damage\n", critDamage);
    }

    public static void printAttackIsParried() {
        System.out.println("[GAME] Opponent parried the attack, and received no damage!");
    }

    public static void printVictoryMessage(Player player) {
        System.out.println("\n" + player.getName() + " won the game!");
        System.out.println("His alive units:\n" + player.getUnits());
    }
}
