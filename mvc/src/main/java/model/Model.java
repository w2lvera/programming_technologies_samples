/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wera
 */
public class Model {

    Shape currentShape;

    public Model(Shape s) {
        this.currentShape = s;
    }

    public Shape getCurrentShape() {
        return currentShape;
    }

    public Shape createShape(Point one){
        currentShape = new Rectangle(one,one);
        return currentShape;
    }

    public Shape stretchShape(Point two){
        currentShape.setPointTwo(two);
        return currentShape;
    }
}
