public class Terminator extends Unit {
    private static final int health = 150;
    private static final int damage = 10;
    private static final int critDamage = 100; // I love democracy
    private static final float critChance = 0.05f;
    private static final float parryChange = 0.5f;
    public Terminator() {}
    public Terminator(Player player) { super(health, damage, critDamage, critChance, parryChange, "Terminator", player); }

    public String toString(String info) {
        // Yes. I use constructor overloading without using a variable inside it. My brain made me do it this way
        String unitType = "Terminator";
        return String.format(Utils.unitsWithNoManaSpecs, unitType, health, damage, critDamage, critChance);
    }
}
