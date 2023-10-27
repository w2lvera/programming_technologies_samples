package org.example.model;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

/**
 *
 * @author Vera
 */
public class Border implements MyShapeDecorator{
    MyShapeDecorator myShapeDecorator;
    int width=10;

    public Border(MyShapeDecorator myShapeDecorator) {

        this.myShapeDecorator = myShapeDecorator;

    }

    @Override

    public void draw(Graphics2D g2) {

        this.myShapeDecorator.draw(g2);

        RectangularShape helpShape = myShapeDecorator.getShape();

        Point2D pointLeft = new Point2D.Double(helpShape.getMinX()-width,

                helpShape.getMinY()-width );

        Point2D pointRight = new Point2D.Double(helpShape.getMaxX()+width,

                helpShape.getMaxY()+width);

        RectangularShape helpShape1 = (RectangularShape) helpShape.clone();

        helpShape1.setFrameFromDiagonal(pointLeft, pointRight);
        Paint paint = g2.getPaint();
        g2.setColor(myShapeDecorator.getColor());
        g2.draw(helpShape1);
        g2.setPaint(paint);


    }

    @Override
    public void setFrame(Point2D[] p) {
        myShapeDecorator.setFrame(p);
    }

//    @Override
//
//    public void setFrame(Point2D[] p) {        myShapeInterface.setFrame(p);    }

    @Override

    public RectangularShape getShape() {   return myShapeDecorator.getShape();   }

    @Override
    public void setParameter(int par){    width = par;    }

    @Override
    public MyShapeDecorator clone() {
        Border sd = new Border(myShapeDecorator.clone());
        sd.width = width;
        return sd;
    }

    @Override
    public Color getColor() {
        return myShapeDecorator.getColor();
    }

}
