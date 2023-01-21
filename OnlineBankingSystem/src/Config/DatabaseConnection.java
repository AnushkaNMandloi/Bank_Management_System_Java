/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author anush
 */
public class DatabaseConnection {
   static Connection con;
    
    public static Connection DatabaseCon(){
    try
        {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3006/onlinebank_dev","root","root");
            if(con!=null) System.out.println("Database connected!");
            else System.out.println("Database not connected");
            //return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
            return null;
        }
        return con;
    }
}
