/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosDePago;

/**
 *
 * @author estudiantes
 */

public class AlertaCaida extends Alerta{
    

    String umbral=" de saldo que cae por debajo de un cierto umbral";

    public AlertaCaida() {
    }

  
    
    @Override
    
    public void modo() {
        
      System.out.println(this.getPromo() + " " + umbral);
    
} 

    public String getPromo() {
        return modoNoti;
    }
    
}