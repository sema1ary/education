import pattern.factory.AbstractFactory;
import pattern.factory.FactoryType;
import pattern.factory.car.CarFactory;
import pattern.factory.car.CarType;
import pattern.factory.car.Mercedes;
import pattern.factory.plane.PlaneFactory;
import pattern.factory.plane.PlaneType;
import pattern.factory.plane.SpeedPlane;
import pattern.singelton.Singleton;

public class Education {
    public static void main(String[] args) {
        AbstractFactory factory = new AbstractFactory();

        CarFactory carFactory = (CarFactory) factory.create(FactoryType.CAR);
        PlaneFactory planeFactory = (PlaneFactory) factory.create(FactoryType.PLANE);

        Mercedes mercedes = (Mercedes) carFactory.create(CarType.MERCEDES);
        SpeedPlane plane = (SpeedPlane) planeFactory.create(PlaneType.SPEED_PLANE);

        mercedes.drive();
        plane.fly();

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);
     }
}
