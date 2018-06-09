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
//Guardar carbon
public class BembergWorker implements Alemania{
    public static Edificio edif = new Edificio();//Instaciando
    public static Edificio getInstance(){
        return edif;
    }
    @Override
    public void crearEdificacion() {
        edif.setNombre("Bemberg");
        edif.setVida(700);
        edif.setCapacidad(10000);//Son los recursos, la onda de 5000 y 3000
        edif.setCantidad(10);//Cantidad de recursos
        edif.setCantxTurno(2);
    }

    @Override
    public Edificio getEdificio() {
        return null;
    }

    @Override
    public Bunker getBunker() {
        return null;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }

    @Override
    public Cochera getCochera() {
        return null;
    }
    
}
