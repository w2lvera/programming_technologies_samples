package org.example.factoryMetod;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RectangleCreator implements ShapeMaker{
    @Override
    public RectangularShape createShape() {
        return new Rectangle2D.Double();
    }
}
