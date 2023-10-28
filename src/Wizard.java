public class Wizard extends Unit {
    protected int mana = 100;

    public Wizard(String name, int damage) {
        super(name);
        super.setPower(damage);
        super.setDefence(80);
    }

    @Override
    public void attack(Unit unit) {
        mana -= 10;
        if (mana != 0) {
            super.attack(unit);
        }
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", defence=" + defence +
                '}';
    }
}
