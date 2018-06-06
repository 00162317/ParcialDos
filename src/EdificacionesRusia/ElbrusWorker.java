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
public class ElbrusWorker implements Datos{
    private Edificacion russian;
    public static ElbrusWorker russianDos;
    private int vida = 700 ;
    public static ElbrusWorker getInstance(){
        if(russianDos==null){
            russianDos=new ElbrusWorker();
        }
        return russianDos;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void crearEdificacion() {
        russian.setNombreEdificacion("Elbrus");
    }

    @Override
    public void darVida() {
        ElbrusWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        russian.setRecursos(1, 1);//1 oro y 1 plata
    }

    @Override
    public void tomarElementos() {
        russian.setElementos("Guardar Bronce");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.russian;
    }
    
}
