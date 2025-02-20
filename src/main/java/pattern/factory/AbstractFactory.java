package pattern.factory;

import pattern.factory.car.CarFactory;
import pattern.factory.plane.PlaneFactory;

public class AbstractFactory {
    public Factory create(FactoryType type) {
        switch (type) {
            case CAR -> {
                return new CarFactory();
            }
            case PLANE -> {
                return new PlaneFactory();
            }
            default -> {
                return null;
            }
        }
    }
}
