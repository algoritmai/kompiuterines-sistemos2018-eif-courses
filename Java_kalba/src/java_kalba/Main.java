/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_kalba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Marius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int skaicius = 10;
        float su_kableliu = 1.22222f;
        double didesnis_su_kableliu = 23.5;
        char simbolis = '$';
        int sk = '/';
        
        int a,b = 0,c;
        String s = "Labas";
        
        double rez = Math.sin(3.55) / 2 + 52 + Math.cos(55);
        
        System.out.println(rez);
        
        sk = 50;
        //System.out.println((int)simbolis);
        s = "iso"+sk;
        
        String prefix ="viso";
        
        
        
        int masyvas[] = {10, 20, 30, 45};
        int arr[] = new int[20];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)System.currentTimeMillis();
          //  System.out.println(arr[i]);
        }
               
        
        
        
        if (s.startsWith(prefix)) {
          //  System.out.println("VALIO!!!!");
        }
        else{
          //  System.out.println("NEATITINKA  PREFIX:"+prefix);
        }
        
     
        for (int i = 97; i < 122; i++) {
            
           // System.out.print((char)i+""+(char)32);
        }
        
        List<String> d = new ArrayList<>();
        d.add("Labas");
        
        int aa = 10;
        //Trikampis trikampis1 = new Trikampis(50,10,10);
       // trikampis1.setA(999);
        
     //  int h =  trikampis1.getA() - 333;
        //System.out.println("GETA REZULTAtAS:"+h); 
     
       // System.out.println(""+trikampis1);
        //JOptionPane.showMessageDialog(null, ""+trikampis1);
        JFrame j = new JFrame();
        JTextField jtf = new JTextField("77777");
        j.add(jtf);
        j.pack();
                
        j.setVisible(true);
        
        List<Trikampis> trikampiai = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            
        trikampiai.add(new Trikampis(9, 10, 50, new Koordinate(40, 20)));
                
                
//                new Trikampis(Integer.parseInt(jtf.getText()), 
//                new Random().nextInt(90000), 
//                new Random().nextInt(5000), 
//                new Koordinate(10, 20);
      
       //trikampis2.setA(999);
        }
        for (Trikampis elem : trikampiai) {
            System.out.println(""+elem);
        }
        
        ///trikampis2.krastiniu_perimetras();
        
        
        // TODO code application logic here
    }
    
}
