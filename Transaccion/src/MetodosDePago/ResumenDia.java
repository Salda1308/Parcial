/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosDePago;

/**
 *
 * @author estudiantes
 */

public class ResumenDia extends Transacciones{
    

    String resu=" de Resumen diario";

    public ResumenDia() {
    }

  
    
    @Override
    
    public void modo() {
        
      System.out.println(this.getNoti() + " " + resu);
    
} 

    public String getNoti() {
        return modoNoti;
    }
    
}