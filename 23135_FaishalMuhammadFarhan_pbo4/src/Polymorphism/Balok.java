/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author DELL
 */
class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
    public double hitungLuas(){
        return 2*((panjang*lebar)+ (panjang*tinggi)+(lebar*tinggi));
    }
    
    public void Dimensi(){
        System.out.println("\nDimensi Balok:");
        System.out.println("Panjang : "+ panjang + " cm"+"\nLebar : "+ lebar+" cm"+ "\nTinggi : " + tinggi+" cm");
    }
}
