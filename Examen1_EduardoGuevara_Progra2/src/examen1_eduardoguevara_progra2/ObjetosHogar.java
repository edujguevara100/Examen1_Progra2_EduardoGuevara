/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_eduardoguevara_progra2;

import java.util.Date;

/**
 *
 * @author edujg
 */
public class ObjetosHogar extends Objetos {

    private Date lifetime;
    private String areacasa;
    private String instrucciones;
    private Date fechacompra;

    public ObjetosHogar() {
        super();
    }

    public ObjetosHogar(Date lifetime, String areacasa, String instrucciones, Date fechacompra) {
        this.lifetime = lifetime;
        this.areacasa = areacasa;
        this.instrucciones = instrucciones;
        this.fechacompra = fechacompra;
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }

    public String getAreacasa() {
        return areacasa;
    }

    public void setAreacasa(String areacasa) {
        this.areacasa = areacasa;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    @Override
    public String toString() {
        return "ObjetosHogar{" + "lifetime=" + lifetime + ", areacasa=" + areacasa + ", instrucciones=" + instrucciones + ", fechacompra=" + fechacompra + '}';
    }

}
