/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NilaiMahasiswa;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String repeat;
        
        do{
        System.out.print("NPM : ");
        String npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran : ");
        double nHadir = input.nextDouble();
        
        System.out.print("Nilai Tugas : ");
        double nTugas = input.nextDouble();
        
        System.out.print("Nilai UTS : ");
        double nUTS = input.nextDouble();
        
        System.out.print("Nilai UAS : ");
        double nUAS = input.nextDouble();
        
        double nAkhir = (0.10*nHadir) + (0.20*nTugas)+ (0.30*nUTS) + (0.40*nUAS);
        String grade;
        String ket;
        
        if(nAkhir >= 76 && nAkhir <= 100){
            grade = "A";
            ket = "Istimewa";
        }else if(nAkhir >= 66 && nAkhir <= 75){
            grade = "B";
            ket = "Baik";
        }else if(nAkhir >= 56 && nAkhir <= 65){
            grade = "C";
            ket = "Cukup";
        }else if(nAkhir >= 46 && nAkhir <= 55){
            grade = "D";
            ket = "Kurang";
        }else {
            grade = "E";
            ket = "Kurang Sekali";
        }
        
        System.out.println("\nNilai Akhir Mahasiswa");
        System.out.println("NPM Mahasiswa : "+npm);
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Nilai Rata-rata: "+ nAkhir);
        System.out.println("Grade : "+grade);
        System.out.println("Keterangan : "+ket);
        
        System.out.println("\nApakah anda ingin menginput nilai lagi? (Y/N)");
        input.nextLine();
        repeat = input.nextLine();
        }while (repeat.equalsIgnoreCase("Y"));
        
        input.close();
        System.out.println("\nProgram ini dibuat oleh : Faishal Muhammad Farhan (2310631170135)");
    }
    
}
