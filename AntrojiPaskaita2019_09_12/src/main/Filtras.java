/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Comparator;

/**
 *
 * @author Marius
 */
public class Filtras {
    
    /**
     *
     */
    public static final  Comparator<Deze> FILTRAS_PAGAL_SVORI = (Deze o1, Deze o2) -> o2.getSvoris() - o1.getSvoris() //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      ;
        
        public static final Comparator<Deze> FILTRAS_PAGAL_PAVADINIMA = new Comparator<Deze>() {
            @Override
            public int compare(Deze o1, Deze o2) {
                return o2.getPav().compareTo(o1.getPav());
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
         public static final Comparator<Deze> FILTRAS_PAGAL_PAVADINIMA_IR_SVORI = new Comparator<Deze>() {
            @Override
            public int compare(Deze o1, Deze o2) {
                
                int flag = o1.getSvoris() - o2.getSvoris();
                if(flag == 0){
                    flag = o1.getPav().compareTo(o2.getPav());
                }
                return flag;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    
}
