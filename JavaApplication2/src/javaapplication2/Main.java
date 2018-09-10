/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Pastatas> pastatai = new ArrayList<>();
        
        Universitetas vilniaus_universitetas = new Universitetas("Naugarduko g.19");
        Universitetas vilniaus_kolegija = new Universitetas("Jasinskio g. 15");
        Degaline statoil_degaline = new Degaline();
        Vaistine gintarine_vaistine = new Vaistine();
        
        pastatai.add(vilniaus_kolegija);
        pastatai.add(vilniaus_universitetas);
        pastatai.add(statoil_degaline);
        pastatai.add(gintarine_vaistine);
        
        // JDK 1.8+
        pastatai.forEach((pastatas)-> 
                System.out.println(""+pastatas.adresas()));
        
        // JDK 1.7+
        for (Pastatas pastatas : pastatai) {
            System.out.println(""+pastatas.adresas());
        }
        
        
    }
    
}
interface Pastatas{
    String adresas();
}


class Universitetas implements Pastatas{

    private final String adresas;

    public Universitetas(String adresas) {
        this.adresas = adresas;
    }
    
    @Override
    public String adresas() {
        return adresas;   
    }
}
class Vaistine implements Pastatas{

    @Override
    public String adresas() {
        return "Antakalnio g. 5-20";
    }
    
}
class Degaline implements Pastatas{

    @Override
    public String adresas() {
        return "Kauno g. 52";
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

