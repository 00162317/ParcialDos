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
public class KremlinMilicia implements RusiaRaza{
    EdificioEntrenar edificio = new EdificioEntrenar();
    @Override
    public void crearEdificacionRecursos() {
        
    }

    @Override
    public void crearEdificacionEntrenamiento() {
        edificio.setNombre("Kremlin");
        edificio.setRaza("Rusia"); 
        edificio.setTiempo(2);
        edificio.setVida(650);
        edificio.setCosto1(2, 200);
        edificio.setCosto2(3, 300);
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

    @Override
    public void crearEdificacionVehiculo() {
        
    }
    
}

