public class Player{
    protected String name;
    protected Unit[] units;
    Player(String[] roles) {
        this.units = handleUnits(roles);
    }

    private Unit[] handleUnits(String[] roles) {
        Unit[] units = {};
        for (int i = 0; i != roles.length; ++i) {
            switch(roles[i]) {
                case "Wizard":
                    units += new Wizard();
            }
        }
    }
}
