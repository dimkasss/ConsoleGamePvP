public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();
        Unit unit1 = new Unit("Dima");
        Unit unit2 = new Unit("Bobik");

        Game game2 = new Game();
        Wizard wizard1 = new Wizard("Ibragim", 20);
        wizard1.attack(unit1);
        System.out.println("After wizard's attack!!");
        System.out.println(unit1);
        System.out.println(Game.PlayersCount);

        Math math = new Math();
        math.
    }
}