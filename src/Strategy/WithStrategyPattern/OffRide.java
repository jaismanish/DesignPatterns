package Strategy.WithStrategyPattern;

import Strategy.WithStrategyPattern.Strategy.DriveStrategy;
import Strategy.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRide extends Vehicle {
    OffRide() {
        super(new SportsDriveStrategy());
    }
}
