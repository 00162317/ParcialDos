/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertohernandezworld;

import EdificacionAlemania.BembergWorker;
import EdificacionAlemania.FactoryAlemania;
import Razas.Edificio;

/**
 *
 * @author Roberto
 */
public class RobertoHernandezWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FactoryAlemania variable = new FactoryAlemania();
        variable.getAlemania("Bemberg").crearEdificacion();
        Edificio edificio = BembergWorker.getInstance();
        System.out.println("El nombre de la edificacion: "+edificio.getNombre());
        System.out.println("La vida de la edificacion es: "+edificio.getVida());
    }
    
}
