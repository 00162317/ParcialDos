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
public class VolgogradoWorker implements Datos {
    private Edificacion russian;
    public static VolgogradoWorker russianDos;
    private int vida= 900;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public static VolgogradoWorker getInstance(){
        if(russianDos==null){
            russianDos = new VolgogradoWorker();
        }
        return russianDos;
    }
    @Override
    public void crearEdificacion() {
        russian.setNombreEdificacion("Volgogrado");
    }

    @Override
    public void darVida() {
        VolgogradoWorker variable = getInstance();
    }

    @Override
    public void obtenerDineroRecursos() {
        russian.setRecursos(1, 1);//1 oro y 1 oro
    }

    @Override
    public void tomarElementos() {
        russian.setElementos("Centro de mando");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.russian;
    }
    
}
