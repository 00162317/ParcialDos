/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesAlemania;

import static EdificacionesAlemania.MunichWorker.getInstance;

/**
 *
 * @author Roberto
 */
public class HamburgoWorker implements Datos{
     private Edificacion germani;
    public static HamburgoWorker germaniDos;
    private int vida = 550;
    public static HamburgoWorker getInstance(){
        if(germaniDos==null){
            germaniDos = new HamburgoWorker();
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
       germani.setNombre("Hamburgo");
    }

    @Override
    public void darVida() {
        HamburgoWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        germani.setRecursos(1, 1);//1 diamante y 1 gema
    }

    @Override
    public void tomarElementos() {
        germani.setElementos("Guardar Bus");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.germani;
    }
    
}
