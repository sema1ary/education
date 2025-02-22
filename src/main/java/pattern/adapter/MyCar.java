package pattern.adapter;

public class MyCar implements Car {
    @Override
    public void wash() {
        System.out.println("wash");
    }
}
