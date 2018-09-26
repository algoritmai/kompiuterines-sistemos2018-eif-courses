/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotacijos;

import java.lang.reflect.Method;
import java.util.List;
import javax.swing.JOptionPane;
import static sun.util.calendar.CalendarUtils.mod;

/**
 *
 * @author Marius
 * @version Versija %I% ir %G%
 */
public class Anotacijos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
       
        //Anotacijos
        System.out.println(new Anotacijos());
           
       
        
        Method methods[] = Algoritmas.class.getMethods();
        
        for (Method method : methods) {
            if(method.isAnnotationPresent(Developer.class)){
            
                Developer dev = method.getAnnotation(Developer.class);
                System.out.println("Vardas:"+dev.name()+" tasks:"+ dev.tasks());
            }
        }
        
        
        // TODO code application logic here
        
        
    }
    
    /**
     * 
     * @param message pasisveikinimo zinute
     * {@link anotacijos.Developer} - Anotacija 
     * <h1>Title</h1>
     */
    public static void message(String message) {
        JOptionPane.showMessageDialog(null, "Hello"+message);
    }
    /**
     * 
     * @return grazina sveika skaiciu
     * @throws NumberFormatException
     * @deprecated Atgyveno perkeleme i cloud naudosime kita metoda <b>sk()</b>
     */
    @Deprecated
    static int skaicius() throws NumberFormatException{
        return 0;
    }

    @Override
    public String toString() {
        return "Anotacijos{" + '}';
    }
    
    
    
}
