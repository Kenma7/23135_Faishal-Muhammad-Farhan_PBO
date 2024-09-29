/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Timbangan;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Timbangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String repeat;
        
        do {
        System.out.println("Masukkan berat badan (Kg): ");
        double weight = input.nextDouble();
        
        System.out.println("Masukkan tinggi badan (m): ");
        double height = input.nextDouble();
        
        double imt = weight / (height*height);
        
        System.err.println("Indeks Massa Tubuh (IMT) Anda adalah: "+imt);
        
        String kriteria;
        if(imt < 18.4){
            kriteria = "Berat Badan Kurang";
        }else if(imt >= 18.5 && imt <= 24.9){
            kriteria = "Berat Badan Ideal";
        }else if(imt >= 25 && imt <= 29.9){
            kriteria = "Berat Badan Lebih";
        }else if(imt >= 30 && imt <=39.9){
            kriteria = "Gemuk";
        }else {
            kriteria = "Sangat Gemuk";
        }
        
        System.out.println("Kriteria: "+ kriteria);
        
        System.out.println("Apakah anda ingin Keluar dari program? (Y/N)");
        input.nextLine();
        repeat = input.nextLine();
        }while (repeat.equalsIgnoreCase("N"));
        
        input.close();
        System.out.println("Program ini dibuat oleh : Faishal Muhammad Farhan (2310631170135)");
        
    } 
    
}
