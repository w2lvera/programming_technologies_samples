package model;

public class Rectangle extends Shape{

    public Rectangle(Point pointOne, Point pointTwo) {
        super(pointOne, pointTwo);
    }

    public Rectangle(Point pointOne, Point pointTwo, Color color) {
        super(pointOne, pointTwo, color);
    }

    @Override
    public Shape returnClone() {
        return null;
    }

    @Override
    public java.awt.Shape translateForView() {
        return null;
    }

}
