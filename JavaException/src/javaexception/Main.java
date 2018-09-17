/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexception;

import java.util.logging.Level;
import java.util.logging.Logger;
import javaexception.exceptions.BlogasIvedimasRuntimeException;
import javaexception.exceptions.LimitedInputException;
import javax.naming.LimitExceededException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            arAtitinkaFormata("15");
            
            // TODO code application logic here
        } catch (LimitedInputException | ArrayIndexOutOfBoundsException ex) {
            //JOptionPane.showMessageDialog(null, "Formatas neteisingas");
            ex.printStackTrace();
        }
        
      
        
        //System.out.println(""+s);
        //int sk = 10 / 0;
        
       // iveskiteSkaiciu(0);
        
        //arAtitinkaFormata("");
        
        
    }
    static void arAtitinkaFormata(String data) throws LimitedInputException{
        
        int temp = Integer.parseInt(data);
        
        if(temp <= 20 || temp >=30){
            throw new LimitedInputException("Pasirinktas intervalas netinkamas reiksme < 30 ir > 20. ");
        }
        
    }
    static void iveskiteSkaiciu(int sk) throws BlogasIvedimasRuntimeException{
    
        if(sk == 0){
           throw new BlogasIvedimasRuntimeException("Negali buti 0");
        }
    
    }
    
}
class Stalas{
    
}
