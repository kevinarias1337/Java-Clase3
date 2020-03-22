/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces.clases;

/**
 *
 * @author Usuario
 */
public class Persona extends Datos implements Cargos, Salario {
    public Persona(){
    
    }
    public void mostrarNombre(){
        System.out.println("El empleado se llama: "+this.getNombre());
    }
    
    // @ son anotaciones en Java
    @Override
    public void contratar() {
        System.out.println("Se contrata supervisor.");
    }
    
    // @ son anotaciones en Java
    @Override
    public void despedir() {
        System.out.println("Se le paga el 80% de liquidación.");
    }

    @Override
    public void pagarMinimo() {
        System.out.println("Se le pagará 900mil.");
    }
}
