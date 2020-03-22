/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploabstractclass.clases;

/**
 *
 * @author Usuario
 */
public abstract class Animal {

    private String nombre;
    
    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void comer(){
        System.out.println(nombre+" está comiendo."); 
    }
    
    public abstract void moverse();
}
