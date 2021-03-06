/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.stockcontrol;

import itpshnew.dbCon;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author isira
 */
public abstract class StockControl extends javax.swing.JPanel {
    protected String ID;
    protected Connection conn;
    protected PreparedStatement pst = null;
    protected ResultSet rs = null;
    protected boolean loaded = false;
    /**
     * Creates new form StockControl2
     */
    public StockControl() {
        conn = dbCon.connect();
        initComponents();
    }
    
    public boolean getLoaded()
    {
        return loaded;
    }
    
    public abstract void pubInit();
    
    protected void tableLoad(JTable table, String query)
    {
        try
        {
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Unable to load table "+table.getName()+".", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
