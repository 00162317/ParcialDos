/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionRusia;

import Razas.EdificioBase;
import Razas.EdificioCentroMando;
import Razas.EdificioEntrenar;
import Razas.EdificioVehiculo;
import Razas.RusiaRaza;


/**
 *
 * @author Roberto
 */
public class ElbrusRecursoTres implements RusiaRaza{
    public static EdificioBase edificio = new EdificioBase();
    @Override
    public void crearEdificacionRecursos() {
        System.out.println("-- Guardar bronce --");
        edificio.setNombre("Elbrus Recurso");
        edificio.setRaza("Rusia");
        edificio.setMontoActual(1000);
        edificio.setVida(700);
        edificio.setCapacidad(10000);
        edificio.setTiempo(3);
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

    @Override
    public void crearEdificacionVehiculo() {
        
    }
    
}

