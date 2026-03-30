import Factory.*;
import Strategy.WithStrategyPattern.Goods;
import Strategy.WithStrategyPattern.Sports;
import Strategy.WithStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Vehicle v1 = new Sports();
//        v1.drive();
//
//        Vehicle v2 = new Goods();
//        v2.drive();

        //pizza
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Ordered: " + pizza1.getName());

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("Ordered: " + pizza2.getName());

    }
}