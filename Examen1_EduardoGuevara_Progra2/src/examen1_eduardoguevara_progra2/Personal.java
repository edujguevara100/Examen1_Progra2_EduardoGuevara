/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_eduardoguevara_progra2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author edujg
 */
public class Personal extends Personas {

    private String ocupacion;
    private String horario;
    private int tiempo;
    private float sueldo;
    private ArrayList<Mensajes> msgs = new ArrayList();

    public Personal() {
        super();
    }

    public Personal(String nombre, int edad, int id, String sexo, String estadoc, String user, String contra, String rol) {
        super(nombre, edad, id, sexo, estadoc, user, contra, rol);
    }
    

    public Personal(String ocupacion, String horario, int tiempo, float sueldo, String nombre, int edad, int id, String sexo, String estadoc, String user, String contra, String rol) {
        super(nombre, edad, id, sexo, estadoc, user, contra, rol);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Mensajes> getMsgs() {
        return msgs;
    }

    public void setMsgs(ArrayList<Mensajes> msgs) {
        this.msgs = msgs;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}
