/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaRusia;

import Milicia.*;

/**
 *
 * @author Roberto
 */
public class PutinWorker implements RusiaMilicia{
    public static MiliciaBase especialista = new MiliciaBase();
    public static MiliciaBase getInstance(){
        return especialista;
    }
    @Override
    public void crearMilicia() {
        especialista.setNombre("Especialista Teniente Putin");
        especialista.setVida(75);
        especialista.setPrecio(1, 1);//oror y oro 
        especialista.setAtaque(125);
    }

    @Override
    public MiliciaBase getRevolucionarios() {
        return null;
    }

    @Override
    public MiliciaBase getTenientePutin() {
        return this.especialista;
    }
    
}
