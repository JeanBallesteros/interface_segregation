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
public class EjemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro1 = new Carro(2015, "GHT123", "Chevrolet", "Rojo");
        Moto moto1 = new Moto(2010, "UYT786", "Yamaha", "Azul");
        
        System.out.println("El carro con placas "+ carro1.getPlaca()+" está ");
        carro1.encender();
        carro1.encenderRadio();
        carro1.meterCD();
        carro1.acelerar();
        carro1.meterCambio(1);
        carro1.meterCambio(2);
        carro1.meterCambio(3);
        carro1.frenar();
        carro1.expulsarCD();
        carro1.apagarRadio();
        carro1.apagar();
        
        System.out.println("\n\n");
        
        System.out.println("La moto con placas "+ moto1.getPlaca()+" está ");
        moto1.encender();
        moto1.acelerar();
        moto1.meterCambio(1);
        moto1.meterCambio(2);
        moto1.meterCambio(3);
        moto1.frenar();
        moto1.apagar();
    }
    
}
