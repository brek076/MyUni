package factor.Fabric;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RectangleMaker implements  ShapeMaker{
    @Override
    public RectangularShape buildShape() {
        return new Rectangle2D.Double();
    }
}
