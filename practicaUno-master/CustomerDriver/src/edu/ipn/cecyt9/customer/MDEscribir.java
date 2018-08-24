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
public class MDEscribir {
    private int teclas;
    private String marca;
    private String tamanio;
    private String color;
    private int serie;

    public MDEscribir(int teclas, String marca, String tamanio, String color) {
        this.teclas = teclas;
        this.marca = marca;
        this.tamanio = tamanio;
        this.color = color;
        this.serie = serie;
    }

    public int getTeclas() {
        return teclas;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getColor() {
        return color;
    }

    public int getSerie() {
        return serie;
    }
    

    public void setTeclas(int teclas) {
        this.teclas = teclas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    
}

