/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesAlemania;

import static EdificacionesAlemania.BambergWorker.getInstance;

/**
 *
 * @author Roberto
 */
public class MunichWorker implements Datos{
        private Edificacion germani;
    public static MunichWorker germaniDos;
    private int vida = 550;
    public static MunichWorker getInstance(){
        if(germaniDos==null){
            germaniDos = new MunichWorker();
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
        germani.setNombre("Munich");
    }

    @Override
    public void darVida() {
        MunichWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        germani.setRecursos(1, 1);//1 de diamante y 1 de diamante
    }

    @Override
    public void tomarElementos() {
        germani.setElementos("Guardar Tanque");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.germani;
    }
}
