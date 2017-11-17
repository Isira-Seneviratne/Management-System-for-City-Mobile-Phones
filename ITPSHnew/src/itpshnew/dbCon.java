/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author User Pc
 */
public class dbCon {
    public static Connection connect()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcitymobile","root","");
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Unable to load database driver.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(null, "Unable to establish database connection.", "Error", JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
        }
        return conn;
    }
}
