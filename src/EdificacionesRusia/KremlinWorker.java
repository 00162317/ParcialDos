/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesRusia;

import Razas.Bunker;
import Razas.CentroMando;
import Razas.Cochera;
import Razas.Edificio;
import Razas.Rusia;

/**
 *
 * @author Roberto
 */
//Guardar Milicia
public class KremlinWorker implements Rusia{
    public static Edificio edif = new Edificio();
    public Bunker bunk;//Aca guardo la milicia
    public static Edificio getInstance(){
        return edif;
    }
    @Override
    public void crearEdificacion() {
        edif.setNombre("Kremlin");
        edif.setVida(650);
        edif.setCantxTurno(3);
        edif.setCantidad(10);
        edif.setCapacidad(5000);
    }

    @Override
    public Edificio getEdificio() {
        return null;
    }

    @Override
    public Bunker getBunker() {
        return this.bunk;
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
