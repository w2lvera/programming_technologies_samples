package org.example.singleton;

import org.example.Main;

public class Model {
    private static Model model = null;
    private Model(){}
    static public Model getInstance(){
        if(model==null)
            model = new Model();
        return model;
    }
}
