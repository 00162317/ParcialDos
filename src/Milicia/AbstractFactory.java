/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author Roberto
 */
public interface AbstractFactory {
    AlemaniaMilicia getAlemaniaMilicia(int algo);
    RusiaMilicia getRusiaMilicia(int algo);
    UsaMilicia getUsaMilicia(int algo);
}
