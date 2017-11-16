/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Bhanu
 */
public abstract class Distribution extends javax.swing.JPanel {

    /**
     * Creates new form Distribution
     */
    protected Connection con;
    protected PreparedStatement pst = null;
    protected ResultSet rs = null;
    protected boolean loaded = false;
    
    /**
     * Creates new form purchase
     */
    public Distribution() {
        con = dbCon.connect();
    }

    public boolean getLoaded()
    {
        return loaded;
    }
    
    public void tableload(JTable t,String s)
    {
        try
        {
            pst = con.prepareStatement(s);
            rs = pst.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e1)
        {
            e1.printStackTrace();
        }
    }
    
    public abstract void pubInit();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
