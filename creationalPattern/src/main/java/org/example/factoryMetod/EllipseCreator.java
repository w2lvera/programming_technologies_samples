package org.example.factoryMetod;

import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;

public class EllipseCreator implements ShapeMaker {
    @Override
    public RectangularShape createShape() {
        return new Ellipse2D.Double();
    }
}
