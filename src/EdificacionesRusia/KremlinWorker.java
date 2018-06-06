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
public class KremlinWorker implements Datos{
    private Edificacion russian;
    public static KremlinWorker russianDos;
    private int vida = 650;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    //SINGLETON
    public static KremlinWorker getInstance(){
        if(russianDos==null){
            russianDos = new KremlinWorker();
        }
        return russianDos;
    }
    @Override
    public void crearEdificacion() {
        russian.setNombreEdificacion("Kremlin");
    }

    @Override
    public void darVida() {
        KremlinWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        russian.setRecursos(1, 1);//1 oro y 1 bronce
    }

    @Override
    public void tomarElementos() {
        russian.setElementos("Guardar Milicia");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.russian;
    }
}
