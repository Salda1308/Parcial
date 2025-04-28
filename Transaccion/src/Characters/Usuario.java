/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Characters;
import MetodosDePago.Notificacion;

/**
 *
 * @author estudiantes
 */
public abstract class Usuario {
    Notificacion notifiacionBehavior;
    
    public Usuario(){}
    public abstract void display();
    
    public void modoUsuario(){
    notifiacionBehavior.modo();
    }
    
    public void setUsuarioBehavior(Notificacion sb) {
        notifiacionBehavior = sb;
    }
}
