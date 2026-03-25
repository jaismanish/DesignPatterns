package Strategy.WithStrategyPattern;

import Strategy.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class Goods extends Vehicle {
    public Goods(){
        super(new NormalDriveStrategy());
    }
}
