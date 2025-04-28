/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso;
import Observador.*;
/**
 *
 * @author Danie
 */
public class Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EDCO newCurso = new EDCO();
        
        
        Webmaster estuJuan = new Webmaster("Juan");
        Periodista estuPaola = new Periodista("Paola");
        CManager estuOscar = new CManager("Oscar");
        
        newCurso.registerOb(estuJuan);
        newCurso.registerOb(estuPaola);
        newCurso.registerOb(estuOscar);
        
        
        newCurso.setCurso("Programacion oreintada a Objetos", "conceptualización y aplicación del paradigma orientado a objetos, enfatizando en los elementos conceptuales propios de este que permitan plantear y aplicar modelos bien formados utilizando un lenguaje de programación orientado a objetos.");
        System.out.println("");
        
        
    }
    
}