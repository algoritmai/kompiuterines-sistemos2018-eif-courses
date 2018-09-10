/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirmojipaskaita;

import java.util.ArrayList;
import java.util.List;
import prekinis.zenklas.Maxima;
import parduotuve.*;

/**
 *
 * @author Marius
 */


class ProcesasBeInterfeiso extends Thread{

    @Override
    public void run() {
        System.out.println("Procesas Be Interfeiso paleistas");
        //super.run(); //To change body of generated methods, choose Tools | Templates.
    }
 
}

class Procesas extends Parduotuve implements Runnable{

    @Override
    public void skaiciuotiMenesiniPelna() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        
        System.out.println("Procesas su Interfeisu");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}



public class PirmojiPaskaita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ProcesasBeInterfeiso procesasBeInterfeiso = new ProcesasBeInterfeiso();
        
        //procesasBeInterfeiso.run();
        procesasBeInterfeiso.start();
        
        
        Thread t = new Thread(new Procesas());
        t.start();
        
        
        
        
        Maxima x = new Maxima("Maxima X", 10000);
        //x.skaiciuotiMenesiniPelna();
        
        List<Pelnas> pelnoStatistika = new ArrayList<>();
        pelnoStatistika.add(x);
        pelnoStatistika.add(new parduotuve.Maxima());
        pelnoStatistika.add(new Iki());
        pelnoStatistika.forEach((pelnas) -> {
           // pelnas.skaiciuotiMenesiniPelna();
        });
        
        Pelnas statistika[] = {x, 
            new Iki(),
            x,
            new parduotuve.Maxima()};
        
        for (int i = 0; i < statistika.length; i++) {
            
            //statistika[i].skaiciuotiMenesiniPelna();
            
        }
        
        
        
        
        
        
        
    }
    
}
