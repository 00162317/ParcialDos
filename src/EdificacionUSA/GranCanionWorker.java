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
public class GranCanionWorker implements Datos {
  private Edificacion unaited;
    public static GranCanionWorker unaitedDos;
    private int vida= 650;
    public static GranCanionWorker getInstance(){
        if(unaitedDos==null){
            unaitedDos = new GranCanionWorker();
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
        unaited.setNombre("Gran cañon");
    }

    @Override
    public void darVida() {
         GranCanionWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        unaited.setRecursos(1, 1);//1 billete y 1 moneda
    }

    @Override
    public void tomarElementos() {
        unaited.setElementos("Guardar Monedas");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.unaited;
    }
    
}
