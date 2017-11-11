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
public class Mensajes {

    private Personas destinatario;
    private String cuerpo;

    public Mensajes() {
    }

    public Mensajes(Personas destinatario, String cuerpo) {
        this.destinatario = destinatario;
        this.cuerpo = cuerpo;
    }

    public Personas getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Personas destinatario) {
        this.destinatario = destinatario;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return cuerpo;
    }

}
