/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaspi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Marius
 */

class Item {}
public class LambdasPI {

    /**
     * @param args the command line arguments
     */
    
    static void greet(Print p){
        p.print();
    }
    static <Labas extends Number>void getType(Labas t){
    
    }
    
    
    public static void main(String[] args) {
       
        
        List<Item> list = Arrays.asList(new Item(), new Item());
        
        list.forEach(System.out::println);
        //Collections.sort(list, );
        
                
        
        
        PrintTwoParameters parameters = (a, s) -> System.out.println(a+" "+s);
        parameters.printTwo(0, "lllllllllllllllllll");
              
        
        Print print = new Print() {
            @Override
            public void print() {
                System.out.println("Spausdinu");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        print.print();
        
        Print printLambda = ()-> System.out.println("Spausdinu lambda");
        print.print();
        
        greet(()->System.out.println("jhbj"));
        
        PrintID<Integer> printID = a -> {
            System.out.println("hello");
            return a * 2;
        };
        System.out.println(printID.id(10));
        
        
        // TODO code application logic here
    }
  
    
}
