package org.example;

import org.example.shape.Shapes;
import org.example.shape.ShapesEnum;

import java.awt.*;
import java.awt.geom.Point2D;

public class ShapeFactory {
        static class Rectangle extends Shapes{
            private ShapesEnum type;

            public Rectangle(Point2D x, Point2D y) {
                super(x, y);
                this.type = ShapesEnum.REC;
            }
            public Rectangle() {
                type = ShapesEnum.REC;
            }
            @Override
        public void draw(Graphics2D g) {
            g.drawRect((int)x.getX(),(int)x.getY(),
                    (int)y.getX()-(int)x.getX(),(int)y.getY()-(int)x.getY());
        }

            @Override
            public String getType() {
                return "rectangle";
            }
        }
    static class Ellipse extends Shapes{
        private ShapesEnum type;

        public Ellipse(Point2D x, Point2D y) {
            super(x, y);
            this.type = ShapesEnum.ELLIPSE;
        }

        public Ellipse() {
            type = ShapesEnum.ELLIPSE;
        }

        @Override
        public void draw(Graphics2D g) {
            g.drawOval((int)x.getX(),(int)x.getY(),
                    (int)y.getX()-(int)x.getX(),(int)y.getY()-(int)x.getY());
        }

        @Override
        public String getType() {
            return "ellipse";
        }
    }
    static class Line extends Shapes{
        private ShapesEnum type;

        public Line(Point2D x, Point2D y) {
            super(x, y);
            this.type = ShapesEnum.LINE;
        }

        public Line() {
            type = ShapesEnum.LINE;
        }

        @Override
        public void draw(Graphics2D g) {
            g.drawOval((int)x.getX(),(int)x.getY(),
                    (int)y.getX()-(int)x.getX(),(int)y.getY()-(int)x.getY());
        }

        @Override
        public String getType() {
            return "line";
        }
    }
    public static Shapes createShape(ShapesEnum type){
            Shapes shapes;
            switch (type){
                case REC -> shapes = new Rectangle();
                case ELLIPSE -> shapes = new Ellipse();
                case LINE -> shapes = new Line();
                default -> shapes = null;
            }
            return shapes;
    }

}
