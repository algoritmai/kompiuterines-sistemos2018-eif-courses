
package gamta;

import java.util.ArrayList;
import java.util.List;
import stichija.Vejas;


public class Gamta {

    public static void main(String[] args) {
        Vejas v = new Vejas("Pietinis", 50);
        String pav = v.getPavadinimas();
        v.kryptis = "PV";
        int ruduo = Vejas.METU_LAIKAS_RUDUO;
       // System.out.println(""+pav);
      // v.oroTurioSkaiciuokle();
      
      List <String>sarasas = new ArrayList();
      
      sarasas.add("labas");
    
      
        for (Object elem : sarasas) {
            
            String temp = (String) elem;
        }
      
      
      
        
      
        
    }
    
    
    
}
