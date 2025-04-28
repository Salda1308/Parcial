/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosDePago;

/**
 *
 * @author estudiantes
 */

public class PromoSMS extends Promos{
    

    String sms="Por SMS";

    public PromoSMS() {
    }

  
    
    @Override
    
    public void modo() {
        
      System.out.println(this.getPromo() + " " + sms);
    
} 

    public String getPromo() {
        return promo;
    }
    
}