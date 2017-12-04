/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author alan
 */
public class CustomListModel extends AbstractListModel{
    
    private ArrayList<Persona> lstPersona = new ArrayList<>();

    @Override
    public int getSize() {
        return lstPersona.size();
    }

    @Override
    public Object getElementAt(int index) {
        Persona p = lstPersona.get(index);
        return p.getNombre();
    }    
    
    public void addPersona(Persona p){
        lstPersona.add(p);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public void delPersona(int index){
        lstPersona.remove(index);
        this.fireIntervalRemoved(index, getSize(), getSize()+1);
    }
    
    public Persona getPersona(int index){
        return lstPersona.get(index);
    }
}
