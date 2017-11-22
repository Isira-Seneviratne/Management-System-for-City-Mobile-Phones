/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew.stockcontrol;

import java.sql.*;
import java.text.DateFormat;
import java.util.logging.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author isira
 */
public class Item extends StockControl {

    /**
     * Creates new form Item
     */
    public Item() {
        initComponents();
    }

    @Override
    public void pubInit()
    {
        initComponents();
        loaded = true;
        tableLoad(jTable3, "Select * From item");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Item = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtship = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        txtbrand = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        purchase_save_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel53 = new javax.swing.JLabel();
        txtprice1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtmodel = new javax.swing.JTextField();
        txtdis = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtdel = new javax.swing.JTextField();

        Item.setBackground(new java.awt.Color(202, 254, 227));
        Item.setToolTipText("");
        Item.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(100, 199, 150));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Shipping ID");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("Item Name");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel13.setText("Model Code");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, 50));

        txtship.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(txtship, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 220, 25));

        txtid.setEditable(false);
        txtid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtid.setBorder(null);
        jPanel4.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 220, 25));

        txtname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 220, 25));

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel42.setText("Days ");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 50, 50));

        jLabel43.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel43.setText("Selling Price");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel44.setText("Warranty Period");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel45.setText("Manufacture Date");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, 50));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 70, 30));

        txtbrand.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(txtbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, 25));

        jLabel46.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel46.setText("Brand");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        purchase_save_btn.setBackground(new java.awt.Color(48, 214, 48));
        purchase_save_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        purchase_save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Save_40px.png"))); // NOI18N
        purchase_save_btn.setText("  Save");
        purchase_save_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        purchase_save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_save_btnActionPerformed(evt);
            }
        });
        jPanel4.add(purchase_save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 200, 60));

        jButton3.setBackground(new java.awt.Color(48, 214, 48));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Reset_40px.png"))); // NOI18N
        jButton3.setText("  Refresh");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 210, 60));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 220, 30));

        jLabel53.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel53.setText("Rs.");
        jPanel4.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        txtprice1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(txtprice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 220, 25));

        jLabel54.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel54.setText("Discount");
        jPanel4.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 115, -1, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setText("Item ID");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel58.setText("%");
        jPanel4.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 40, 40));

        txtmodel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodelActionPerformed(evt);
            }
        });
        jPanel4.add(txtmodel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 220, 25));

        txtdis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtdis.setText("0");
        txtdis.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtdis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdisActionPerformed(evt);
            }
        });
        jPanel4.add(txtdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 190, 25));

        Item.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 1040, 280));

        jPanel9.setBackground(new java.awt.Color(100, 199, 150));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel39.setText("Item Name");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        txtsearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        jPanel9.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 740, 30));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Google_Web_Search_40px.png"))); // NOI18N
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 40, 50));

        Item.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1040, 50));

        jLabel41.setFont(new java.awt.Font("Segoe UI Black", 2, 29)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 153, 0));
        jLabel41.setText("Add New Item");
        Item.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 40));

        jLabel47.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 153, 0));
        jLabel47.setText("Search");
        Item.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTable3.setBackground(new java.awt.Color(204, 255, 204));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setEnabled(false);
        jScrollPane7.setViewportView(jTable3);

        Item.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1040, 240));

        jButton11.setBackground(new java.awt.Color(100, 199, 150));
        jButton11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton11.setText("Delete Item");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Item.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 150, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("Item ID");
        Item.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 70, 30));

        txtdel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdelActionPerformed(evt);
            }
        });
        Item.add(txtdel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Item, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Item, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void purchase_save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_save_btnActionPerformed
        tableLoad(jTable3, "select * from item");

        boolean flag = false;
        ID = getID();

        String ShipID = txtship.getText();
        if (ShipID.equals("") && flag == false)
        {
            JOptionPane.showMessageDialog(null,"Shipping ID cannot be Empty");
            flag = true;
        }
        String Name = txtname.getText();
        if (Name.equals("")&& flag == false)
        {
            JOptionPane.showMessageDialog(null,"Item Name cannot be Empty");
            flag = true;
        }
        String Brand = txtbrand.getText();
        if (Brand.equals("")&& flag == false)
        {
            JOptionPane.showMessageDialog(null,"Brand cannot be Empty");
            flag = true;
        }
        if(!Brand.matches("[a-zA-Z]+") && flag == false)
        {
            JOptionPane.showMessageDialog(null,"Brand can only consist of letters");
            flag = true;
        }
        java.util.Date Date1 = jDateChooser1.getDate();
        if (Date1 == null && flag == false)
        {
            JOptionPane.showMessageDialog(null,"Manufacture Date cannot be Empty");
            flag = true;

        }
        String Model = txtmodel.getText();
        if (Model.equals("")&& flag == false)
        {
            JOptionPane.showMessageDialog(null,"Model Code cannot be Empty");
            flag = true;
        }
        String Price = txtprice1.getText();

        if (Price.equals("") && flag == false)
        {
            JOptionPane.showMessageDialog(null,"Price cannot be Empty");
            flag = true;
        }
        if (Price != null && flag == false)
        {
            try
            {
                double val9 = Double.parseDouble(Price);
                if(val9<0 || Price.equals("-0"))
                {
                    JOptionPane.showMessageDialog(null,"Price cannot be negative");
                    flag = true;
                    txtprice1.setText("");

                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Please enter a valid Price");
                flag = true;
                txtprice1.setText("");
            }

        }

        String Discount = txtdis.getText();
        if (Discount.equals("-0"))
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid Discount");
            flag = true;
            txtdis.setText("0");
        }

        if (Discount.equals("")&& flag == false){
            JOptionPane.showMessageDialog(null,"Discount cannot be Empty");
            flag = true;

        }
        if (Discount != null && flag == false)
        {

            try
            {
                double val = Double.parseDouble(Discount);
                if ((val <0) || (val>100))
                {
                    JOptionPane.showMessageDialog(null,
                        "Discount must be 0 to 100");
                    flag = true;
                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Please enter a valid Discount");
                flag = true;
                txtdis.setText("0");
            }

        }
        String Warranty = jSpinner1.getValue().toString();
        if(Name != null && Model != null && flag == false)
        {
            try {
                flag = false;
                String SQL = "SELECT * FROM item";
                ResultSet rs = pst.executeQuery(SQL);
                while (rs.next()) {
                    String mc = rs.getString("modelCode");
                    String in = rs.getString("itemName");

                    if ((mc.equals(Model) && !in.equals(Name)) || (in.equals(Name) && !mc.equals(Model)))
                    {
                        JOptionPane.showMessageDialog(null, "ModelCode '"+mc+"' belongs to the Item '"+in+"'", "Item cannot be added",
                            JOptionPane.ERROR_MESSAGE);

                        flag = true;
                        txtmodel.setText("");
                        txtname.setText("");
                        return;
                    }

                }

            } catch (SQLException ex) {
                Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (flag == false)
        {
            try
            {
                double val1 = Double.parseDouble(Discount);
                Discount = (val1+"%");
                String strDate = DateFormat.getDateInstance().format(Date1); //convert Date to String

                String q = "INSERT INTO item(shippingID,itemID,itemName,brand,modelCode,sellingPrice,manufactureDate,warrantyPeriod,discount) "
                + "values('"+ ShipID +"','"+ ID +"','"+ Name +"','"+ Brand +"','"+ Model +"','"+ Price +"','"+ strDate +"','"+ Warranty +"'"
                + ",'"+ Discount +"')";

                pst = conn.prepareStatement(q);
                pst.execute();
            }
            catch (SQLException b)
            {
                JOptionPane.showMessageDialog(null, "Unable to insert item.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            //"
            // + "
            tableLoad(jTable3, "select * from item");
            JOptionPane.showMessageDialog(null, Name +" has been added successfully");

            txtship.setText("");
            SetItemID();
            txtprice1.setText("");
            txtname.setText("");
            txtbrand.setText("");
            txtmodel.setText("");
            txtdis.setText("0");
            jSpinner1.setValue(0);
            jDateChooser1.setCalendar(null);

            try
            {
                String sql = "INSERT INTO availablestock(modelCode,qtyInHand,reOrderLevel) values ('"+ Model +"',1,10) ON DUPLICATE KEY UPDATE qtyInHand = qtyInHand + 1";
                pst = conn.prepareStatement(sql);
                pst.execute();
            }
            catch (SQLException b)
            {
                JOptionPane.showMessageDialog(null, "Unable to update available stock.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_purchase_save_btnActionPerformed

    public String getID() {
        return txtid.getText() ;
    }
    
    public void NullValidation()
   {
        int count = 0;
//   if (txtship.)
 //      JOptionPane.showMessageDialog(null, "Shipping ID cannot be NULL");
        if (txtid.getText().equals("") && count == 0)
            JOptionPane.showMessageDialog(null, "Item ID cannot be NULL");
        txtship.setText("");
        txtid.setText("");
        txtprice1.setText("");
        txtname.setText("");
        txtbrand.setText("");
        txtdel.setText("");
        txtdis.setText("0");
        jSpinner1.setValue(0);
        jDateChooser1.setCalendar(null);
   }
    
    public void SetItemID()
   {
        try {
            String sql = "select itemID from item ORDER BY itemID DESC LIMIT 1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String id = rs.getString("itemId");
                int len = id.length(); //get length of string
                String letters = id.substring(0,2);
                String numbers = id.substring(2,len);
                int inc = Integer.parseInt(numbers);
                inc++;
                numbers = Integer.toString(inc);
                txtid.setText(letters+numbers);
            }
            else
            {
                 txtid.setText("IT10000001");   
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tableLoad(jTable3, "select * from item");
        txtsearch.setText("");
        txtship.setText("");
        //txtid.setText("");
        txtprice1.setText("");
        txtname.setText("");
        txtbrand.setText("");
        txtdel.setText("");
        txtmodel.setText("");
        txtdis.setText("0");
        jSpinner1.setValue(0);
        jDateChooser1.setCalendar(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange

        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setEditable(false);
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void txtmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodelActionPerformed

    private void txtdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdisActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        String key = txtsearch.getText();
        try {
            String z = "SELECT * FROM item where itemName LIKE '%"+ key +"%'";
            pst = conn.prepareStatement(z);
            rs = pst.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel40MouseClicked
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?");
        if (x == 0) //User clicks yes
        {

            String id = txtdel.getText();
            String q = "DELETE FROM item WHERE itemID = '" + id + "'";
            try {
                pst = conn.prepareStatement(q);
                int deleted = pst.executeUpdate(q);
                tableLoad(jTable3, "select * from item");
                if (deleted != 0)
                {
                    JOptionPane.showMessageDialog(null, id +" has been successfully deleted");
                    txtdel.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Could not find "+ id, "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            } catch (SQLException ex) {
                Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            //txtdel.setText("");

        }
        SetItemID();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txtdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Item;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton purchase_save_btn;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtdel;
    private javax.swing.JTextField txtdis;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice1;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtship;
    // End of variables declaration//GEN-END:variables
}
