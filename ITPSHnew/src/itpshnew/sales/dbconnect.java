/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.sales;



/**
 *
 * @author Thareendra
 */

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class dbconnect {

    public static Connection connect() {
        Connection conn = null; //object conn is created

        try {
            Class.forName("com.mysql.jdbc.Driver"); //driver to connect to the database
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/itpsh", "root", "2468");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Database doesn't connect properly.");		
        }

        return conn;
    }

}