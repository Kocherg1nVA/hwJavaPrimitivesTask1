public class BonusMilesService {

    public int calculate(int price) {
        int rubMiles = 20;
        int bonus = price / rubMiles;
        return bonus;
    }
}
