/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenentuHari;

/**
 *
 * @author DELL
 */
public class HitungHari {
    
    private int tahun;
    private String bulan;
    
    public HitungHari(int tahun, String bulan){
        this.tahun = tahun;
        this.bulan = bulan;
    }
    
    public int hitung(){
        int hari = 0;
       
         switch(bulan){
        case "Januari":
        case "Mei":
        case "Juli":
        case "Agustus":
        case "Oktober":
        case "Desember":
            hari = 31;
            break;
        case "April":
        case "Juni":
        case "September":
        case "November":
            hari = 30;
            break;
        case "Februari":
            hari = 28;
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
                hari = 29;
            }
            break;
    }   
       return hari;
    }
}
