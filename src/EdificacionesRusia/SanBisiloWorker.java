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
public class SanBisiloWorker implements Datos{
    private Edificacion russian;
    private int vida = 700;
    public static SanBisiloWorker russianDos;
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida=vida;
    }
    public static SanBisiloWorker getInstance(){
        if(russianDos==null){
            russianDos=new SanBisiloWorker();
        }
        return russianDos;
    }
    @Override
    public void crearEdificacion() {
        russian.setNombreEdificacion("San Bisilo");
    }

    @Override
    public void darVida() {
        SanBisiloWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        russian.setRecursos(1, 1); //1 de oro y 1 de oro
    }

    @Override
    public void tomarElementos() {
        russian.setElementos("Guardar Jets");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.russian;
    }
    
}
