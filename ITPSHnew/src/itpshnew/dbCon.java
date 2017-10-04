/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;
import java.sql.*;
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
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcitymobile","root","abcd1234");
        }
        catch(ClassNotFoundException | SQLException exp){
            System.out.println(exp);
        }
       
        
        return conn;
    }
}
