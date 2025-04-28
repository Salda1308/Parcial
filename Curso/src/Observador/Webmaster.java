/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observador;
/**
 *
 * @author Danie
 */
public class Webmaster implements Observer{
    String nameEstu="";

    public Webmaster(String name) {
        nameEstu=name;
    }

    
    
    
    @Override
    public void update(String cursoName, String descripcion) {
        System.out.println("---------------------------");
        System.out.println("Hola " + nameEstu + " Soy Andrea Mahecha de EDCO, hoy tenemos nuevos cursos para ti");
        System.out.println("Nombre del curso: " + cursoName);
        System.out.println("En este curso aprenderas " + descripcion);
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("");
    }
    
}
