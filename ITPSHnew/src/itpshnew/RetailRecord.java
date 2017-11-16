/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Bhanu
 */
public class RetailRecord extends Distribution {

    /**
     * Creates new form RetailRecord
     */
    public RetailRecord() {
        super();
    }

    @Override
    public void pubInit()
    {
        initComponents();
        loaded = true;
        tableload(retail_rectable,"select * FROM shipping_rec where ship_type='Retail'");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        retailrecord = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jTextField54 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        retail_rectable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        print2 = new javax.swing.JButton();

        retailrecord.setBackground(new java.awt.Color(202, 254, 227));
        retailrecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(100, 199, 150));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel57.setText("Retail ID");
        jPanel12.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));
        jPanel12.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 220, 25));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel60.setText("Date");
        jPanel12.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setText("Item Model");
        jPanel12.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 30));
        jPanel12.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, 25));
        jPanel12.add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 220, 25));

        jLabel63.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel63.setText("Quantity");
        jPanel12.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 150, 30));
        jPanel12.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 220, 25));

        jLabel64.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel64.setText("Cost");
        jPanel12.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 150, 30));
        jPanel12.add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 220, 25));

        jLabel65.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel65.setText("Shipping ID");
        jPanel12.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 30));
        jPanel12.add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 220, 25));

        jButton11.setBackground(new java.awt.Color(31, 233, 133));
        jButton11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton11.setText("Save");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 100, 30));

        jButton12.setBackground(new java.awt.Color(31, 233, 133));
        jButton12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 100, 30));

        jButton13.setBackground(new java.awt.Color(31, 233, 133));
        jButton13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton13.setText("Calculate");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 100, 30));

        retailrecord.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1050, 280));

        retail_rectable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        retail_rectable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shipping ID", "Retail ID", "Date", "Item Model", "Quantity", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        retail_rectable.setGridColor(new java.awt.Color(100, 199, 150));
        jScrollPane3.setViewportView(retail_rectable);

        retailrecord.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1040, 190));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Retail Record");
        retailrecord.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 4, 250, 60));

        print2.setBackground(new java.awt.Color(48, 214, 48));
        print2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        print2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        print2.setText("  Print");
        print2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print2ActionPerformed(evt);
            }
        });
        retailrecord.add(print2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retailrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retailrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        try{
            String SID = jTextField54.getText();
            String RID = jTextField48.getText();
            String recdate = jTextField49.getText();
            String modelCode = jTextField51.getText();
            String qty = jTextField52.getText();
            String itemcost = jTextField53.getText();
            String type = "Retail";

            Statement add_vendorrec = con.createStatement();

            add_vendorrec.executeQuery("Insert into Ship_Rec values('"+SID+"','"+RID+"','"+recdate+"','"+modelCode+"','"+qty+"','"+itemcost+"','"+type+"')");
            JOptionPane.showMessageDialog(this, "The retail shipping record has been inserted.","Insertion successful", JOptionPane.INFORMATION_MESSAGE);
            tableload(retail_rectable,"select * FROM shipping_rec where ship_type='Retail'");
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "Database Insert Error","Unable to Insert into DB", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "You have attempted to store blank or invalid numbers. Please enter valid numbers.",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTextField54.setText("");
        jTextField48.setText("");
        jTextField49.setText("");
        jTextField51.setText("");
        jTextField52.setText("");
        jTextField53.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        try{
            String item=jTextField51.getText();
            Statement stmt1 = con.createStatement( );
            ResultSet a = stmt1.executeQuery("select price from Stock where item_ID='"+item+"'");
            int price = a.getInt("price");
            jTextField53.setText(Integer.toString(price*Integer.parseInt(jTextField52.getText())));
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "Unable to Retrieve into DB.","Database Retrieve Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "You have attempted to store blank or invalid numbers. Please enter valid numbers.",
                "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void print2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JButton print2;
    private javax.swing.JTable retail_rectable;
    private javax.swing.JPanel retailrecord;
    // End of variables declaration//GEN-END:variables
}
