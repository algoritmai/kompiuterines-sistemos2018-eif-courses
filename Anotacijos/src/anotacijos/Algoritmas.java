/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotacijos;

/**
 *
 * @author Marius
 */


public class Algoritmas {
  
    private String name;

    public Algoritmas(String name) {
        this.name = name;
    }
    @Developer(name = "Marius", id=7777, tasks={10, 20, 32})
    public void spaustinti(){
    
    }
    @Developer(name = "Paulius", id=7777, tasks={10, 20, 32})
    @Override
    public String toString() {
        return "Algoritmas{" + "name=" + name + '}';
    }
    
    
    
}
