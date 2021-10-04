/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author balle
 */
public class Vehiculo {
    
    private int modelo;
    private String placa;
    private String marca;
    private String color;

    public Vehiculo(int modelo, String placa, String marca, String color) {
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.color = color;
    }

    
    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
