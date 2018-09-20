/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_kalba;

/**
 *
 * @author Marius
 */
public class Trikampis {
    
    private int a =10, b, c;
    private String pav;
    private Koordinate koordinate;



    public Trikampis(int a, int b, int c, Koordinate koordinate) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.koordinate = koordinate;
    }
    
    public void krastiniu_perimetras(){
        System.out.println("PERIMETRAS:"+(a+b+c));
    }
    
    

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getPav() {
        return pav;
    }

    public void setPav(String pav) {
        this.pav = pav;
    }


    

    public void setA(int skaicius){
        this.a = skaicius;
    }
    public int getA(){
        return a;
    }

    @Override
    public String toString() {
        return "Trikampis{" + "a=" + a + ", b=" + b + ", c=" + c + ", pav=" + pav + ", koordinate=" + koordinate + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
