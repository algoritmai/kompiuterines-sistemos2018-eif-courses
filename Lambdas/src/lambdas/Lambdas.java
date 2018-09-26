/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Marius
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prailgintuvas p = new Prailgintuvas() {
            @Override
            public void info() {
                System.out.println("ilgis: 20m");
                System.out.println("Anonimine:"+this);
          }
        };
        p.info();
        
        Prailgintuvas prLambda = () -> System.out.println("");
        prLambda.info();
        
        CalcStringLenght calc = param -> param.length();
                
        System.out.println("Teksto ilgis:"+calc.countLenght("Hello"));
        
        
        Runnable rr = new Runnable() {
            @Override
            public void run() {
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        ;
        
        new Thread(() -> System.out.println("Kl")).start();
        
        Predikatas<String> predikatas = (pp)-> pp.contains("www");
        Predicate<String> originalas = (oo) -> oo.contains("www"); 
        
        
        if(predikatas.test("www.viko.lt")){
            System.out.println("Tekstas turi www raides");
        }
        
         List<String> list = new ArrayList<>();
         list.add("Valio");
         list.add("Valio");
         list.add("wow");
         list.add("wwo");
         list.forEach(System.out::println);
         
         
              
        
        // TODO code application logic here
    }
    
}
