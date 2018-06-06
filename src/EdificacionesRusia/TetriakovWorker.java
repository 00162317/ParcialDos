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
public class TetriakovWorker implements Datos{
    private Edificacion russian;
    public static TetriakovWorker russianDos;
    private int vida = 650;
    public static TetriakovWorker getInstance(){
        if(russianDos==null){
            russianDos=new TetriakovWorker();
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
        russian.setNombreEdificacion("Tetrakiov");
    }

    @Override
    public void darVida() {
        TetriakovWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        russian.setRecursos(1, 1);//1 oro y 1 bronce
    }

    @Override
    public void tomarElementos() {
        russian.setElementos("Guardar Plata");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.russian;
    }
    
}
