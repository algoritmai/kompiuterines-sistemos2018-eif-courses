/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.util.Arrays;
import java.util.List;



/**
 *
 * @author Marius
 */


class Shape{}
class Circle extends Shape{}
class Rectangle extends Shape{
}
class Square extends Shape{
}


public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
        
                "Circle",
                "Rectangle",
                "Circle",
                "Rectangle",
                "Circle",
                "Rectangle"
                
        );
        
        for (String elem : list) {
            Shape sh = ShapeFactory.getShape(elem);
            System.out.println(""+sh.getClass().getName());
        }
        
        // TODO code application logic here
    }
    
    
}
class ShapeFactory {
	
   //use getShape method to get object of type shape 

        /**
         *
         * @param shapeType
         * @return
         */
   public static Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
    }