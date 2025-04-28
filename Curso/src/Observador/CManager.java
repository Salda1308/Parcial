/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observador;
/**
 *
 * @author Danie
 */
public class CManager implements Observer{
    String nameEstu="";

    public CManager(String name) {
        nameEstu=name;
    }
    
    
    @Override
    public void update(String cursoName, String descripcion) {
        System.out.println("---------------------------");
        System.out.println("---------Post En Instagram------------------");
        System.out.println("Hola " + nameEstu + " Soy Laura Molina de EDCO, este es nuestro post de Instagram");
        System.out.println("Tenemos un nuevo curso de " + cursoName);
        System.out.println("---------Post En TikTok------------------");
        System.out.println("Hola " + nameEstu + " Soy Laura Molina de EDCO, este es nuestro post de TikTok");
        System.out.println("Tenemos un nuevo curso de " + cursoName);
        System.out.println("---------Post En Facebook------------------");
        System.out.println("Hola " + nameEstu + " Soy Laura Molina de EDCO, este es nuestro post de Facebook");
        System.out.println("Tenemos un nuevo curso de " + cursoName);
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("");
    }
    
}
