public class BonusMilesService {
    public int calculate(int cost) {
        int oneMileBonus = 20;
        int miles = 0;
        
        if (cost >= oneMileBonus) {
           miles = cost / oneMileBonus;
        }
        return miles;
    }
}


