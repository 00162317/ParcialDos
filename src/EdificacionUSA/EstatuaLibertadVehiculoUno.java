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
public class EstatuaLibertadVehiculoUno implements UsaRaza{
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
        vehiculos.setNombre("Estatua Libertad");
        vehiculos.setVida(750);
        vehiculos.setRaza("USA");
        vehiculos.setTiempo(0);
        vehiculos.setTipo("Moto");
        vehiculos.setValor1(5000, 1);//recurso y valor
        vehiculos.setValor2(3000, 1);
        vehiculos.setTiempo(1);
    }
    
}
