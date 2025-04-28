/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosDePago;

/**
 *
 * @author estudiantes
 */

public class TransInst extends Transacciones{
    

    String sms="instantaneas";

    public TransInst() {
    }

  
    
    @Override
    
    public void modo() {
        
      System.out.println(this.getNoti() + " " + sms);
    
} 

    public String getNoti() {
        return modoNoti;
    }
    
}