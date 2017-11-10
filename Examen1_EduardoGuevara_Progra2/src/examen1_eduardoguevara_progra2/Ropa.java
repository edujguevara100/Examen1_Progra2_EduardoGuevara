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
public class Ropa extends Objetos {

    private int talla;
    private String material;
    private String paiselab;

    public Ropa() {
        super();
    }

    public Ropa(int talla, String material, String paiselab) {
        this.talla = talla;
        this.material = material;
        this.paiselab = paiselab;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPaiselab() {
        return paiselab;
    }

    public void setPaiselab(String paiselab) {
        this.paiselab = paiselab;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", material=" + material + ", paiselab=" + paiselab + '}';
    }

}
