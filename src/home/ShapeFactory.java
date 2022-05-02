package home;

import java.util.HashMap;

import home.Line;

public class ShapeFactory{

    public static enum ShapeType{
        OVAL_FILL,OVAL_NO_FILL,LINE;
    }
    private static final HashMap<ShapeType,Shape> shapes=new HashMap<ShapeType,Shape>();

    public static Shape getShape(ShapeType type){
        Shape shape=shapes.get(type);
        if(shape==null){
           if(type.equals(ShapeType.OVAL_FILL)){
               shape= new Oval(true);
               MyUtils.log("SHAPE FACTORY","ovel type (FILL) shape instance created");
           } 
           if(type.equals(ShapeType.OVAL_NO_FILL)){
               shape=new Oval(false);
               MyUtils.log("SHAPE FACTORY","ovel type(NO FILL) shape instance created");

           }
           else if(type.equals(ShapeType.LINE)){
                shape = new home.Line();
               MyUtils.log("SHAPE FACTORY","Line shape instance created");

           }
           shapes.put(type, shape);
        }
        return shape;
    }

}