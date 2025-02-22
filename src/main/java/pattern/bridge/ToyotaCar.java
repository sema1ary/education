package pattern.bridge;

public class ToyotaCar implements ICar{
    @Override
    public void drive() {
        System.out.println("drive");
    }
}
