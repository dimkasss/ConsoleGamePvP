public class Wizard extends Unit {
    private static String unitType = "Wizard";
    private static int health = 70;
    private static int damage = 30;

    private static int critDamage = 45;
    private static float critChance = 0.5f;
    private static float parryChange = 0f;
    private int mana = 100;
    private static int manaRequiredForCast = 100;
    public Wizard() {}
    public Wizard(Player player) {
        super(health, damage, critDamage, critChance, parryChange, unitType, player);
    }

    @Override
    public void attack(Unit opponent) {
        if (this.mana >= 30) {
            super.attack(opponent);
            this.mana -= 30;
        }
        else {
            System.out.println("[GAME] Wizard could not cast the attack spell! Not enough mana (" + this.mana + "/" +
                    manaRequiredForCast + ")");
        }
    }

    public String toString(String info) {
        // Yes. I don't care about DRY principal. I just dont wanna think anymore. Leaving it as it is
        return String.format(Utils.unitsWithManaSpecs, unitType, health, damage, critDamage, critChance, mana,
                manaRequiredForCast);
    }


    @Override
    public String toString() {
        if (isAlive) return "[UNIT INFO] " + this.owner.getName() + "'s " + unitType + ":  " +
                "Health: " + super.health + "; Damage: " + damage + "; Mana: " + this.mana;
        return this.owner.getName() + "'s " + unitType + " is dead!";
    }
}
