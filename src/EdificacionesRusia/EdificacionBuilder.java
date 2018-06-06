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
public class EdificacionBuilder {
    private Datos datos;
    public EdificacionBuilder(Datos datosDos){
        this.datos=datosDos;
    }
    public void elaborarEdificacion(){
        datos.darVida();
        datos.crearEdificacion();
        datos.obtenerDineroRecursos();
        datos.tomarElementos();
    }
    public Edificacion getEdificacion(){
        return this.datos.getEdificacion();
    }
}
