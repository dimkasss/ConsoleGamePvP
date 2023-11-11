public class Knight extends Unit {
    private static final int health = 100;
    private static final int damage = 20;
    private static final int critDamage = 30;
    private static final float critChance = 0.3f;
    private static final float parryChange = 0.1f;
    public Knight() {}
    public Knight(Player player) {
        super(health, damage, critDamage, critChance, parryChange, "Knight", player);
    }

    public String toString(String info) {
        String unitType = "Knight";
        return String.format(Utils.unitsWithNoManaSpecs, unitType, health, damage, critDamage, critChance);
    }


}
