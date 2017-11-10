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
public class Personas {

    private String nombre;
    private int edad;
    private int id;
    private String sexo;
    private String estadoc;
    private String user;
    private String contra;
    private ArrayList<Mensajes> msgs = new ArrayList();
    private Rol rol;

    public Personas() {
    }

    public Personas(String nombre, int edad, int id, String sexo, String estadoc, String user, String contra, Rol rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.sexo = sexo;
        this.estadoc = estadoc;
        this.user = user;
        this.contra = contra;
        this.rol = rol;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(String estadoc) {
        this.estadoc = estadoc;
    }

    public ArrayList<Mensajes> getMsgs() {
        return msgs;
    }

    public void setMsgs(ArrayList<Mensajes> msgs) {
        this.msgs = msgs;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", sexo=" + sexo + ", estadoc=" + estadoc + ", msgs=" + msgs + '}';
    }

}
