package org.example;

import org.example.shape.ShapesEnum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {
    @Test
        void shapeSortedByType() {
            ShapeCollection shapeCollection = new ShapeCollection();
            shapeCollection.addShape(ShapeFactory.createShape(ShapesEnum.REC));
            shapeCollection.addShape(ShapeFactory.createShape(ShapesEnum.ELLIPSE));
            shapeCollection.addShape(ShapeFactory.createShape(ShapesEnum.ELLIPSE));
            shapeCollection.addShape(ShapeFactory.createShape(ShapesEnum.LINE));
            shapeCollection.addShape(ShapeFactory.createShape(ShapesEnum.REC));


            List<String> types = shapeCollection.sortedByType();
            List<String> expected = Arrays.asList("ellipse", "ellipse", "line", "rectangle","rectangle");
            int i = 0;
            for (String type : types) {
                assertEquals(expected.get(i), type);
                i++;
            }
        }
}
