/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Interface.*;
/**
 *
 * @author Roberto
 */
public class RazaBuilder{
    private Datos datosUno;
    public RazaBuilder(Datos datosDos){
        this.datosUno=datosDos;
    }
    public void elaborarRaza(){
        this.datosUno.crearRaza();
        this.datosUno.crearCentroMando();
    }
    public Raza getRaza(){
        return this.datosUno.getRaza();
    }
}
