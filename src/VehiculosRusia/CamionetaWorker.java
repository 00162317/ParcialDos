/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosRusia;
import Vehiculos.JetHydra;
import Vehiculos.Camioneta;
import Vehiculos.RusiaVehiculos;
/**
 *
 * @author Roberto
 */
public class CamionetaWorker implements RusiaVehiculos{
    public static Camioneta vehiculo = new Camioneta();
    public static Camioneta getInstance(){
        return vehiculo;
    }
    @Override
    public void crearVehiculo() {
        vehiculo.setNombre("Camioneta");
        vehiculo.setVida(75);
        vehiculo.setAtaque(50);
        vehiculo.setPrecio(1, 1);//Oro y bronce
        vehiculo.setTiempoHacer(0);
        vehiculo.setTiempoLlegada(0);
    }

    @Override
    public Camioneta getCamioneta() {
        return this.vehiculo;
    }

    @Override
    public JetHydra getJetHydra() {
        return null;
    }
    
}
