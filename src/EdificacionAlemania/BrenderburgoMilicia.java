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
public class BrenderburgoMilicia implements AlemaniaRaza {
    EdificioEntrenar edificio = new EdificioEntrenar();
    @Override
    public void crearEdificacionVehiculo() {
        
    }
    @Override
    public void crearEdificacionRecursos() {
        
    }

    @Override
    public void crearEdificacionEntrenamiento() {
        edificio.setNombre("Brenderburgo");
        edificio.setRaza("Alemania"); 
        edificio.setTiempo(2);
        edificio.setVida(600);
        edificio.setCosto1(2, 200);
        edificio.setCosto2(3, 300);
        edificio.setTiempo(2);
    }

    @Override
    public void crearCentroMando() {
        
    }

    @Override
    public EdificioBase getInstance() {
        return null;
    }

    @Override
    public EdificioCentroMando getInstance2() {
        return null;
    }

    @Override
    public EdificioEntrenar getInstance3() {
        return this.edificio;
    }

    @Override
    public EdificioVehiculo getInstance4() {
        return null;
    }
    
}
