/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_eduardoguevara_progra2;

import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class Familiares extends Personas {

    private String trabajo;
    private float altura;
    private float peso;
    private ArrayList<Objetos> pertenencias = new ArrayList();
    private ArrayList<Mensajes> msgs = new ArrayList();
    public Familiares() {
        super();
    }

    public Familiares(String trabajo, float altura, float peso, String nombre, int edad, int id, String sexo, String estadoc, String user, String contra, String rol) {
        super(nombre, edad, id, sexo, estadoc, user, contra, rol);
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    

    public ArrayList<Mensajes> getMsgs() {
        return msgs;
    }

    public void setMsgs(ArrayList<Mensajes> msgs) {
        this.msgs = msgs;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public ArrayList<Objetos> getPertenencias() {
        return pertenencias;
    }

    public void setPertenencias(ArrayList<Objetos> pertenencias) {
        this.pertenencias = pertenencias;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}
