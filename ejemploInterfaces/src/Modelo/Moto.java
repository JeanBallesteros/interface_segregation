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
public class Moto extends Vehiculo implements IControlVelocidad, IControlLuces{

    public Moto(int modelo, String placa, String marca, String color) {
        super(modelo, placa, marca, color);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }

    @Override
    public void meterCambio(int cambio) {
        System.out.println("Metiendo cambio...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando...");
    }

    @Override
    public void encenderLuces() {
        System.out.println("Encendiendo luces...");
    }

    @Override
    public void prenderDireccionalIzq() {
        System.out.println("Direccional izquierda activa...");
    }

    @Override
    public void prenderDireccionalDer() {
        System.out.println("Direccional derecha activa...");
    }

    @Override
    public void apagarDireccional() {
        System.out.println("Direccionales apagadas...");
    }

    @Override
    public void activarLucesAltas() {
        System.out.println("Luces altas activadas...");
    }

    @Override
    public void activarLucesBajas() {
        System.out.println("Luces bajas activadas...");
    }

    @Override
    public void apagarLuces() {
        System.out.println("Apagando luces...");
    }
    
}
