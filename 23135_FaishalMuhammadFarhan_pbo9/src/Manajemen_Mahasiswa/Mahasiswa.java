/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manajemen_Mahasiswa;

/**
 *
 * @author DELL
 */
public class Mahasiswa {
    private String nim, nama, alamat, matkul;
    private double nilaiAkhir;
    
    public Mahasiswa (String nim, String nama, String alamat, String matkul, double nilaiAkhir){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.matkul = matkul;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public String getnim(){
        return nim;
    }
    
    public String getnama(){
        return nama;
    }
    
    public String getalamat(){
        return alamat;
    }
    
    public String getmatkul(){
        return matkul;
    }
    
    public double getnilaiAkhir(){
        return nilaiAkhir;
    }
}
