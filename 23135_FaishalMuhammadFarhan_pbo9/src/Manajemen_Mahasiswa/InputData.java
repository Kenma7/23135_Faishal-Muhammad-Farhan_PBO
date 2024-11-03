/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manajemen_Mahasiswa;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class InputData {
    ArrayList<Mahasiswa> listmahasiswa;
    
    public InputData(){
        listmahasiswa = new ArrayList();
    }
    
    public void insertData(String nim, String nama, String alamat, String matkul, double nilaiAkhir){
        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, matkul, nilaiAkhir);
        listmahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa>getALL(){
        return listmahasiswa;
    }
    
    public void deleteData(int index){
        listmahasiswa.remove(index);
    }
}
