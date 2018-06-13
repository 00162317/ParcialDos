/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionAlemania;

import Razas.*;

/**
 *
 * @author Roberto
 */
public class FactoryAlemania implements AbstractFactoryRaza{

    @Override
    public UsaRaza getUsaRaza(int opcion) {
        return null;
    }

    @Override
    public RusiaRaza getRusiaRaza(int opcion) {
        return null;
    }

    @Override
    public AlemaniaRaza getAlemaniaRaza(int opcion) {
        /*
        1.Bemberg
        2.Brenderburgo
        3.Dresde
        4.Europa Park
        5.Hamburgo
        6.Munich
        7.Muro Berlin
        */
        switch(opcion){
            case 1:
                return new BemberRecursoTres();
            case 2:
                return new BrenderburgoMilicia();
            case 3:
                return new DresdeRecursoUno();
            case 4:
                return new EuropaParkRecursoDos();
            case 5:
                return new HamburgoVehiculoDos();
            case 6:
                return new MunichVehiculoUno();
            case 7:
                return new MuroBerlinCentroMando();
        }
        return null;
    }
    
}
