/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosUSA;

import Vehiculos.UsaVehiculos;
import Vehiculos.VehiculoBase;
        
        /**
 *
 * @author Roberto
 */
public class TrailerWorker implements UsaVehiculos{
    public static VehiculoBase vehiculo = new VehiculoBase();
    public static VehiculoBase getInstance(){
        return vehiculo;
    }
    @Override
    public void crearVehiculo() {
        vehiculo.setNombre("Trailer");
        vehiculo.setVida(25);
        vehiculo.setAtaque(60);
        vehiculo.setPrecio(1, 1);//Moneda y rupia
        vehiculo.setTiempoHacer(0);
        vehiculo.setTiempoLlegada(0);
        vehiculo.setTiempo(2);
    }

    @Override
    public VehiculoBase getMoto() {
        return null;
    }

    @Override
    public VehiculoBase getTrailer() {
        return this.vehiculo;
    }

    @Override
    public VehiculoBase getInstance2() {
        return null;
    }
    
}
