/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prekinis.zenklas;

import pirmojipaskaita.Pelnas;

/**
 *
 * @author Marius
 */
public class Maxima implements Pelnas{
    private String pavadinimas;
    private int pelnas;

    public Maxima(String pavadinimas, int pelnas) {
        this.pavadinimas = pavadinimas;
        this.pelnas = pelnas;
    }
    public Maxima(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getPelnas() {
        return pelnas;
    }

    public void setPelnas(int pelnas) {
        this.pelnas = pelnas;
    }
    @Override
    public void skaiciuotiMenesiniPelna(){
        System.out.println((pelnas * 30 / 6));
    }
    
    @Override
    public String toString() {
        return "Maxima{" + "pavadinimas=" + pavadinimas + ", pelnas=" + pelnas + '}';
    }
    
    
    
    
    
    
    
    
}
