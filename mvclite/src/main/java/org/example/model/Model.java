package org.example.model;

import java.util.ArrayList;
import java.util.Collection;

public class Model {
    MyShape currentShape;
    Collection<MyShape> list;

    public Model() {
       list = new ArrayList<>();
    }

    public void setCurrentShape(MyShape currentShape) {
        this.currentShape = currentShape;
    }

    public MyShape createCurrentShape() {
        currentShape = new MyShape();
        list.add(currentShape);
        return currentShape;
    }

    public MyShape getCurrentShape() {
        return currentShape;
    }

    public Collection<MyShape> getList() {
        return list;
    }
}
