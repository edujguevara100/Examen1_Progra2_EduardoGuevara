/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_eduardoguevara_progra2;

/**
 *
 * @author edujg
 */
public class Hermano extends Familiares{

    public Hermano() {
        super();
    }

    public Hermano(String nombre, int edad, int id, String sexo, String estadoc, String user, String contra, String rol) {
        super(nombre, edad, id, sexo, estadoc, user, contra, rol);
    }
    

    public Hermano(String trabajo, float altura, float peso, String nombre, int edad, int id, String sexo, String estadoc, String user, String contra, String rol) {
        super(trabajo, altura, peso, nombre, edad, id, sexo, estadoc, user, contra, rol);
    }
    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
