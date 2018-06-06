/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionUSA;

/**
 *
 * @author Roberto
 */
public class GoldenStateWorker implements Datos {
   private Edificacion unaited;
    public static GoldenStateWorker unaitedDos;
    private int vida= 500;
    public static GoldenStateWorker getInstance(){
        if(unaitedDos==null){
            unaitedDos = new GoldenStateWorker();
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
        unaited.setNombre("Golden State");
    }

    @Override
    public void darVida() {
        GoldenStateWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
         unaited.setRecursos(1, 1);//1 billete y 1 rupia
    }

    @Override
    public void tomarElementos() {
         unaited.setElementos("Guardar Billetes");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.unaited;
    }
    
}
