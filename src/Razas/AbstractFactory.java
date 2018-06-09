/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author Roberto
 */
public interface AbstractFactory {
    Usa getUsa(int algo);
    Rusia getRusia(int algo);
    Alemania getAlemania(int algo);
}
