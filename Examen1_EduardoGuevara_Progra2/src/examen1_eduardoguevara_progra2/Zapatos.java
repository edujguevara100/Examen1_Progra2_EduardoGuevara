/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_eduardoguevara_progra2;

import java.awt.Color;

/**
 *
 * @author edujg
 */
public class Zapatos extends Objetos {

    private String talla;
    private String tiposuela;
    private int confort;

    public Zapatos() {
        super();
    }

    public Zapatos(String talla, String tiposuela, int confort, Color color, String descripcion, String marca, int tam, int calidad, float precio, Personas dueño) {
        super(color, descripcion, marca, tam, calidad, precio, dueño);
        this.talla = talla;
        this.tiposuela = tiposuela;
        this.confort = confort;
    }

    

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTiposuela() {
        return tiposuela;
    }

    public void setTiposuela(String tiposuela) {
        this.tiposuela = tiposuela;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", tiposuela=" + tiposuela + ", confort=" + confort + '}';
    }

}
