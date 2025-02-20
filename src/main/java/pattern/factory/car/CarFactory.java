package pattern.factory.car;

import pattern.factory.Factory;

public class CarFactory implements Factory {
    public Car create(CarType type) {
        switch (type) {
            case MERCEDES -> {
                return new Mercedes();
            }
            case BMW -> {
                return new BMW();
            }
            default -> {
                return null;
            }
        }
    }
}
