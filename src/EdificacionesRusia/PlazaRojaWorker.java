/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesRusia;

/**
 *
 * @author Roberto
 */
public class PlazaRojaWorker implements Datos{
    private Edificacion russian;
    private static PlazaRojaWorker russianDos;
    private int vida = 600;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    //SINGLETON
    public static PlazaRojaWorker getInstance(){
        if(russianDos==null){
            russianDos= new PlazaRojaWorker();
        }
        return russianDos;
    }
    @Override
    public void crearEdificacion() {
        russian.setNombreEdificacion("Plaza Roja");
    }

    @Override
    public void darVida() {
        PlazaRojaWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        russian.setRecursos(1, 1);//1 oro y 1 plata
    }

    @Override
    public void tomarElementos() {
        russian.setElementos("Guardar Camionetas");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.russian;
    }
    
}
