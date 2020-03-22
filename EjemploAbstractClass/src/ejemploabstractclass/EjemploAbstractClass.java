/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploabstractclass;

import ejemploabstractclass.clases.Ave;
import ejemploabstractclass.clases.Perro;

/**
 *
 * @author Usuario
 */
public class EjemploAbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p = new Perro();
        p.comer();
        p.moverse();
        
        Ave a = new Ave();
        a.comer();
        a.moverse();
    }
    
}
