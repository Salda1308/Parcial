/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosDePago;

/**
 *
 * @author estudiantes
 */

public class NoAlerta extends Alerta{
    

    String desc=" desactivada";

    public NoAlerta() {
    }

  
    
    @Override
    
    public void modo() {
        
      System.out.println(this.getPromo() + " " + desc);
    
} 

    public String getPromo() {
        return modoNoti;
    }
    
}