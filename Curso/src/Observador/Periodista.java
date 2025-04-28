/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observador;
/**
 *
 * @author Danie
 */
public class Periodista implements Observer{
    String nameEstu="";

    public Periodista(String name) {
        nameEstu=name;
    }
    
    
    @Override
    public void update(String cursoName, String descripcion) {
        System.out.println("---------------------------");
        System.out.println("Hola " + nameEstu + " Soy Luz Dary Varela de EDCO, Estas escuchando radio EDCO");
        System.out.println("El dia de hoy te vamos a contar que EDCO tiene las mejores ofertas para ti");
        System.out.println("Recuerda que aun tenemos el curso de " + cursoName);
        System.out.println("En este curos aprenderas sobre " + descripcion);
        System.out.println("No dejes pasar esta oportunidad.... TE ESPERAMOS...");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("");
    }
    
}
