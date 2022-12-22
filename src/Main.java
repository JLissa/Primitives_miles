import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
//        int price = 10_000;
        int miles = service.calculate(10_000);
        System.out.println(miles);

        miles = service.calculate(2000);
        System.out.println(miles);

        miles = service.calculate(550);
        System.out.println(miles);
    }
}

