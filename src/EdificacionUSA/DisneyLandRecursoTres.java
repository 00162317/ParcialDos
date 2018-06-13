/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionUSA;


import Razas.EdificioBase;
import Razas.EdificioCentroMando;
import Razas.EdificioEntrenar;
import Razas.EdificioVehiculo;
import Razas.UsaRaza;

/**
 *
 * @author Roberto
 */
public class DisneyLandRecursoTres implements UsaRaza{
    public static EdificioBase edificio = new EdificioBase();
    @Override
    public void crearEdificacionRecursos() {
        System.out.println("-- Guardar bronce --");
        edificio.setNombre("DisneyLand");
        edificio.setRaza("USA");
        edificio.setMontoActual(2000);
        edificio.setVida(700);
        edificio.setCapacidad(10000);
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

