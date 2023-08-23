/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Wera
 */
public class Model {

    private Shape currentShape;
    private Collection<Shape> shapes;

    public Model(Shape s) {
        this.currentShape = s;
        this.shapes = new ArrayList<>();
    }

   public Collection<Shape> getShapes(){
        return shapes;
   }

    public void createShape(Point one){
        currentShape = new Rectangle(one,one);
        shapes.add(currentShape);
    }

    public void stretchShape(Point two){
        currentShape.setPointTwo(two);
    }
}
