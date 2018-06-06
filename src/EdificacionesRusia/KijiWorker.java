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
public class KijiWorker implements Datos{
    private Edificacion russian;
    public static KijiWorker russianDos;
    private int vida = 500;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public static KijiWorker getInstance(){
        if(russianDos==null){
            russianDos = new KijiWorker();
        }
        return russianDos;
    }
    @Override
    public void crearEdificacion() {
        russian.setNombreEdificacion("Kiji");
    }

    @Override
    public void darVida() {
        KijiWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        russian.setRecursos(1, 1);//1 plata y 1 bronce
    }

    @Override
    public void tomarElementos() {
        russian.setElementos("Guardar Oro");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.russian;
        
    }
    
}
