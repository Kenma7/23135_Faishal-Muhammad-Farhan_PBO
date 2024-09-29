/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DiskonPembelian;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Diskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String repeat;
        
        do {
            System.out.print("Masukkan nama barang : ");
            String namaProduk = input.nextLine();
            
            System.out.print("Masukkan harga (Rp): ");
            double harga = input.nextDouble();
            
            System.out.print("Masukkan Jumlah : ");
            int Jumlah = input.nextInt();
            
            double totalBeli = harga*Jumlah;
            
            double diskon;
            
            if(totalBeli < 50000) {
                diskon = totalBeli * 0.05;
            }else {
                diskon = totalBeli * 0.20;
            }
            
            double totalBayar = totalBeli - diskon;
            
            System.out.println("\n======Detail Transaksi======");
            System.out.println("Nama Barang : " + namaProduk);
            System.out.println("Jumlah Barang : " + Jumlah);
            System.out.println("Harga per Barang : Rp." + harga);
            System.out.println("Total Pembelian : Rp." + totalBeli);
            System.out.println("Besarnya Potongan : Rp." + diskon);
            System.out.println("Total Pembayaran :Rp." + totalBayar);
            
            System.out.println("Apakah anda ingin Membeli lagi? (Y/N)");
            input.nextLine();
            repeat = input.nextLine();
        }while (repeat.equalsIgnoreCase("Y"));
        
        input.close();
        System.out.println("\nTerima Kasih sudah berbelanja di Toko kami");
    }
    
}
