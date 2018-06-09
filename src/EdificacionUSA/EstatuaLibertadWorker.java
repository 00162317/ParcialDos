/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionUSA;

import Razas.Bunker;
import Razas.CentroMando;
import Razas.Cochera;
import Razas.Edificio;
import Razas.Usa;

/**
 *
 * @author Roberto
 */
//Guardar Motos
public class EstatuaLibertadWorker implements Usa{
    public static Edificio edif = new Edificio();
    private Cochera carros;
    public static Edificio getInstance(){
        return edif;
    }
    @Override
    public void crearEdificacion() {
        edif.setNombre("Estatua Libertad ");
        edif.setVida(750);
        edif.setCantidad(10);//Cantidad de recursos
        edif.setCantxTurno(3);
        edif.setCapacidad(5000);//La onda de recursos
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
        return this.carros;
    }
    
}
