/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan61bangunruang;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan data dari 
 * perhitungan bangun ruang
 * 
 */

public class PBO10K10119918Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setJariJari(7);
        System.out.println("Jari-jari \t = " + bola.getJariJari());
        System.out.printf("Volume \t\t = %.2f%n%n", bola.hitungVolume());
        
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        System.out.println("Jari-jari \t = " + tabung.getJariJari());
        System.out.println("Tinggi \t\t = " + tabung.getTinggi());
        System.out.printf("Volume \t\t = %.2f%n%n", tabung.hitungVolume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        System.out.println("Jari-jari \t = " + kerucut.getJariJari());
        System.out.println("Tinggi \t\t = " + kerucut.getTinggi());
        System.out.printf("Volume \t\t = %.2f%n", kerucut.hitungVolume());
    }
    
}
