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
public class JetHydraWorker implements RusiaVehiculos{
    public static JetHydra vehiculo = new JetHydra();
    public static JetHydra getInstance(){
        return vehiculo;
    }
    @Override
    public void crearVehiculo() {
        vehiculo.setNombre("Jet Hydra");
        vehiculo.setVida(25);
        vehiculo.setAtaque(100);
        vehiculo.setPrecio(1, 1);//Oro y oro
        vehiculo.setTiempoHacer(0);
        vehiculo.setTiempoLlegada(0);
    }

    @Override
    public Camioneta getCamioneta() {
        return null;
    }

    @Override
    public JetHydra getJetHydra() {
        return vehiculo;
    }
    
}