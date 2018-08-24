/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

/**
 *
 * @author MarkAnderson
 */
abstract class Abstact_MDEscribir {
    abstract String entintado(boolean tinta);
    
    abstract String regresar (boolean accion);
    
    abstract String atascado (boolean atascado);
    
    public String escribir(String escrito){
        System.out.println("se escribio" + escrito);
        return escrito;
    }
    
    public String color(String color){
        System.out.println("el color es" + color);
        return color;
    }
    
    
}
