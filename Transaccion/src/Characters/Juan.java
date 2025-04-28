/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Characters;
import MetodosDePago.Alerta;
import MetodosDePago.*;

/**
 *
 * @author estudiantes
 */
public class Juan extends Usuario {
    public Juan(){
    notifiacionBehavior = new TransInst();
    }
    @Override
    public void display(){
    System.out.println("Soy Juan");
    }
}
