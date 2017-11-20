/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.hr;

import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author isira
 */
public class AttendancePanel extends HR {

    /**
     * Creates new form AttendancePanel
     */
    public AttendancePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Attendance_panel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        save_btn6 = new javax.swing.JButton();
        jTextField34 = new javax.swing.JTextField();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();

        Attendance_panel.setBackground(new java.awt.Color(202, 254, 227));
        Attendance_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(187, 237, 211));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(100, 199, 150));
        jPanel10.setMaximumSize(new java.awt.Dimension(159, 39));
        jPanel10.setMinimumSize(new java.awt.Dimension(159, 39));
        jPanel10.setPreferredSize(new java.awt.Dimension(147, 49));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setText("Work Time");
        jPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("EmpID");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 140, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Job start Time");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Job end Time");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 140, 30));

        save_btn6.setBackground(new java.awt.Color(71, 179, 71));
        save_btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        save_btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Save_40px.png"))); // NOI18N
        save_btn6.setText("  Add");
        save_btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btn6ActionPerformed(evt);
            }
        });
        jPanel10.add(save_btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 45));

        jTextField34.setText("           ");
        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 150, 25));
        jPanel10.add(jDateChooser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));
        jPanel10.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 150, -1));
        jPanel10.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 150, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("Date");
        jPanel10.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("08");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 790, 300));

        Attendance_panel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 330));

        jtable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpID", "Date", "OT Hours", "Working Hours"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable1.setGridColor(new java.awt.Color(100, 199, 150));
        jtable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtable1PropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jtable1);

        Attendance_panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 1040, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Attendance_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Attendance_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void save_btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btn6ActionPerformed
        // TODO add your handling code here:
        //add attendance
        //        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        //        String datee =  Date_Format.format(jDateChooser6.getDate());
        ////        timeInH=jTimeChooser1.getHours();
        //         int mo= jTimeChooser3.getHours();
        //         String Str1=Integer.toString(mo);
        //         System.out.println(mo);
        //         int moo= jTimeChooser4.getHours();
        //         String Str2=Integer.toString(moo);
        //
        //         String empid=jTextField34.getText();
        //         int x =8;
        //         int qw = moo-mo;
        //         int wq = qw-8;
        //         System.out.println(qw);
        //
        //         if (qw>8){
            //          try{
                //              String q= "INSERT INTO dailyattendance(EmpID,Date,Othours,WorkingHours) values ('"+empid+"','"+datee+"','"+wq+"','"+x+"')";
                //               pst = con.prepareStatement(q);
                //               pst.execute();
                //               JOptionPane.showMessageDialog(null, "Inserted");
                //          }catch(Exception e){
                //
                //          }
            //         }
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String datee =  Date_Format.format(jDateChooser6.getDate());
        String empid=jTextField34.getText();
        String wHour=jLabel24.getText();
        String StrtTime=jTextField3.getText();
        String EndTime=jTextField4.getText();

        int x=Integer.parseInt(StrtTime);
        int y=Integer.parseInt(EndTime);
        int w=Integer.parseInt(wHour);

        int hours=y-x;
        int ot = hours-w;

        try{
            Object[] row={empid,datee,ot,w};
            DefaultTableModel model= (DefaultTableModel)jtable1.getModel();
            model.addRow(row);
            String q= "INSERT INTO dailyattendance(EmpID,Date,Othours,WorkingHours) values ('"+empid+"','"+datee+"','"+ot+"','"+w+"')";
            pst = con.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserted");
        }catch(Exception e){

        }

    }//GEN-LAST:event_save_btn6ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void jtable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jtable1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attendance_panel;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable jtable1;
    private javax.swing.JButton save_btn6;
    // End of variables declaration//GEN-END:variables
}
