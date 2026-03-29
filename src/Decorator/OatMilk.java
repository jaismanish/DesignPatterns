package Decorator;

public class OatMilk extends CondimentDecorator{
    Beverage beverage;

    public OatMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Oat Milk";
    }

    public double cost(){
        return 1.00 + beverage.cost();
    }
}
