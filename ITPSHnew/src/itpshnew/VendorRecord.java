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
public class VendorRecord extends Distribution {

    /**
     * Creates new form VendorRecord
     */
    public VendorRecord() {
        super();
    }
    
    @Override
    public void pubInit()
    {
        initComponents();
        tableload(vendor_rectable,"select * FROM shipping_rec where ship_type='Vendor'");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vendorrecord = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vendor_rectable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        print1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vendorrecord.setBackground(new java.awt.Color(202, 254, 227));
        vendorrecord.setAutoscrolls(true);
        vendorrecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(100, 199, 150));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setText("Vendor ID");
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 30));
        jPanel11.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, 25));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("Time Taken");
        jPanel11.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 110, 30));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel55.setText("Item Model");
        jPanel11.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 30));
        jPanel11.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 220, 25));
        jPanel11.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 220, 25));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel56.setText("Quantity");
        jPanel11.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 150, 30));
        jPanel11.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 220, 25));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setText("Cost");
        jPanel11.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 150, 30));
        jPanel11.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 220, 25));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setText("Shipping ID");
        jPanel11.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 30));
        jPanel11.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 220, 25));
        jPanel11.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 220, 25));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel59.setText("Shipping Cost");
        jPanel11.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 150, 30));

        jButton8.setBackground(new java.awt.Color(31, 233, 133));
        jButton8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton8.setText("Save");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 100, 30));

        jButton9.setBackground(new java.awt.Color(31, 233, 133));
        jButton9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 100, 30));

        jButton10.setBackground(new java.awt.Color(31, 233, 133));
        jButton10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton10.setText("Calculate");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 100, 30));

        vendorrecord.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1050, 280));

        vendor_rectable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        vendor_rectable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shipping ID", "Vendor ID", "Date", "Item Model", "Quantity", "Shipping Cost", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendor_rectable.setGridColor(new java.awt.Color(100, 199, 150));
        jScrollPane2.setViewportView(vendor_rectable);

        vendorrecord.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1040, 190));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Vendor Record");
        vendorrecord.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 4, 270, 60));

        print1.setBackground(new java.awt.Color(48, 214, 48));
        print1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        print1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        print1.setText("  Print");
        print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print1ActionPerformed(evt);
            }
        });
        vendorrecord.add(print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 200, 50));

        add(vendorrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1110, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try{
            String SID = jTextField43.getText();
            String VID = jTextField39.getText();

            String modelCode = jTextField44.getText();
            String qty = jTextField45.getText();
            String shipcost = jTextField47.getText();
            String itemcost = jTextField46.getText();
            String type = "Vendor";
            Statement validate_vendor = con.createStatement();

            if(validate_vendor.executeQuery("select 1 from vendor where Vendor_ID = '"+VID+"'").next())
            {
                Statement add_vendorrec = con.createStatement();
                add_vendorrec.executeQuery("Insert into shipping_rec values('"+SID+"','"+VID+"',,'"
                    +modelCode+"','"+qty+"','"+shipcost+"','"+itemcost+"','"
                    +type+"',"+DateTimeFunctions.getDate()
                    +",'"+DateTimeFunctions.getMonth()+"',"+DateTimeFunctions.getYear()+")");
                JOptionPane.showMessageDialog(this, "The vendor shipping record has been inserted.", "Success", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, "Insertion succesful","The vendor shipping record has been inserted.", JOptionPane.INFORMATION_MESSAGE);
                tableload(vendor_rectable,"select * FROM shipping_rec where ship_type='Vendor'");

            }
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "Unable to insert into DB","DB insert error", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "You have attempted to store blank or invalid numbers. Please enter valid numbers.",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException npe)
        {
            JOptionPane.showMessageDialog(this, "A database connection was not properly established.",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextField43.setText("");
        jTextField39.setText("");
        jTextField44.setText("");
        jTextField45.setText("");
        jTextField42.setText("");
        jTextField47.setText("");
        jTextField46.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        try
        {
            String VID = jTextField39.getText();
            int timetaken = Integer.parseInt(jTextField42.getText());
            String item=jTextField44.getText();

            Statement stmt1 = con.createStatement( );
            ResultSet rsd = stmt1.executeQuery("select shipping_cost_ph from Vendor where vendor_ID='"+VID+"'");
            int c = rsd.getInt("Shipping_Cost_ph");
            jTextField47.setText(Integer.toString(c*timetaken));
            ResultSet a = stmt1.executeQuery("select price from Stock where item_ID='"+item+"'");
            int price = a.getInt("price");
            jTextField46.setText(Integer.toString(price*Integer.parseInt(jTextField45.getText())));
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "Unable to Retrieve into DB","Database Retrieve Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "You have attempted to store blank or invalid numbers. Please enter valid numbers.",
                "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JButton print1;
    private javax.swing.JTable vendor_rectable;
    private javax.swing.JPanel vendorrecord;
    // End of variables declaration//GEN-END:variables
}
