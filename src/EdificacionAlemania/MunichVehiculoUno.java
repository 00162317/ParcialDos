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
public class MunichVehiculoUno implements AlemaniaRaza {
  public static EdificioVehiculo vehiculos = new EdificioVehiculo();
    @Override
    public void crearEdificacionVehiculo() {
         vehiculos.setNombre(" -- Guardar Vehiculos --");
        vehiculos.setNombre("Munich");
        vehiculos.setVida(500);
        vehiculos.setRaza("Alemania");
        vehiculos.setTiempo(0);
        vehiculos.setTipo("Tanque");
        vehiculos.setValor1(5000, 1);//recurso y valor
        vehiculos.setValor2(5000, 1);
        vehiculos.setTiempo(3);
    }
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
    
}
