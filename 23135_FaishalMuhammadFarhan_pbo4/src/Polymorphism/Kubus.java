/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author DELL
 */
class Kubus extends BangunRuang {
    private double sisi;
    
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    public double hitungVolume(){
        return sisi*sisi*sisi;
    }
    
    public double hitungLuas(){
        return 6*(sisi*sisi);
    }
    
    public void Dimensi(){
        System.out.println("Dimensi Kubus :");
        System.out.println("Sisi : " + sisi+ " cm");
    }
}
