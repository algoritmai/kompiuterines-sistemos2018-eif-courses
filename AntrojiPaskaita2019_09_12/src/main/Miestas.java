/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Marius
 * @param <LABAS>
 */

public class Miestas <LABAS extends Number, O>{
    
    LABAS l;
    O o;
   
    
    public Miestas() {
    }

    
    
    public Miestas(LABAS l) {
        this.l = l;
    }

    public LABAS getL() {
        return l;
    }

    public void setL(LABAS l) {
        this.l = l;
    }
    
    void spausdintiInfo(){
        
        System.out.println("TIPAS:"+l.getClass().getSimpleName());
    }
    static <PASKAITA> String getPavadinimas(PASKAITA pas){
        return ""+pas.getClass().getSimpleName();
    }
    
    
}
