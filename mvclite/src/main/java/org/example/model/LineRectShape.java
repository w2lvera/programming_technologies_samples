package org.example.model;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

public class LineRectShape implements MyShapeDecorator{
    MyShapeDecorator myShapeDecorator;
    public LineRectShape(MyShapeDecorator myShapeDecorator) {

        this.myShapeDecorator = myShapeDecorator;

    }

    @Override

    public void draw(Graphics2D g2) {

        myShapeDecorator.draw(g2);

        Line2D line;

        RectangularShape helpShape = myShapeDecorator.getShape();

        Point2D pointLeft = new Point2D.Double(helpShape.getMinX(),

                helpShape.getMinY() );

        Point2D pointRight = new Point2D.Double(helpShape.getMaxX(),

                helpShape.getMaxY() );

        line = new Line2D.Double(pointLeft,pointRight);

        Paint paint = g2.getPaint();
        g2.setColor(myShapeDecorator.getColor());
        g2.draw(line);
        g2.setPaint(paint);

    }

    @Override
    public void setFrame(Point2D[] p) {
        myShapeDecorator.setFrame(p);
    }


//    @Override
//
//    public void setFrame(Point2D[] p) {
//
//     myShapeInterface.setFrame(p);    }



    @Override

    public RectangularShape getShape() {

        return myShapeDecorator.getShape();
    }

    @Override
    public void setParameter(int par) {

    }

    @Override
    public MyShapeDecorator clone() {
        LineRectShape sd = new LineRectShape(myShapeDecorator.clone());
        return sd;
    }
    public Color getColor() {
        return myShapeDecorator.getColor();
    }

}
