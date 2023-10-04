package org.example;

import org.example.shape.Shapes;
import org.example.shape.ShapesEnum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShapeCollection {
    ArrayList<Shapes> list=new ArrayList<>();
    public void addShape(Shapes shape){
        list.add(shape);
    }
    public List<String> sortedByType(){
        ArrayList<String> stringArrayList = new ArrayList<>();
        Comparator<Shapes> comparator = new Comparator<Shapes>() {
            @Override
            public int compare(Shapes o1, Shapes o2) {
                return o1.getType().compareTo(o2.getType());
            }
        };
        list.sort(comparator);
        for(Shapes x:list){
            stringArrayList.add(x.getType());
        }
        return stringArrayList;
    }
}
