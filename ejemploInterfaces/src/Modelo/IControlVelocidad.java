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
public interface IControlVelocidad {
    
    public abstract void encender();
    public abstract void acelerar();
    public abstract void frenar();
    public abstract void meterCambio(int cambio);
    public abstract void apagar();
    
}
