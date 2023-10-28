import java.util.Scanner;

public class Utils {
    private static String helloMessage = "Hello and welcome! You are playing one of the best AAA-games from all " +
            "over the world - EpicFightingGame! (the name is reserved)";
    private static String gamemodeMessage = """
            Choose a gamemode:
            1 - Full auto (EvE)
            2 - Semi-auto (PvE)
            3 - Manual (PvP)Note: the only gamemode available now is PvP (3)""";

    private static String nameMessage = "Enter your player's name:";
    private static String unitsChoiceMessage = """
            Choose three units that you are going to be playing with (Example:W W K. The options:\s
            W -> Witch
            K-Knight
            T-Terminator""";

    public static void printHelloInfo() {
        System.out.println(helloMessage);
    }

    public static void printGamemodeInfo() {
        System.out.println(gamemodeMessage);
    }

    public static void printUnitsChoice() {
        System.out.println(unitsChoiceMessage);
    }

}
