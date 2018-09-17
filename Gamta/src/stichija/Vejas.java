/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stichija;

import gamta.Gatve;

/**
 *
 * @author Marius
 */

enum MetuLaikas{RUDUO, ZIEMA, VASARA, PAVASARIS}
public class Vejas extends Oras{
    MetuLaikas metuLaikas;
    private String pavadinimas;
    int greitis;
    public String kryptis;
    public static final int METU_LAIKAS_VASARA=1;
    public static final int METU_LAIKAS_RUDUO=2; 

    public Vejas(String pavadinimas, int greitis, String kryptis) {
        this.pavadinimas = pavadinimas;
        this.greitis = greitis;
        this.kryptis = kryptis;
    }

    public Vejas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Vejas(String pavadinimas, int greitis) {
        this.pavadinimas = pavadinimas;
        this.greitis = greitis;
    }

    public String getPavadinimas() {
        return this.pavadinimas;
    }

    public int getGreitis() {
        return greitis;
    }

    public String getKryptis() {
        return kryptis;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setGreitis(int greitis) {
        this.greitis = greitis;
    }

    public void setKryptis(String kryptis) {
        this.kryptis = kryptis;
    }
    
    void pucia(){
        System.out.println("Vejas pucia!");
        
    }
    Gatve plotas(int n){
        return new Gatve("jasinskio g. vejas pucia tokiu plotu:"+n);
    }

    @Override
    public String toString() {
        return "Vejas{" + "pavadinimas=" + pavadinimas + ", greitis=" + greitis + ", kryptis=" + kryptis + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
