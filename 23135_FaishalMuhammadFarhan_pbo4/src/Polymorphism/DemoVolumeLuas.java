/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author DELL
 */
public class DemoVolumeLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang kbs = new Kubus(2);
        BangunRuang blk = new Balok(5, 3, 2);
    
        kbs.Dimensi();
        System.out.println("Valome Kubus: " + kbs.hitungVolume()+ " cm");
        System.out.println("Luas Kubus : " + kbs.hitungLuas()+ " cm");
        blk.Dimensi();
        System.out.println("Volume Balok: "+ blk.hitungVolume()+ " cm");
        System.out.println("Luas Balok: "+ blk.hitungLuas()+" cm");
        System.out.println("Program made by : Faishal Muhammad Farhan (2310631170135)");
    }
    
}
