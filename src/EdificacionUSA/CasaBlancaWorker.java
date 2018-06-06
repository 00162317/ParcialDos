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
public class CasaBlancaWorker implements Datos {
private Edificacion unaited;
    public static CasaBlancaWorker unaitedDos;
    private int vida= 700;
    public static CasaBlancaWorker getInstance(){
        if(unaitedDos==null){
            unaitedDos = new CasaBlancaWorker();
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
        unaited.setNombre("Casa Blanca");
    }

    @Override
    public void darVida() {
        CasaBlancaWorker variable = getInstance();
        this.setVida(variable.getVida());
    }

    @Override
    public void obtenerDineroRecursos() {
        unaited.setRecursos(1, 1);//1 billete y 1 moneda
    }

    @Override
    public void tomarElementos() {
        unaited.setElementos("Trailer Furgon");
    }

    @Override
    public Edificacion getEdificacion() {
        return this.unaited;
    }
    
}
