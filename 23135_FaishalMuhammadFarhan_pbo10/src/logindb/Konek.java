/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logindb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class Konek {

    /**
     * @param args the command line arguments
     */
    private static Connection konek;
    
    public static Connection konek() throws SQLException, ClassNotFoundException {
        try {
            if (konek == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "");
                System.out.println("konkesi berhasil!");
            }
            return konek;
        }catch (SQLException e) {
            System.err.println("Error Cuy..." + e.getMessage());
            throw e;
        }
    }
    
}
