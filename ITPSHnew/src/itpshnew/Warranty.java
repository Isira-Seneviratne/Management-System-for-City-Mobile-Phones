/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

/**
 *
 * @author isira
 */
public class Warranty extends javax.swing.JPanel {
    private boolean loaded;
    /**
     * Creates new form Warranty
     */
    public Warranty() {
        initComponents();
    }

    public void pubInit()
    {
        initComponents();
        loaded = true;
    }
    
    public boolean getLoaded()
    {
        return loaded;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        warranty_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        warranty_table = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        replace_table = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        warranty_panel.setBackground(new java.awt.Color(202, 254, 227));
        warranty_panel.setAutoscrolls(true);
        warranty_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(100, 199, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel18.setText("Bill Number");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel19.setText("Item ID");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 200, 30));

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 200, 30));

        jButton10.setBackground(new java.awt.Color(31, 233, 133));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("Add");
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 90, 30));

        warranty_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1040, 60));

        jScrollPane2.setAutoscrolls(true);

        warranty_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bill Number", "Item Code", "Item Name", "Brand", "Amount", "warranty period", "sold date", "valid until", "solution"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        warranty_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        warranty_table.setGridColor(new java.awt.Color(100, 199, 150));
        warranty_table.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jScrollPane2.setViewportView(warranty_table);

        warranty_panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1040, 190));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Warranty");
        warranty_panel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, 50));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Replace");
        warranty_panel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 200, 50));

        jPanel6.setBackground(new java.awt.Color(100, 199, 150));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel22.setText("Item ID");
        jLabel22.setToolTipText("");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel23.setText("Item Name");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 200, 30));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 200, 30));

        jButton11.setBackground(new java.awt.Color(31, 233, 133));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("Add");
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 90, 30));

        warranty_panel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 1040, 60));

        jScrollPane3.setAutoscrolls(true);

        replace_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Previous Item Code", "Item code", "Item Name", "Brand", "Manufacture  year", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        replace_table.setGridColor(new java.awt.Color(100, 199, 150));
        jScrollPane3.setViewportView(replace_table);

        warranty_panel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 1040, 160));

        jButton12.setBackground(new java.awt.Color(48, 214, 48));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Print_40px.png"))); // NOI18N
        jButton12.setText("  Print");
        warranty_panel.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 200, 50));

        jButton13.setBackground(new java.awt.Color(48, 214, 48));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Save_40px.png"))); // NOI18N
        jButton13.setText("  Save");
        warranty_panel.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, 200, 50));

        jButton14.setBackground(new java.awt.Color(48, 214, 48));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Reset_40px.png"))); // NOI18N
        jButton14.setText("  Reset");
        warranty_panel.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, 200, 50));

        jButton15.setBackground(new java.awt.Color(31, 233, 133));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setText("Remove");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        warranty_panel.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 110, 30));

        jButton16.setBackground(new java.awt.Color(31, 233, 133));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setText("Save");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        warranty_panel.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1076, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(warranty_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(warranty_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTable replace_table;
    private javax.swing.JPanel warranty_panel;
    private javax.swing.JTable warranty_table;
    // End of variables declaration//GEN-END:variables
}
