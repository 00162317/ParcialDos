/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesAlemania;

import static EdificacionesAlemania.DresdeWorker.getInstance;

/**
 *
 * @author Roberto
 */
public class BambergWorker implements Datos{
    private Edificacion germani;
    public static BambergWorker germaniDos;
    private int vida = 700;
    public static BambergWorker getInstance(){
        if(germaniDos==null){
            germaniDos = new BambergWorker();
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
        germani.setNombre("Bamberg");
    }

    @Override
    public void darVida() {
        BambergWorker  variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        germani.setRecursos(1, 1);//1 diamante y 1 gema
    }

    @Override
    public void tomarElementos() {
        germani.setElementos("Guardar Carbon");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.germani;
    }

}
