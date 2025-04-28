/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observador;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Danie
 */
public class EDCO implements Subject {
    
    public List<Observer> observador = new ArrayList<>();
    private String cursoName;
    private String descripcion;
    

    @Override
        public void registerOb(Observer Observer) {
        observador.add(Observer);
    }

    @Override
    public void deleteOb(Observer Observer) {
        observador.remove(Observer);
    }
    @Override
    public void notifyOb() {
        for (Observer obs : observador) {
            
            obs.update(cursoName, descripcion);
        }
    }

    public void setCurso(String cur, String desc) {
        this.cursoName= cur;
        this.descripcion=desc;
        
        notifyOb();
    }

    public List<Observer> getObservador() {
        return observador;
    }


}