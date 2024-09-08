/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BingoSong;

/**
 *
 * @author DELL
 */
public class Bingo {
    private String[] bingoreff = {"B", "I", "N", "G", "O"};
    
    public Bingo(){
        for (int i=0; i < bingoreff.length; i++) {
            printsong();
            printClap(i);
        }
    }
    
    private void printsong(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
    }
    
  
    private void printClap(int clap){
        for (int j=0; j < 3; j++) {
            for(int k=0; k < clap; k++) {
                System.out.print("(clap)-");
            }
            for(int i = clap; i < bingoreff.length; i++) {
            System.out.print(bingoreff[i]+ "-");
        }
            System.out.println();
        }
    }
    
    
}
