import Strategy.WithStrategyPattern.Goods;
import Strategy.WithStrategyPattern.Sports;
import Strategy.WithStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Sports();
        v1.drive();

        Vehicle v2 = new Goods();
        v2.drive();
    }
}