package model;

public abstract class Shape {

    private Point pointOne;
    private Point pointTwo;
    private Color color;
    private boolean isFilled;

    public Shape(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.color = Color.BLUE;
        isFilled = false;
    }

    public Shape(Point pointOne, Point pointTwo, Color color) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.color = color;
        isFilled = false;
    }



    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract Shape returnClone();

    public abstract java.awt.Shape translateForView();

}
