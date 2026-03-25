package Strategy.WithStrategyPattern;

import Strategy.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class Sports extends Vehicle {
    public Sports() {
        super(new SportsDriveStrategy());
    }
}
