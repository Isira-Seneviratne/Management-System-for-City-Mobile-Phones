/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.stockcontrol;

import java.sql.SQLException;
import net.sf.jasperreports.engine.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author isira
 */
public class StockReports extends StockControl {

    /**
     * Creates new form Reports
     */
    public StockReports() {
        super();
        initComponents();
    }

    @Override
    public void pubInit()
    {
        initComponents();
        loaded = true;
        tableLoad(jTable7, "Select * From financial_reports");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reports = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtrpt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        comboMonth = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnsoldstock = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();

        Reports.setBackground(new java.awt.Color(202, 254, 227));
        Reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 0));
        jLabel24.setText("ReOrdered Stock Report");
        Reports.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 70));

        jPanel7.setBackground(new java.awt.Color(100, 199, 150));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("Issued Year");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        txtrpt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtrptMouseMoved(evt);
            }
        });
        txtrpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrptActionPerformed(evt);
            }
        });
        jPanel7.add(txtrpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 620, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Google_Web_Search_40px.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 40, 50));

        jButton13.setBackground(new java.awt.Color(100, 199, 150));
        jButton13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton13.setText("Refresh");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 150, 30));

        Reports.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1040, 50));

        jPanel6.setBackground(new java.awt.Color(100, 199, 150));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setBackground(new java.awt.Color(48, 214, 48));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton15.setText("Generate Report");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 400, 60));

        comboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "Aug", "Sep", "October", "November", "December" }));
        jPanel6.add(comboMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 120, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel31.setText("Select ReOrdered Month");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 230, 70));

        Reports.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 490, 270));

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 0));
        jLabel27.setText("Search");
        Reports.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel11.setBackground(new java.awt.Color(100, 199, 150));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsoldstock.setBackground(new java.awt.Color(48, 214, 48));
        btnsoldstock.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsoldstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        btnsoldstock.setText("Generate Report");
        btnsoldstock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsoldstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsoldstockActionPerformed(evt);
            }
        });
        jPanel11.add(btnsoldstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 400, 60));

        Reports.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 470, 100));

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 0));
        jLabel28.setText("Sold Stock Report");
        Reports.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 380, 70));

        jTable7.setBackground(new java.awt.Color(204, 255, 204));
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable7);

        Reports.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1040, 250));

        jPanel1.setBackground(new java.awt.Color(100, 199, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setBackground(new java.awt.Color(48, 214, 48));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton21.setText("Generate Sold Report");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 400, 60));

        jButton18.setBackground(new java.awt.Color(48, 214, 48));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton18.setText("Generate Report");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 400, 60));

        Reports.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 470, 110));

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 153, 0));
        jLabel32.setText("Income Stock Report");
        Reports.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 380, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtrptMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrptMouseMoved

    }//GEN-LAST:event_txtrptMouseMoved

    private void txtrptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrptActionPerformed

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        boolean flag = false;
        String key = txtrpt.getText();
        try
        {
            double val = Double.parseDouble(key);

            if (val < 0 || key.equals("-0"))
            {
                JOptionPane.showMessageDialog(null, "Year cannot be negative");
                flag = true;
                txtrpt.setText("");
            }
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid Year");
            flag = true;
            txtrpt.setText("");
        }

        if (flag == false)
        {
            try
            {
                pst = conn.prepareStatement("SELECT * FROM financial_reports where Year_issued = '" + key + "'");
                rs = pst.executeQuery();
                jTable7.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (SQLException ex)
            {
                Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try
        {
            pst = conn.prepareStatement("select * FROM financial_reports");
            rs = pst.executeQuery();
            jTable7.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e1)
        {
            JOptionPane.showMessageDialog(null, "Unable to get monthly financial records.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try
        {
            String month = comboMonth.getSelectedItem().toString();
            Map parameters = new HashMap();
            parameters.put("RequestDate","'%"+month+"%'");
            JasperCompileManager.compileReportToFile("reports/reorders.jrxml", "reports/reorders.jasper");
            JasperFillManager.fillReportToFile("reports/reorders.jasper",
                    "reports/reorders.jrprint",parameters,conn);
            JOptionPane.showMessageDialog(null, "Report successfully generated.", "Error", JOptionPane.ERROR_MESSAGE);
            JasperViewer.viewReport("reports/reorders.jrprint", false, false);
        }
        catch (JRException ex)
        {
            JOptionPane.showMessageDialog(null, "An error occurred while generating the report.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void btnsoldstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsoldstockActionPerformed
        genIReport();
    }//GEN-LAST:event_btnsoldstockActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        genIReport();
    }//GEN-LAST:event_jButton18ActionPerformed

    public void genIReport()
    {
        try
        {
            JasperCompileManager.compileReportToFile("reports/item.jrxml", "reports/item.jasper");
            JasperFillManager.fillReportToFile("reports/item.jasper", "reports/item.jrprint", null, conn);
            JasperViewer.viewReport("reports/item.jrprint", false, false);
        }
        catch(JRException e)
        {
            JOptionPane.showMessageDialog(null, "Unable to generate report.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Reports;
    private javax.swing.JButton btnsoldstock;
    private javax.swing.JComboBox<String> comboMonth;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField txtrpt;
    // End of variables declaration//GEN-END:variables
}
