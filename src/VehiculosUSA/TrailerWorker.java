/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosUSA;

import Vehiculos.UsaVehiculos;
import Vehiculos.Moto;
import Vehiculos.Trailer;

/**
 *
 * @author Roberto
 */
public class TrailerWorker implements UsaVehiculos{
    public static Trailer vehiculo = new Trailer();
    public static Trailer getInstance(){
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
    }

    @Override
    public Moto getMoto() {
        return null;
    }

    @Override
    public Trailer getTrailer() {
        return this.vehiculo;
    }
    
}
