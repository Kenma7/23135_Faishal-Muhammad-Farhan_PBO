/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TOSERBA;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Toserba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        System.out.println("TOKO SERRBA ADA");
        System.out.println("****************");
        
        String[] Kodebrng = {"a001", "a002", "a003"};
        String[] Namabrng = {"Buku", "Pensil", "Pulpen"};
        double[] Hargabrng = {3000, 4000, 5000};
        
        System.out.print("Masukkan Item Barang  : ");
        int jmlitem = input.nextInt();
        
        String[] Kodebuy = new String[jmlitem];
        int[] Jmlbuy = new int[jmlitem];
        double[] ttlHarga = new double[jmlitem];
        double TotalBayar = 0;
        
        for(int i = 0; i < jmlitem; i++) {
        System.out.println("Data ke-" + (i + 1));
        System.out.print("Masukkan Kode         : ");
        Kodebuy[i] = input.next();
        System.out.print("Masukkan Jumlah Beli  : ");
        Jmlbuy[i] = input.nextInt();
        
        for(int j = 0; j < Kodebrng.length; j++){
            if(Kodebuy[i].equals(Kodebrng[j])) {
                ttlHarga[i] = Hargabrng[j] * Jmlbuy[i];
                TotalBayar += ttlHarga[i];
            }
        }
    }
        
        System.out.println("\n\nTOKO SERBA ADA");
        System.out.println("*******************");
        System.out.printf("%-5s %-15s %-15s %-10s %-15s %-15s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        Pembatas();
        
        for(int i = 0; i < jmlitem; i++){
            for(int j = 0; j < Kodebrng.length; j++){
                if (Kodebuy[i].equals(Kodebrng[j])){
                    System.out.printf("%-5d %-15s %-15s %-15.0f %-13d %-15.0f\n", (i + 1), Kodebuy[i], Namabrng[j], Hargabrng[j], Jmlbuy[i], ttlHarga[i]);
                }
            }
        }
        
        Pembatas();
        System.out.println("Total Bayar Keseluruhan                                             " + (int)TotalBayar);
        Pembatas();
        
        input.close();
    }
    
    public static void Pembatas(){
            System.out.println("===============================================================================");
        }
}
