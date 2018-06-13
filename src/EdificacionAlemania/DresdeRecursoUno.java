/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionAlemania;


import Razas.AlemaniaRaza;
import Razas.EdificioBase;
import Razas.EdificioCentroMando;
import Razas.EdificioEntrenar;
import Razas.EdificioVehiculo;


/**
 *
 * @author Roberto
 */
public class DresdeRecursoUno implements AlemaniaRaza {
    public static EdificioBase edificio = new EdificioBase();
    @Override
    public void crearEdificacionVehiculo() {
        
    }
    @Override
    public void crearEdificacionRecursos() {
         System.out.println("-- Guardar gemas --");
        edificio.setNombre("Dresde Recurso");
        edificio.setRaza("Alemania");
        edificio.setMontoActual(1000);
        edificio.setVida(600);
        edificio.setCapacidad(5000);
    }

    @Override
    public void crearEdificacionEntrenamiento() {
        
    }

    @Override
    public void crearCentroMando() {
        
    }

    @Override
    public EdificioBase getInstance() {
        return this.edificio;
    }

    @Override
    public EdificioCentroMando getInstance2() {
        return null;
    }

    @Override
    public EdificioEntrenar getInstance3() {
        return null;
    }

    @Override
    public EdificioVehiculo getInstance4() {
        return null;
    }
    
}
