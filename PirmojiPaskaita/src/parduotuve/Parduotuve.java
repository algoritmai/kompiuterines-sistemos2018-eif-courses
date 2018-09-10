/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parduotuve;

import pirmojipaskaita.Pelnas;

/**
 *
 * @author Marius
 */
public abstract class Parduotuve implements Pelnas{
    private String pavadinimas;
    private int pelnas;
    
    void info(){
        System.out.println("Updating!!");
    }
   
    
    
}
