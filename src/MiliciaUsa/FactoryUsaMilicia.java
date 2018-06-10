/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaUsa;

import Milicia.*;


/**
 *
 * @author Roberto
 */
public class FactoryUsaMilicia implements AbstractFactory{

    @Override
    public AlemaniaMilicia getAlemaniaMilicia(int algo) {
        return null;
    }

    @Override
    public RusiaMilicia getRusiaMilicia(int algo) {
        return null;
    }
    /*
    1.FBI
    2.Donadl Trump
    */
    @Override
    public UsaMilicia getUsaMilicia(int algo) {
        switch(algo){
            case 1:
                return new FBIworker();
            case 2:
                return new DonadlTrumpWorker();
        }
        return null;
    }
    
}
