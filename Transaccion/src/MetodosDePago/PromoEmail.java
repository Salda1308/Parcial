/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosDePago;

/**
 *
 * @author estudiantes
 */

public class PromoEmail extends Promos{
    

    String email="Por Email";

    public PromoEmail() {
    }

  
    
    @Override
    
    public void modo() {
        
      System.out.println(this.getPromo() + " " + email);
    
} 

    public String getPromo() {
        return promo;
    }
    
}