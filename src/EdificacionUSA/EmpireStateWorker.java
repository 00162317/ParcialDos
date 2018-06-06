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
public class EmpireStateWorker implements Datos{
    private Edificacion unaited;
    public static EmpireStateWorker unaitedDos;
    private int vida= 600;
    public static EmpireStateWorker getInstance(){
        if(unaitedDos==null){
            unaitedDos = new EmpireStateWorker();
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
        unaited.setNombre("Empire State");
    }

    @Override
    public void darVida() {
        EmpireStateWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        unaited.setRecursos(1, 1);//1 billete y 1 moneda
    }

    @Override
    public void tomarElementos() {
        unaited.setElementos("Guardar Milicia");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.unaited;
    }
    
}
