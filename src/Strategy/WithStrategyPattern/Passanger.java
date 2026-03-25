package Strategy.WithStrategyPattern;

import Strategy.WithStrategyPattern.Strategy.DriveStrategy;
import Strategy.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class Passanger extends Vehicle {
    Passanger() {
        super(new NormalDriveStrategy());
    }
}
