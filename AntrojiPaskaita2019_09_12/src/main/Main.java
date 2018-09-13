/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 *
 * @author Marius
 */
public class Main {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();
        Vector<String> vektorius = new Vector<>();
        List<String> a = new MyCollection();
        a = vektorius;
        
        List<Deze> dezes = new ArrayList<>();

        Deze d1 = new Deze("Auksie", 99);
        Deze d2 = new Deze("Balta", 44);
        Deze d3 = new Deze("AB", 22);
        Deze d4 = new Deze("AR", 22);
        Deze d5 = new Deze("Sidabrine", 11);
        Deze d6 = new Deze("Auksie", 99);
        
        
        dezes.add(d1);
        dezes.add(d2);
        dezes.add(d3);
        dezes.add(d4);
        dezes.add(d5);
        dezes.add(d6);
        
      
        
        //Collections.sort(dezes, filtras_pagal_svori);
        Collections.sort(dezes, Filtras.FILTRAS_PAGAL_PAVADINIMA_IR_SVORI);
        for (Deze deze : dezes) {
            //System.out.println(""+deze);
        }
        //dezes.sort(Filtras.FILTRAS_PAGAL_SVORI);
        
        List<Number> list = new ArrayList<>();
        list.add(1.2);
        //list.add(new Integer(10));
        //list.add("");
        
        for (Object object : list) {
           // String str = (String) object;
            //System.out.println(""+object);
        }
        Miestas<Number, String> miestas = new Miestas();
        miestas.setL(2.5f);
        miestas.spausdintiInfo();
        List<?> objektai = new ArrayList<>();
        //objektai.add(new Integer(55));
        
        
        
        
        
        
        
        
        
    }
    
}
class Deze implements Judesys{
    String pav;
    int svoris;

    public Deze(String pav, int svoris) {
        this.pav = pav;
        this.svoris = svoris;
    }

    public String getPav() {
        return pav;
    }

    public void setPav(String pav) {
        this.pav = pav;
    }

    public int getSvoris() {
        return svoris;
    }

    public void setSvoris(int svoris) {
        this.svoris = svoris;
    }

    @Override
    public String toString() {
        return "Deze{" + "pav=" + pav + ", svoris=" + svoris + '}';
    }

    @Override
    public void juda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}




class MyCollection implements List{

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}