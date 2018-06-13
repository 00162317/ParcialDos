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
public interface AbstractFactoryRaza {
    public UsaRaza getUsaRaza(int opcion);
    public RusiaRaza getRusiaRaza(int opcion);
    public AlemaniaRaza getAlemaniaRaza(int opcion);
}