/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;
import MiliciaAlemania.*;
/**
 *
 * @author Roberto
 */
public class FactoryAlemaniaMilicia implements AbstractFactory{

    @Override
    public AlemaniaMilicia getAlemaniaMilicia(int algo) {
        switch(algo){
            case 1:
                return new BerlinesWorker();
            case 2:
                return new HitlerWorker();
        }
        return null;
    }

    @Override
    public RusiaMilicia getRusiaMilicia(int algo) {
        return null;
    }

    @Override
    public UsaMilicia getUsaMilicia(int algo) {
        return null;
    }
    
}
