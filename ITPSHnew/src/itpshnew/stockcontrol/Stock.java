/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.stockcontrol;

import itpshnew.dbCon;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import itpshnew.StockControl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ITSD
 */
public class Stock {
    Connection conn = dbCon.connect();
    ResultSet rs;
    private PreparedStatement pst;
    private String itemID;
    private String ShippingID;
    private String itemName;
    private String brand;
    private String warranty;
    private String manufac;
    private String model;
    private String dis;
    private String price;
    
    public Stock()
    {}
    public Stock(String itemID)
    {
        this.itemID = itemID;
    }
    public Stock(String itemID,String ShippingID,String itemName,String brand,String warranty,String manufac,String model,String dis,String price)
    {
        this.itemID = itemID;
        this.ShippingID = ShippingID;
        this.itemName = itemName;
        this.brand = brand;
        this.warranty = warranty;
        this.manufac = manufac;
        this.model = model;
        this.dis = dis;
        this.price = price; 
    }
    public int removeitem() throws SQLException 
    {
        try{
        String q = "DELETE FROM item WHERE itemID = '" + itemID + "'";
                
                pst = (PreparedStatement) conn.prepareStatement(q);
                return pst.executeUpdate(q);
        }
                catch(Exception e){}
    
    return 0;
    }
    public ResultSet searchitem() 
    {
    try {
                String z = "SELECT * FROM item where itemName LIKE '%" + itemID + "%'";
                pst = (PreparedStatement) conn.prepareStatement(z);
                return rs = pst.executeQuery(); //returns the searched resultset
                
            } catch (SQLException ex) {
                Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    return null; //returns empty resultset
    }
    
     public void additem() throws SQLException
     {
         try{
         
         String q = "INSERT INTO item(shippingID,itemID,itemName,brand,modelCode,sellingPrice,manufactureDate,warrantyPeriod,discount) "
                        + "values('" + ShippingID + "','" + itemID + "','" + itemName + "','" + brand + "','" + model + "','" + price + "','" + manufac + "','" + warranty + "'"
                        + ",'" + dis + "')";

                pst = (PreparedStatement) conn.prepareStatement(q);
                pst.execute();
                JOptionPane.showMessageDialog(null, ""+ brand +" "+ itemName +" has been Successfully Added");
         }
         catch (Exception e)
         {
             System.out.println("Cannot be added");
         }
     try {
                
                String sql = "INSERT INTO availablestock(modelCode,qtyInHand,reOrderLevel) values ('" + model + "',1,10) ON DUPLICATE KEY UPDATE qtyInHand = qtyInHand + 1";
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
            } catch (Exception b) {}
     }
    
    
}
