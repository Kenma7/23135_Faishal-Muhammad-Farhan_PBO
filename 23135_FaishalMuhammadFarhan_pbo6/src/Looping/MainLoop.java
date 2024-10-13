/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Looping;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class MainLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int menu;
        int n;
     
       do{
        System.out.println("\n===Menu Program Loop===");
        System.out.println("1. Menghitung Deret bilangan Prima bukan dari 0-20");
        System.out.println("2. Menghitung Deret Bilangan Ganjil & Genap dari 0-20");
        System.out.println("3. Menampilkan huruf Z - A");
        System.out.println("4. Menampilkan Lagu anak Ayam Turun N");
        System.out.println("5. Tabel Perkalian");
        System.out.println("6. Exit");
        System.out.print("Pilih Menu : ");
        menu = input.nextInt();
        input.nextLine();
        
        
        switch(menu){
            case 1:
              DeretPrima();
              break;
            case 2:
              GanjilGenap();
              break;
            case 3:
              HurufZA();
              break;
            case 4:
                LaguAyam();
                break;
            case 5:
                TabelKali();
            case 6:
                System.out.println("Keluar dari program----");
                System.out.println("made by: Faishal Muhammad Farhan(2310631170135)");
                break;
            default:
                System.out.println("Menu tidak Valid.");
             }
        }while (menu !=6);
    }
    
        public static void DeretPrima(){
      System.out.println("Bilangan Prima dari 0-20:");
        for(int i = 2; i <= 20; i++) {
            if(Prima(i)){
                System.out.print(i + " ");
            }
        }
      System.out.println("\n\nBilangan bukan Prima dari 0-20: ");
                for (int i = 0; i <= 20; i++) {
                    if(!Prima(i) && i != 1){
                        System.out.print(i + " ");
                    }
        }
               System.out.println();
       
}
        
        public static boolean Prima(int num) {
            if(num <= 1) return false;
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0) return false;
            }
            return true;
    }
        
        public static void GanjilGenap(){
            System.out.println("Bilangan Genap dari 0-20: ");
            int i = 0;
                    while (i <= 20){
                        if(i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                        i++;
                    }
                    
                    System.out.println("\n\nBilangan Ganjil dari 0-20: ");
                    int j = 0;
                    do{
                        if(j % 2 != 0) {
                            System.out.print(j + " ");
                        }
                        j++;
                    }while (j <= 20);
                    System.out.println();
        }

        public static void HurufZA(){
            System.out.println("Huruf Z - A: ");
            for (char h = 'Z'; h >= 'A'; h--){
                System.out.print(h + " ");
            }
            System.out.println();
        }
        
        public static void LaguAyam(){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jumlah anak Ayam: ");
            int n = input.nextInt();
            
            for (int i = n; i > 0; i--){
                if(i == 1){
                    System.out.println("Anak Ayam turun 1, mati 1 tinggal induknya.");
                }else {
                    System.out.println("Tek kotek, kotek kotek");
                    System.out.println("Anak Ayam turun berkotek");
                    System.out.println("Anak Ayam turunlah "+ i +", mati 1 tinggalah "+ (i-1));
                }
            }
        }
        
        public static void TabelKali(){
            Scanner input = new Scanner(System.in);
  
            System.out.print("Masukkan nilai n: ");
            int n = input.nextInt();
            
            if (n <= 0 || n>10) {
                System.out.println("Nilai n harus lebih besar dari 0 dan kurang dari sama dengan 10.");
                    return;
            }
                System.out.println("Tabel Perkalian "+ n +" x "+ n + ":");
                    for(int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++){
                            System.out.print(i * j + "\t");
                        }
                        System.out.println();
                    }
        }
}