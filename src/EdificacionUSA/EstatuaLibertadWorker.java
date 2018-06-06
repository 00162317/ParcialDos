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
public class EstatuaLibertadWorker implements Datos {
    private Edificacion unaited;
    public static EstatuaLibertadWorker unaitedDos;
    private int vida= 750;
    public static EstatuaLibertadWorker getInstance(){
        if(unaitedDos==null){
            unaitedDos = new EstatuaLibertadWorker();
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
        unaited.setNombre("Estatua Libertad");
    }

    @Override
    public void darVida() {
        EstatuaLibertadWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        unaited.setRecursos(1, 1);//1 billete y 1 billete
    }

    @Override
    public void tomarElementos() {
        unaited.setElementos("Guardar Motos");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.unaited;
    }
    
}
