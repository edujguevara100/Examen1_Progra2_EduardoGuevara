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
public class Objetos {
    private Color color;
    private String descripcion;
    private String marca;
    private int tam;
    private int calidad;
    private float precio;
    private Personas dueño;

    public Objetos() {
    }

    public Objetos(Color color, String descripcion, String marca, int tam, int calidad, float precio, Personas dueño) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tam = tam;
        this.calidad = calidad;
        this.precio = precio;
        this.dueño = dueño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Personas getDueño() {
        return dueño;
    }

    public void setDueño(Personas dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Objetos{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", tam=" + tam + ", calidad=" + calidad + ", precio=" + precio + ", due\u00f1o=" + dueño + '}';
    }
    
}
