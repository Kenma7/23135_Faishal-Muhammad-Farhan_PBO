package Matematika2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MatematikaInheritens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematika2 mtk1 = new Matematika2(20, 10);
        Matematika2 mtk2 = new Matematika2(10, 5);
        Matematika2 mtk3 = new Matematika2(10, 3);
        Matematika2 mtk4 = new Matematika2(21, 2);
        
        mtk1.tambah();
        mtk1.modulus();
        mtk2.kurang();
        mtk2.modulus();
        mtk3.kali();
        mtk3.modulus();
        mtk4.bagi();
        mtk4.modulus();
    }
    
}
