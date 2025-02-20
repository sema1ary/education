package pattern.factory;

import java.util.Objects;

public class PlaneFactory implements Factory {
    public Plane create(PlaneType type)  {
        if (Objects.requireNonNull(type) == PlaneType.SPEED_PLANE) {
            return new SpeedPlane();
        }
        return null;
    }
}
