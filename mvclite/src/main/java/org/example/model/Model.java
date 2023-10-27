package org.example.model;

import java.util.ArrayList;
import java.util.Collection;

public class Model {
    MyShapeDecorator currentShape;
    Collection<MyShapeDecorator> list;

    public Model() {
       list = new ArrayList<>();
    }

    public void setCurrentShape(MyShapeDecorator currentShape) {
        this.currentShape = currentShape;
    }

    public void createCurrentShape(MyShapeDecorator sD) {
        currentShape = sD;
        list.add(currentShape);

    }

    public MyShapeDecorator getCurrentShape() {
        return currentShape;
    }

    public Collection<MyShapeDecorator> getList() {
        return list;
    }
}
