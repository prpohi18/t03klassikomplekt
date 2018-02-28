/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodutoo3;


public class Loom {
    private String loomad;
    private int mass;
    private int korgus;


    public String getLoomad() {
        return loomad;
    }

    public void setLoomad(String loomad) {
        this.loomad = loomad;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getKorgus() {
        return korgus;
    }

    public void setKorgus(int korgus) {
        this.korgus = korgus;
    }

    @Override
    public String toString() {
        return "Loomad{" +
                "loom='" + loomad + '\'' +
                ", mass=" + mass +
                ", korgus=" + mass +
                '}';
    }
}