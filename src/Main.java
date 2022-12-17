import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {
        int ticketPrice = 50;
        int oneMileBonus = 20;

        int amountMileBonus;

        if (ticketPrice > oneMileBonus) {
            amountMileBonus = ticketPrice / oneMileBonus;
            System.out.println(amountMileBonus);
        }
    }
}
