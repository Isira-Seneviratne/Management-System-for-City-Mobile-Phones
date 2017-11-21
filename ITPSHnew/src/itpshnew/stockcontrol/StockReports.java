/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.stockcontrol;

import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
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
        initComponents();
    }

    @Override
    public void pubInit()
    {
        initComponents();
        loaded = true;
        tableLoad(jTable1, "Select * From financial_reports");
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
        jTextField18 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        Reports.setBackground(new java.awt.Color(202, 254, 227));
        Reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 0));
        jLabel24.setText("Monthly");
        Reports.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        jPanel7.setBackground(new java.awt.Color(100, 199, 150));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("Report ID");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, -1));

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 620, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Google_Web_Search_40px.png"))); // NOI18N
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 40, 50));

        jButton10.setBackground(new java.awt.Color(100, 199, 150));
        jButton10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton10.setText("Generate");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 150, 30));

        Reports.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1040, 50));

        jPanel6.setBackground(new java.awt.Color(100, 199, 150));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setBackground(new java.awt.Color(48, 214, 48));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton15.setText("  ReOrder Stock");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 400, 60));

        jButton17.setBackground(new java.awt.Color(48, 214, 48));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton17.setText(" Income Stocks");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 400, 60));

        jButton18.setBackground(new java.awt.Color(48, 214, 48));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton18.setText(" Stocks Sold");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 400, 60));

        Reports.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 470, 260));

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 0));
        jLabel27.setText("Search");
        Reports.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel11.setBackground(new java.awt.Color(100, 199, 150));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton19.setBackground(new java.awt.Color(48, 214, 48));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton19.setText("  ReOrder Stock");
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 400, 60));

        jButton20.setBackground(new java.awt.Color(48, 214, 48));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton20.setText(" Income Stocks");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 400, 60));

        jButton21.setBackground(new java.awt.Color(48, 214, 48));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton21.setText(" Stocks Sold");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 400, 60));

        Reports.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 470, 260));

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 0));
        jLabel28.setText("Annually");
        Reports.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        Reports.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1040, 250));

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

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        genIReport();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    public void genIReport()
    {
        try
        {
            JasperCompileManager.compileReportToFile("reports/item.jrxml", "reports/item.jasper");
            JasperFillManager.fillReportToFile("reports/item.jasper",
                    "reports/item.jrprint", null, conn);
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField18;
    // End of variables declaration//GEN-END:variables
}