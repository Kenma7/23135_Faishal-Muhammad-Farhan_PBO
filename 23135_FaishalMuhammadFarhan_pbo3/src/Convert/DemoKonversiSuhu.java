/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Convert;

/**
 *
 * @author DELL
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu2 convert= new KonversiSuhu2();
        
        //contoh
        double suhuCelcius = 34;
        double suhuFahrenheit = convert.celciusToFahrenheit(suhuCelcius);
        double suhuReamur = convert.celciusToReamur(suhuCelcius);
        double fahrenheitToReamur = convert.fahrenheitToReamur(suhuFahrenheit);
        
        System.out.println("Data Suhu Daerah :");
        System.out.println("Suhu Karawang dalam Celcius: " + suhuCelcius);
        System.out.println("Convert To Fahrenheit: " + suhuFahrenheit);
        System.out.println("Convert To Reamur: " + suhuReamur);
        System.out.println("Convert Fahrenheit to Reamur: " + fahrenheitToReamur);
        System.out.println("\nProgram ini dibuat oleh : Faishal Muhammad Farhan(2310631170135)");
    }
    
}
