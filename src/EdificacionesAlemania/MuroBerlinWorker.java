/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesAlemania;

/**
 *
 * @author Roberto
 */
public class MuroBerlinWorker implements Datos{
    private Edificacion germani;
    public static MuroBerlinWorker germaniDos;
    private int vida = 800;
    public static MuroBerlinWorker getInstance(){
        if(germaniDos==null){
            germaniDos = new MuroBerlinWorker();
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
        germani.setNombre("Muro de Berlin");
    }

    @Override
    public void darVida() {
        MuroBerlinWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        germani.setRecursos(1, 1);//1 diamante y 1 diamante
    }

    @Override
    public void tomarElementos() {
        germani.setElementos("Centro de mando");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.germani;
    }
    
}
