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
public interface IControlLuces {
    public abstract void encenderLuces();
    public abstract void prenderDireccionalIzq();
    public abstract void prenderDireccionalDer();
    public abstract void apagarDireccional();
    public abstract void activarLucesAltas();
    public abstract void activarLucesBajas();
    public abstract void apagarLuces();
}
