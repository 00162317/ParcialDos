/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionUSA;

import static EdificacionUSA.GoldenStateWorker.getInstance;

/**
 *
 * @author Roberto
 */
public class TorresGemelasWorker implements Datos{
    private Edificacion unaited;
    public static TorresGemelasWorker unaitedDos;
    private int vida= 800;
    public static TorresGemelasWorker getInstance(){
        if(unaitedDos==null){
            unaitedDos = new TorresGemelasWorker();
        }
        return unaitedDos;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void crearEdificacion() {
        unaited.setNombre("Torres Gemelas");
    }

    @Override
    public void darVida() {
        TorresGemelasWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        unaited.setRecursos(1, 1);//1 billete y 1 plata
    }

    @Override
    public void tomarElementos() {
        unaited.setElementos("Centro de mando");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.unaited;
    }
    
}
