/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaRusia;

import Milicia.*;
/**
 *
 * @author Roberto
 */
public class FactoryRusiaMilicia implements AbstractFactory{

    @Override
    public AlemaniaMilicia getAlemaniaMilicia(int algo) {
        return null;
    }
    /*
    1.Revolucionarios
    2.Putin
    */
    @Override
    public RusiaMilicia getRusiaMilicia(int algo) {
        switch(algo){
            case 1:
                return new RevolucionariosWorker();
            case 2:
                return new PutinWorker();
        }
        return null;
    }

    @Override
    public UsaMilicia getUsaMilicia(int algo) {
        return null;
    }
    
}
