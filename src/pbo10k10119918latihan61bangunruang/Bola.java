/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan61bangunruang;

/**
 *
 * @author andreas
 */
public class Bola implements BangunRuang {
    private int jariJari;
    
    public Bola() {
        System.out.println("Bola");
    }

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungVolume() {
        return (4 * 3.14 * jariJari * jariJari * jariJari) / 3;
    }
}
