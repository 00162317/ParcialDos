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
public class DisneyLandWorker implements Datos{
   private Edificacion unaited;
    public static DisneyLandWorker unaitedDos;
    private int vida= 700;
    public static DisneyLandWorker getInstance(){
        if(unaitedDos==null){
            unaitedDos = new DisneyLandWorker();
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
        unaited.setNombre("DisneyLand");
    }

    @Override
    public void darVida() {
        DisneyLandWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        unaited.setRecursos(1, 1);//1 billete y 1 rupia
    }

    @Override
    public void tomarElementos() {
        unaited.setElementos("Guardar Bronce");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.unaited;
    }
    
}
