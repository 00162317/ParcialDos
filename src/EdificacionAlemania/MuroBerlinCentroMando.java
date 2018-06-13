/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionAlemania;

import Razas.*;

/**
 *
 * @author Roberto
 */
public class MuroBerlinCentroMando implements AlemaniaRaza{
    public static EdificioCentroMando edificio = new EdificioCentroMando();
    
    @Override
    public void crearEdificacionRecursos() {
        
    }

    @Override
    public void crearEdificacionEntrenamiento() {
        
    }

    @Override
    public void crearCentroMando() {
        edificio.setNombre("Centro de mando Muro Berlin");
        edificio.setVida(800);
        edificio.setCapacidad1(10000);
        edificio.setCapacidad2(5000);
        edificio.setCapacidad2(3000);
    }

    @Override
    public EdificioBase getInstance() {
        return null;
    }

    @Override
    public  EdificioCentroMando getInstance2() {
        return this.edificio;
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
