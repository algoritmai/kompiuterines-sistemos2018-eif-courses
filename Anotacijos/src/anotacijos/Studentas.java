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
@Developer(name = "qq")
public class Studentas {
    private @Developer(name="")int id;
    private String vardas;

    @Developer(name = "Marius", id = 1210, tasks = {50, 32, 44})
    public Studentas(int id, String vardas) {
        this.id = id;
        this.vardas = vardas;
    }

    /**
     * <table border="1px solid black"><tr><td>Developer aprasymas</td><td>Developer </td></tr></table>
     * {@link anotacijos.Developer} - čia rasite developer aprasyma
     * @param id tai yra studento id nr suteiktas kolegijoje
     */
    static void info(int id){
    
    }
    /**
     * 
     * @return konstanta id eif
     */
    int getId(){
        return 10;
    }
    
    
    
    @Developer(name="Paulius")
    @Override
    public String toString() {
        return "Studentas{" + "vardas=" + vardas + '}';
    }
    
    
    
    
    
}
