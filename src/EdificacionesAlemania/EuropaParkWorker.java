/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesAlemania;

import static EdificacionesAlemania.BrenderburgoWorker.getInstance;

/**
 *
 * @author Roberto
 */
public class EuropaParkWorker implements Datos{
     private Edificacion germani;
    public static BrenderburgoWorker germaniDos;
    private int vida = 600;
    public static BrenderburgoWorker getInstance(){
        if(germaniDos==null){
            germaniDos = new BrenderburgoWorker();
        }
        return germaniDos;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void crearEdificacion() {
        germani.setNombre("Europa Park");
    }

    @Override
    public void darVida() {
        BrenderburgoWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        germani.setRecursos(1, 1);//1 diamante y 1 gemas
    }

    @Override
    public void tomarElementos() {
        germani.setElementos("Guardar Diamantes");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.germani;
    }
}
