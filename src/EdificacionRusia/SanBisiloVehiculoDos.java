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
public class SanBisiloVehiculoDos implements RusiaRaza{
public static EdificioVehiculo vehiculos = new EdificioVehiculo();
    @Override
    public void crearEdificacionRecursos() {
        
    }

    @Override
    public void crearEdificacionEntrenamiento() {
        
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
       return null;
    }

    @Override
    public EdificioVehiculo getInstance4() {
       return this.vehiculos;
    }

    @Override
    public void crearEdificacionVehiculo() {
        vehiculos.setNombre(" -- Guardar Vehiculos --");
        vehiculos.setNombre("San Bisilo");
        vehiculos.setVida(700);
        vehiculos.setRaza("Rusia");
        vehiculos.setTiempo(0);
        vehiculos.setTipo("Jets");
        vehiculos.setValor1(10000, 1);//recurso y valor
        vehiculos.setValor2(5000, 1);
    }
    
}

