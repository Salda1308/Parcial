/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observador;

/**
 *
 * @author Danie
 */
interface Subject {
    void registerOb(Observer Observer);
    void deleteOb(Observer Observer);
    void notifyOb();
}
