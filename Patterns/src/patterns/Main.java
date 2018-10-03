/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marius
 */
// Design pattern Composite medžio struktūros realizacija
interface Component{
    void showPrice();
}
class Leaf implements Component{
    private String name;
    private int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public void showPrice() {
        System.out.println(name+" : "+price);
    }
}
class Composite implements Component{
    private String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c: components) {
            c.showPrice();
        }
    }
}
public class Main {
    public static void main(String[] args) {

        // Komponentai PC
        Component hdd = new Leaf("HDD", 120);
        Component mouse = new Leaf("Mouse", 15);
        Component monitor = new Leaf("Monitor",150);
        Component ram = new Leaf("Ram", 55);
        Component cpu = new Leaf("CPU", 220);
        Component printer = new Leaf("Printer", 180);

        // Komponentų klasifikavimas
        Composite peripherals = new Composite("Peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        // Į mb įdedam ram ir cpu
        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        // Išoriniai prietaisai
        peripherals.addComponent(mouse);
        peripherals.addComponent(monitor);
        peripherals.addComponent(printer);

        // Kompiuterio dėžė
        cabinet.addComponent(motherBoard);
        cabinet.addComponent(hdd);

       // Kompiuteris ir prijungtais išoriniais prietaisais
        computer.addComponent(peripherals);
        computer.addComponent(cabinet);
       
        computer.showPrice();
        
        //motherBoard.showPrice();
    }
}
