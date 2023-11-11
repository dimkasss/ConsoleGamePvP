public class Unit {
    public Player owner;
    protected int health;
    private int damage;
    private float critChance;
    private int critDamage;
    private float parryChance;

    public boolean isAlive = true;

    public String unitType;
    public Unit() {}; // programming war crimes pt. 1
    public Unit(int health, int damage, int critDamage, float critChance, float parryChance, String unitType, Player owner) {
        Game.playersCount++;
        this.health = health;
        this.damage = damage;
        this.critDamage = critDamage;
        this.critChance = critChance;
        this.parryChance = parryChance;
        this.unitType = unitType;
        this.owner = owner;
    }

    public boolean isCriticalAttack() {
        return Math.random() <= this.critChance;
    }

    public boolean isParried(double parryChance) {
        return Math.random() <= parryChance;
    }

    public void attack(Unit opponent) {
        // if the attack is critical, you cannot parry it.
        if (isCriticalAttack()) {
            opponent.getDamage(this.critDamage);
            Scenario.printDamageIsCritical(this.critDamage);
        }
        else if (!isParried(opponent.parryChance)) opponent.getDamage(this.damage);
        else {
            Scenario.printAttackIsParried();
        }

        if (opponent.health <= 0) opponent.Die();
    }

    public void getDamage(int damage) { this.health -= damage; }
    public void Die() {
        System.out.printf("[GAME] %s's %s is dead!\n", this.owner.getName(), this.unitType); // %s's %s sounds cool
        this.isAlive = false;
        int unitsAlive = this.owner.getUnitsAliveCount() - 1;
        this.owner.setUnitsAliveCount(unitsAlive);
        if (this.owner.getUnitsAliveCount() == 0) Game.setGameOver();
    }

    @Override
    public String toString() {
        if (isAlive) return "[UNIT INFO] " + this.owner.getName() + "'s " + this.unitType + ":  " +
                "Health: " + health + "; " + "Damage: " + damage;
        return this.owner.getName() + "'s " + this.unitType + " is dead!";
    }
}
