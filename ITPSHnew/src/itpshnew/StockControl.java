package itpshnew;

import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
/**
 @author Sonal
*/


public class StockControl extends javax.swing.JFrame {
    private String ID;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    /**
     * Creates new form purchase
     */
    public StockControl() {
        conn = dbCon.connect();
        this.setUndecorated(true);
        //this.setAlwaysOnTop(true);
        this.setResizable(true);
        //jLabel57.setVisible(false);
       // jTable2.getTableHeader().setReorderingAllowed(false);
        initComponents();
        SetItemID();
        tableload();
       // tableload2();
        setColor(topic2);   //set the colour to purchase bar
        bar2.setOpaque(true);
        
        setlabelcolor(vendor); // set the purchase label colour as default one
        //JDateChooser chooser = new JDateChooser();
        jDateChooser1.setMaxSelectableDate(new Date());
        
        
        //time
        TimerThread timer = new TimerThread(time); // create timer object and set the time on time label
        timer.start();
        date.setText(DateTimeFunctions.getDate()); // call getdate method on date label

       
        
        
    }
   public void NullValidation()
   {
   int count = 0;
//   if (txtship.)
 //      JOptionPane.showMessageDialog(rootPane, "Shipping ID cannot be NULL");
   if (txtid.getText() == "" && count == 0)
       JOptionPane.showMessageDialog(rootPane, "Item ID cannot be NULL");
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
    
   public void tableload()
    {
          try {
              String q = "select * FROM item";
              
              pst = (PreparedStatement) conn.prepareStatement(q);
              
              rs = pst.executeQuery();
              jTable3.setModel(DbUtils.resultSetToTableModel(rs));
              
              
        } catch (Exception e1) {
        }
    }
   public void tableload2()
    {
          try {
              String wq = "select * from availablestock";
              pst = (PreparedStatement) conn.prepareStatement(wq);
              
              rs = pst.executeQuery();
              jTable2.setModel(DbUtils.resultSetToTableModel(rs));
              
              
        } catch (Exception e1) {
        }
    }
   public void tableload3()
    {
          try {
              String wq = "select * from reorder";
              pst = (PreparedStatement) conn.prepareStatement(wq);
              
              rs = pst.executeQuery();
              jTable2.setModel(DbUtils.resultSetToTableModel(rs));
              
              
        } catch (Exception e1) {
        }
    }
   //
   public void SetItemID()
   {
        try {
            String sql = "select itemID from item ORDER BY itemID DESC LIMIT 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String id = rs.getString("itemId");
                int len = id.length(); //get length of string
                String letters = id.substring(0,2);
                String numbers = id.substring(2,len);
                int inc = Integer.parseInt(numbers);
                inc = inc + 1;
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
   public void SetReorderID()
   {
        try {
            String sql = "select reOrderID from reorder ORDER BY reOrderID DESC LIMIT 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String id = rs.getString("reOrderID");
                int len = id.length(); //get length of string
                String letters = id.substring(0,2);
                String numbers = id.substring(2,len);
                int inc = Integer.parseInt(numbers);
                inc = inc + 1;
                numbers = Integer.toString(inc);
                txtcb4.setText(letters+numbers);
            }
            else
            {
                 txtcb4.setText("RE10000001");   
            }
                
                
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
        }
       JTable jTable2 = new JTable() {
        private static final long serialVersionUID = 1L;

        @Override
        public boolean isCellEditable(int row, int column) {   //disable jtable editing             
                return false;               
        };
    };
   
   }

            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_cusdet_gender = new javax.swing.ButtonGroup();
        puchase_paytype = new javax.swing.ButtonGroup();
        solution_combo = new javax.swing.JComboBox<>();
        sidepanel = new javax.swing.JPanel();
        topic1 = new javax.swing.JPanel();
        bar1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        topic2 = new javax.swing.JPanel();
        bar2 = new javax.swing.JPanel();
        pic3 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        topic3 = new javax.swing.JPanel();
        bar3 = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        topic4 = new javax.swing.JPanel();
        bar4 = new javax.swing.JPanel();
        name3 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        topic5 = new javax.swing.JPanel();
        bar5 = new javax.swing.JPanel();
        name4 = new javax.swing.JLabel();
        pic4 = new javax.swing.JLabel();
        topic6 = new javax.swing.JPanel();
        bar6 = new javax.swing.JPanel();
        name5 = new javax.swing.JLabel();
        pic5 = new javax.swing.JLabel();
        topic7 = new javax.swing.JPanel();
        bar7 = new javax.swing.JPanel();
        name6 = new javax.swing.JLabel();
        pic6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        topic8 = new javax.swing.JPanel();
        bar8 = new javax.swing.JPanel();
        name7 = new javax.swing.JLabel();
        pic7 = new javax.swing.JLabel();
        emp_name = new javax.swing.JLabel();
        emp_id = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        topbar = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        vendor = new javax.swing.JLabel();
        retail = new javax.swing.JLabel();
        adddetail = new javax.swing.JLabel();
        adddetail1 = new javax.swing.JLabel();
        center = new javax.swing.JPanel();
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
        Stock = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtmdl1 = new javax.swing.JTextField();
        txtqty2 = new javax.swing.JTextField();
        txtnro = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtpro = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        txtsearch2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        txtsearch3 = new javax.swing.JTextField();
        searchme = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtvendor = new javax.swing.JTextField();
        txtbudget = new javax.swing.JTextField();
        txtqty1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txtup2 = new javax.swing.JTextField();
        txtcb4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtmc = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtbrand2 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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

        solution_combo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        solution_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Replace", "Repair", " " }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(0, 153, 153));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topic1.setBackground(new java.awt.Color(0, 153, 153));
        topic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bar1MousePressed(evt);
            }
        });
        topic1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar1.setOpaque(false);
        bar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bar1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout bar1Layout = new javax.swing.GroupLayout(bar1);
        bar1.setLayout(bar1Layout);
        bar1Layout.setHorizontalGroup(
            bar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar1Layout.setVerticalGroup(
            bar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        topic1.add(bar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText(" Home");
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bar1MousePressed(evt);
            }
        });
        topic1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Home_48px.png"))); // NOI18N
        topic1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 60));

        topic2.setBackground(new java.awt.Color(0, 153, 153));
        topic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic2MousePressed(evt);
            }
        });
        topic2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar2.setBackground(new java.awt.Color(255, 255, 255));
        bar2.setOpaque(false);
        bar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout bar2Layout = new javax.swing.GroupLayout(bar2);
        bar2.setLayout(bar2Layout);
        bar2Layout.setHorizontalGroup(
            bar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar2Layout.setVerticalGroup(
            bar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        topic2.add(bar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Warehouse_40px.png"))); // NOI18N
        pic3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                name3MousePressed(evt);
            }
        });
        topic2.add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        name1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Stock");
        name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic2MousePressed(evt);
            }
        });
        topic2.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        sidepanel.add(topic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 60));

        topic3.setBackground(new java.awt.Color(0, 153, 153));
        topic3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar3.setOpaque(false);

        javax.swing.GroupLayout bar3Layout = new javax.swing.GroupLayout(bar3);
        bar3.setLayout(bar3Layout);
        bar3Layout.setHorizontalGroup(
            bar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar3Layout.setVerticalGroup(
            bar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        topic3.add(bar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("  Repair");
        topic3.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Maintenance_40px.png"))); // NOI18N
        topic3.add(pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 290, 60));

        topic4.setBackground(new java.awt.Color(0, 153, 153));
        topic4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                name3MousePressed(evt);
            }
        });
        topic4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar4.setOpaque(false);
        bar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                name3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout bar4Layout = new javax.swing.GroupLayout(bar4);
        bar4.setLayout(bar4Layout);
        bar4Layout.setHorizontalGroup(
            bar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar4Layout.setVerticalGroup(
            bar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        topic4.add(bar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText("Sales");
        name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                name3MousePressed(evt);
            }
        });
        topic4.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Cash_Register_40px_1.png"))); // NOI18N
        pic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic2MousePressed(evt);
            }
        });
        topic4.add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 290, 60));

        topic5.setBackground(new java.awt.Color(0, 153, 153));
        topic5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar5.setOpaque(false);

        javax.swing.GroupLayout bar5Layout = new javax.swing.GroupLayout(bar5);
        bar5.setLayout(bar5Layout);
        bar5Layout.setHorizontalGroup(
            bar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar5Layout.setVerticalGroup(
            bar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        topic5.add(bar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name4.setForeground(new java.awt.Color(255, 255, 255));
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name4.setText("           Distribution");
        topic5.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Delivered_40px.png"))); // NOI18N
        topic5.add(pic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 290, 60));

        topic6.setBackground(new java.awt.Color(0, 153, 153));
        topic6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic6MousePressed(evt);
            }
        });
        topic6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar6.setOpaque(false);
        bar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout bar6Layout = new javax.swing.GroupLayout(bar6);
        bar6.setLayout(bar6Layout);
        bar6Layout.setHorizontalGroup(
            bar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar6Layout.setVerticalGroup(
            bar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        topic6.add(bar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name5.setForeground(new java.awt.Color(255, 255, 255));
        name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name5.setText("    Finance");
        name5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic6MousePressed(evt);
            }
        });
        topic6.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Money_Bag_40px.png"))); // NOI18N
        pic5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic6MousePressed(evt);
            }
        });
        topic6.add(pic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 290, 60));

        topic7.setBackground(new java.awt.Color(0, 153, 153));
        topic7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar7.setOpaque(false);

        javax.swing.GroupLayout bar7Layout = new javax.swing.GroupLayout(bar7);
        bar7.setLayout(bar7Layout);
        bar7Layout.setHorizontalGroup(
            bar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar7Layout.setVerticalGroup(
            bar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        topic7.add(bar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name6.setForeground(new java.awt.Color(255, 255, 255));
        name6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name6.setText("HR");
        topic7.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 230, 40));

        pic6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_User_Group_Man_Man_40px.png"))); // NOI18N
        topic7.add(pic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 290, 60));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("City Mobile");
        sidepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 60));
        sidepanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 270, 20));
        sidepanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 10));

        topic8.setBackground(new java.awt.Color(0, 153, 153));
        topic8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar8.setOpaque(false);

        javax.swing.GroupLayout bar8Layout = new javax.swing.GroupLayout(bar8);
        bar8.setLayout(bar8Layout);
        bar8Layout.setHorizontalGroup(
            bar8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar8Layout.setVerticalGroup(
            bar8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        topic8.add(bar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name7.setForeground(new java.awt.Color(255, 255, 255));
        name7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name7.setText("   Web");
        topic8.add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 230, 40));

        pic7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Web_Design_40px.png"))); // NOI18N
        topic8.add(pic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 290, 60));

        emp_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emp_name.setForeground(new java.awt.Color(255, 255, 255));
        emp_name.setText("E.N. Employee Name ");
        sidepanel.add(emp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 210, 50));

        emp_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emp_id.setForeground(new java.awt.Color(255, 255, 255));
        emp_id.setText("EI1725478963");
        sidepanel.add(emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, 210, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Employee_Card_80px.png"))); // NOI18N
        sidepanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 80, 100));

        getContentPane().add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 810));

        topbar.setBackground(new java.awt.Color(0, 204, 204));
        topbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Close_Window_40px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        topbar.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, 49));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Minimize_Window_40px.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        topbar.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, -1, 50));

        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("Time");
        topbar.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 90, 50));

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date with calender");
        topbar.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 190, 50));

        vendor.setBackground(new java.awt.Color(0, 204, 204));
        vendor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vendor.setForeground(new java.awt.Color(255, 255, 255));
        vendor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vendor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Warranty_Card_30px_2.png"))); // NOI18N
        vendor.setText("  New Item");
        vendor.setOpaque(true);
        vendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendorMouseClicked(evt);
            }
        });
        topbar.add(vendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        retail.setBackground(new java.awt.Color(0, 204, 204));
        retail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        retail.setForeground(new java.awt.Color(255, 255, 255));
        retail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        retail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_New_Product_30px_1.png"))); // NOI18N
        retail.setText("  Current Stock");
        retail.setOpaque(true);
        retail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retailMouseEntered(evt);
            }
        });
        topbar.add(retail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 200, 50));

        adddetail.setBackground(new java.awt.Color(0, 204, 204));
        adddetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adddetail.setForeground(new java.awt.Color(255, 255, 255));
        adddetail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adddetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Combo_Chart_30px.png"))); // NOI18N
        adddetail.setText("  Stock Reports");
        adddetail.setOpaque(true);
        adddetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adddetailMouseClicked(evt);
            }
        });
        topbar.add(adddetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 190, 50));

        adddetail1.setBackground(new java.awt.Color(0, 204, 204));
        adddetail1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adddetail1.setForeground(new java.awt.Color(255, 255, 255));
        adddetail1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adddetail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Calculator_24px_4.png"))); // NOI18N
        adddetail1.setOpaque(true);
        adddetail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adddetail1MouseClicked(evt);
            }
        });
        topbar.add(adddetail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 50));

        getContentPane().add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1090, 50));

        center.setBackground(new java.awt.Color(199, 238, 238));
        center.setLayout(new java.awt.CardLayout());

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
        txtship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtshipActionPerformed(evt);
            }
        });
        jPanel4.add(txtship, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 220, 25));

        txtid.setEditable(false);
        txtid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtid.setBorder(null);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel4.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 220, 25));

        txtname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
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

        center.add(Item, "card2");

        Stock.setBackground(new java.awt.Color(202, 254, 227));
        Stock.setAutoscrolls(true);
        Stock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(100, 199, 150));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel20.setText("Model Code");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel21.setText("Quantity in Hand");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, -1));

        txtmdl1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtmdl1.setBorder(null);
        jPanel8.add(txtmdl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 260, 25));

        txtqty2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtqty2.setBorder(null);
        txtqty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqty2ActionPerformed(evt);
            }
        });
        jPanel8.add(txtqty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 260, 25));

        txtnro.setBorder(null);
        txtnro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnroActionPerformed(evt);
            }
        });
        jPanel8.add(txtnro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 260, 25));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel22.setText("Current Re-Order Level");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel55.setText("New Re-Order Level");
        jPanel8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtpro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtpro.setBorder(null);
        txtpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproActionPerformed(evt);
            }
        });
        jPanel8.add(txtpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 260, 25));

        jButton24.setBackground(new java.awt.Color(100, 199, 150));
        jButton24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton24.setText("Default Limit");
        jButton24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 120, 30));

        jButton25.setBackground(new java.awt.Color(100, 199, 150));
        jButton25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton25.setText("Set Limit");
        jButton25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 130, 30));

        Stock.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 520, 210));

        jButton12.setBackground(new java.awt.Color(48, 214, 48));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Reset_40px.png"))); // NOI18N
        jButton12.setText("Refresh");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        Stock.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 640, 240, 60));

        jPanel10.setBackground(new java.awt.Color(100, 199, 150));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel48.setText("Model Code");
        jPanel10.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        txtsearch2.setBorder(null);
        txtsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch2ActionPerformed(evt);
            }
        });
        jPanel10.add(txtsearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 740, 30));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Google_Web_Search_40px.png"))); // NOI18N
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 40, 50));

        Stock.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1040, 50));

        jLabel50.setFont(new java.awt.Font("Segoe UI Black", 2, 29)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 153, 0));
        jLabel50.setText("Set Re-Order Level");
        Stock.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 340, 120));

        jPanel12.setBackground(new java.awt.Color(100, 199, 150));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel57.setText("Reorder Brand");
        jPanel12.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        txtsearch3.setBorder(null);
        txtsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch3ActionPerformed(evt);
            }
        });
        jPanel12.add(txtsearch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 740, 30));

        searchme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Google_Web_Search_40px.png"))); // NOI18N
        searchme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchmeMouseClicked(evt);
            }
        });
        jPanel12.add(searchme, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 40, 50));

        Stock.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1040, 50));

        jLabel51.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 153, 0));
        jLabel51.setText("Search");
        Stock.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(100, 199, 150));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setText("Vendor ID");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 140, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel15.setText("Model Code");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 60));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Quantity");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtvendor.setBorder(null);
        jPanel5.add(txtvendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 310, 25));

        txtbudget.setBorder(null);
        jPanel5.add(txtbudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 310, 25));

        txtqty1.setBorder(null);
        txtqty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqty1ActionPerformed(evt);
            }
        });
        jPanel5.add(txtqty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 140, 25));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel17.setText("Unit Price");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jButton8.setBackground(new java.awt.Color(100, 199, 150));
        jButton8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton8.setText("Re-Order Now");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 150, 30));

        jButton9.setBackground(new java.awt.Color(100, 199, 150));
        jButton9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton9.setText("Clear");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 150, 30));

        txtup2.setBorder(null);
        txtup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtup2ActionPerformed(evt);
            }
        });
        jPanel5.add(txtup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 140, 25));

        txtcb4.setBorder(null);
        txtcb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcb4ActionPerformed(evt);
            }
        });
        jPanel5.add(txtcb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 310, 25));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel19.setText("Brand");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 60));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel23.setText("Re-Order ID");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtmc.setBorder(null);
        txtmc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmcActionPerformed(evt);
            }
        });
        jPanel5.add(txtmc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 310, 25));

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel29.setText("Company Budget");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, 170, 50));

        txtbrand2.setBorder(null);
        txtbrand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrand2ActionPerformed(evt);
            }
        });
        jPanel5.add(txtbrand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 310, 25));

        Stock.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 500, 290));

        jButton14.setBackground(new java.awt.Color(48, 214, 48));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Eye_48px.png"))); // NOI18N
        jButton14.setText("View Re-Orders");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Stock.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 260, 60));

        jLabel56.setFont(new java.awt.Font("Segoe UI Black", 2, 29)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 153, 0));
        jLabel56.setText("Re-Order");
        Stock.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 100));

        jButton16.setBackground(new java.awt.Color(100, 199, 150));
        jButton16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Speedometer_48px.png"))); // NOI18N
        jButton16.setText("Suggested Re-Orders");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        Stock.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 230, 50));

        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setDragEnabled(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        Stock.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1040, 240));

        center.add(Stock, "card3");

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
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, -1));

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
        jLabel28.setText("Annualy");
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

        center.add(Reports, "card4");

        getContentPane().add(center, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 1090, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bar1MousePressed
        
        
        home h1 = new home(); // go to home page
        h1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bar1MousePressed

    private void topic2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topic2MousePressed
       /* setColor(topic2);   //set the colour
        bar2.setOpaque(true);  */
        
        
    }//GEN-LAST:event_topic2MousePressed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        //JFrame frame = new JFrame("test");   //minimize label
         this.setExtendedState(JFrame.ICONIFIED);
         
         
         
         
    }//GEN-LAST:event_minimizeMouseClicked

    private void topic6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topic6MousePressed
        TodayFinancialSystem h1 = new TodayFinancialSystem(); // go to TodayFinancialSystem
        h1.setVisible(true);
        this.setVisible(false);//dispose the current form 
    }//GEN-LAST:event_topic6MousePressed

    private void name3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name3MousePressed
        
    }//GEN-LAST:event_name3MousePressed

    private void vendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendorMouseClicked
        SetItemID();
        setlabelcolor(vendor);
        resettlabelcolor(retail);
        resettlabelcolor(adddetail);
        Item.setVisible(true);
        Stock.setVisible(false);
        Reports.setVisible(false);
    }//GEN-LAST:event_vendorMouseClicked

    private void retailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retailMouseClicked
            //jTable2.setEnabled(false);
            jTable2.setDefaultEditor(Object.class, null); //cannot change jtablevalues
            jTable2.getTableHeader().setReorderingAllowed(false); //cannot change cols
            txtcb4.setEditable(false);
            txtmdl1.setEditable(false);
            txtqty2.setEditable(false);
            txtpro.setEditable(false);
            SetReorderID();
            jPanel10.setVisible(true);
            jPanel12.setVisible(false);
            setlabelcolor(retail);
            resettlabelcolor(vendor);
            resettlabelcolor(adddetail);
            Stock.setVisible(true);
            Item.setVisible(false);
            Reports.setVisible(false);
           tableload2();
    }//GEN-LAST:event_retailMouseClicked

    private void adddetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddetailMouseClicked
        
        setlabelcolor(adddetail);
        resettlabelcolor(retail);
        resettlabelcolor(vendor);
        Reports.setVisible(true);
        Item.setVisible(false);
        Stock.setVisible(false);
    }//GEN-LAST:event_adddetailMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        txtbudget.setText("");
        txtvendor.setText("");
        txtmc.setText("");
        txtqty1.setText("");
        txtup2.setText("");
        txtbrand2.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        boolean goal = false;
        //SetReorderID();
        
        //JOptionPane.showMessageDialog(null,"Shipping ID cannot be Empty" + rID);
        String Budget = txtbudget.getText();
        String Vendor = txtvendor.getText();
        if (Vendor.equals("") && goal == false){
            JOptionPane.showMessageDialog(null,"Vendor ID cannot be Empty");
            goal = true;
        }
        
        String Brand = txtbrand2.getText();
        if (Brand.equals("") && goal == false){
            JOptionPane.showMessageDialog(null,"Brand cannot be Empty");
            goal = true;
        }
        if(!Brand.matches("[a-zA-Z]+") && goal == false){
            JOptionPane.showMessageDialog(null,"Brand can only consist of letters");
            goal = true;
            }
        boolean geo = false;
        String Model = txtmc.getText();
        if (Model.equals("") && goal == false){
            JOptionPane.showMessageDialog(null,"Model Code cannot be Empty");
            goal = true;
             
        }
        int count = 0;
        if (!Model.equals("") && goal == false)
        {
        try {
             
             String SQL = "SELECT * FROM item";
             ResultSet rs = pst.executeQuery(SQL);
             while (rs.next()) {
             String mc = rs.getString("modelCode");
                        
             if (Model.equals(mc))
                 {
                  count = count + 1;                           
                 }
                          
             }
             if(count == 0){
                int x = JOptionPane.showConfirmDialog(null, "This is a New Product, Do you still wish to ReOrder?");
                    if (x == 0){
                        geo = false;
                    }
             }
             else
                 geo = false;
         } catch (SQLException ex) {
             Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
         }
     
        
        
        
        
        }
        
        String CB = txtbudget.getText();
        if (CB.equals("") && goal == false){
            JOptionPane.showMessageDialog(null,"Company Budget cannot be Empty");
            goal = true;
        }
        String qty = txtqty1.getText();
        if (qty.equals("") && goal == false){
            JOptionPane.showMessageDialog(null,"Quantity cannot be Empty");
            goal = true;
        }
        String Price = txtup2.getText();
        if (Price.equals("") && goal == false){
            JOptionPane.showMessageDialog(null,"Price cannot be Empty");
            goal = true;
        }
        
        String reorder = txtcb4.getText();
        if (goal == false && geo == false){
            
            try{
            double total = Double.parseDouble(Price) * Double.parseDouble(qty);
            double current = Double.parseDouble(Budget);
            if (total<current){
            String b = "INSERT INTO reorder(reOrderID,vendorID,brand,modelCode,qty,totalCost,RequestDate,RequestTime) "
                    + " values ('"+ reorder +"','"+ Vendor +"','"+ Brand +"','"+ Model +"','"+ qty +"','"+ total +"','"+ date.getText() +"','"+ time.getText() +"')";
            pst = (PreparedStatement) conn.prepareStatement(b);
            pst.execute();
            SetReorderID();
            
           }
           else
           {
               JOptionPane.showMessageDialog(new JFrame(),"Company cannot afford Rs. "+total+"/-", "Cannot place Re-Order",
        JOptionPane.ERROR_MESSAGE);
               
           }
        
        }
           catch (Exception b)
           {}
        
        tableload3(); 
    }//GEN-LAST:event_jButton8ActionPerformed
    }
    private void txtqty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqty1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqty1ActionPerformed

    private void txtsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch2ActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tableload();
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

    private void purchase_save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_save_btnActionPerformed
     tableload();
     
     boolean flag = false;
     ID = getID();
     
     String ShipID = txtship.getText();
     if (ShipID.equals("") && flag == false){
            JOptionPane.showMessageDialog(null,"Shipping ID cannot be Empty");
            flag = true;
     }
     String Name = txtname.getText();
     if (Name.equals("")&& flag == false){
            JOptionPane.showMessageDialog(null,"Item Name cannot be Empty");
            flag = true;
     }
     String Brand = txtbrand.getText();
     if (Brand.equals("")&& flag == false){
            JOptionPane.showMessageDialog(null,"Brand cannot be Empty");
            flag = true;
     }
     if(!Brand.matches("[a-zA-Z]+") && flag == false){
            JOptionPane.showMessageDialog(null,"Brand can only consist of letters");
            flag = true;
            }
     Date Date1 = jDateChooser1.getDate();
     if (Date1 == null && flag == false){
            JOptionPane.showMessageDialog(null,"Manufacture Date cannot be Empty");
            flag = true;
            
     
     }
     String Model = txtmodel.getText();
     if (Model.equals("")&& flag == false){
            JOptionPane.showMessageDialog(null,"Model Code cannot be Empty");
            flag = true;
     }
     String Price = txtprice1.getText();
     
     
     if (Price.equals("")&& flag == false)
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
                     JOptionPane.showMessageDialog(new JFrame(),"ModelCode '"+mc+"' belongs to the Item '"+in+"'", "Item cannot be added",
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
     
     if (flag == false){
         
         try{
         double val1 = Double.parseDouble(Discount);
         Discount = (val1+"%");
         String strDate = DateFormat.getDateInstance().format(Date1); //convert Date to String
        
            String q = "INSERT INTO item(shippingID,itemID,itemName,brand,modelCode,sellingPrice,manufactureDate,warrantyPeriod,discount) "
                    + "values('"+ ShipID +"','"+ ID +"','"+ Name +"','"+ Brand +"','"+ Model +"','"+ Price +"','"+ strDate +"','"+ Warranty +"'"
                    + ",'"+ Discount +"')";
            
            
            pst = (PreparedStatement) conn.prepareStatement(q);
            pst.execute();
           }
           catch (Exception b)
           {}
        
            //"
                   // + "
        tableload();
        JOptionPane.showMessageDialog(rootPane, Name +" has been added successfully");
        
        txtship.setText("");
        SetItemID();
        txtprice1.setText("");
        txtname.setText("");
        txtbrand.setText("");
        txtmodel.setText("");
        txtdis.setText("0");
        jSpinner1.setValue(0);
        jDateChooser1.setCalendar(null);
        
        try{
            String sql = "INSERT INTO availablestock(modelCode,qtyInHand,reOrderLevel) values ('"+ Model +"',1,10) ON DUPLICATE KEY UPDATE qtyInHand = qtyInHand + 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
           }
           catch (Exception b)
           {}

        }
    }//GEN-LAST:event_purchase_save_btnActionPerformed
    
    
    public String getID() {
        return txtid.getText() ;
    }

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
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

    private void retailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retailMouseEntered
        
    }//GEN-LAST:event_retailMouseEntered

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        String key = txtsearch.getText();
        try {
            String z = "SELECT * FROM item where itemName LIKE '%"+ key +"%'";
            pst = (PreparedStatement) conn.prepareStatement(z);
            rs = pst.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
         String key = txtsearch2.getText();
        try {
            String z1 = "SELECT * FROM availablestock where modelCode LIKE '%"+ key +"%'";
            pst = (PreparedStatement) conn.prepareStatement(z1);
            rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        tableload2();
        txtqty1.setText("");
        txtbrand2.setText("");
        txtsearch3.setText("");
        txtnro.setText("");
        txtup2.setText("");
        txtvendor.setText("");
        txtbudget.setText("");
        txtsearch2.setText("");
        txtmc.setText("");
        jPanel10.setVisible(true);
        jTable2.setEnabled(true);
       //jLabel49.setVisible(true);
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?");
       if (x == 0) //User clicks yes
       {
           
               String id = txtdel.getText();
               String q = "DELETE FROM item WHERE itemID = '" + id + "'";
               try {
               pst = (PreparedStatement) conn.prepareStatement(q);
               int deleted = pst.executeUpdate(q);
               tableload();
               tableload2();
               if (deleted != 0) {
                    JOptionPane.showMessageDialog(rootPane, id +" has been successfully deleted");
                    txtdel.setText("");
               }
               else {
                    JOptionPane.showMessageDialog(null, "Could not find "+ id);
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

    private void txtqty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqty2ActionPerformed

    private void txtnroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnroActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        tableload3();
        jPanel12.setVisible(true);
        jPanel10.setVisible(false);
        jTable2.setEnabled(false);
        //jLabel49.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void txtproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        String nro = txtnro.getText();
        if(!nro.equals("")){
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to change the ReOrder Level?");
       if (x == 0){
        try {
            String model = txtmdl1.getText();
            //String nro = txtnro.getText();
            String t = "Update availablestock SET reOrderLevel = '"+ nro +"' WHERE modelCode = '"+ model +"'";
            pst = (PreparedStatement) conn.prepareStatement(t);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        tableload2();
        
        //String nro = txtnro.getText();
        String model = txtmdl1.getText();
        txtpro.setText(nro);
        JOptionPane.showMessageDialog(rootPane, " ReOrder Level of "+ model +" set to "+nro);
        txtnro.setText("");
    }//GEN-LAST:event_jButton25ActionPerformed
    }
    else
        {
            JOptionPane.showMessageDialog(rootPane, "New ReOrder Level cannot be empty");
        }
    }
    private void txtshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtshipActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        
((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setEditable(false); 
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void txtup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtup2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtup2ActionPerformed

    private void adddetail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddetail1MouseClicked
        setlabelcolor(adddetail1);// TODO add your handling code here:
        adddetail1.setVisible(true);
                
    }//GEN-LAST:event_adddetail1MouseClicked

    private void txtsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch3ActionPerformed

    private void searchmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchmeMouseClicked
        String key = txtsearch3.getText();
        try {
            String z1 = "SELECT * FROM reorder where brand LIKE '%"+ key +"%'";
            pst = (PreparedStatement) conn.prepareStatement(z1);
            rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchmeMouseClicked

    private void txtcb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcb4ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        try {
            String model = txtmdl1.getText();
            String t = "Update availablestock SET reOrderLevel = 10 WHERE modelCode = '"+ model +"'";
            pst = (PreparedStatement) conn.prepareStatement(t);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        tableload2();
        txtpro.setText("10");
        txtnro.setText("");
        String model = txtmdl1.getText();
        JOptionPane.showMessageDialog(rootPane, " ReOrder Level of "+ model +" set to 10");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void txtmcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmcActionPerformed

    private void txtbrand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrand2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbrand2ActionPerformed

    private void txtdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdisActionPerformed

    private void txtmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodelActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
        int r = jTable2.getSelectedRow();
        String mc = jTable2.getValueAt(r,0).toString();
        String qty = jTable2.getValueAt(r,1).toString();
        String level = jTable2.getValueAt(r,2).toString();
        
        txtmdl1.setText(mc);
        txtqty2.setText(qty);
        txtpro.setText(level);
        }
        catch(Exception e)
        {}
        
    }//GEN-LAST:event_jTable2MouseClicked
    
        void setColor(JPanel pl) //set the colour after  click
        {
            pl.setBackground(new Color (0,204,204));
        }
        
        /*void resetColour (JPanel pl)
        {
            pl.setBackground(new Color(0,153,153));
        }*/
        void setlabelcolor(JLabel label) //set the colour after  click
        {
            label.setBackground(new Color (0,153,153));
        }
        void resettlabelcolor(JLabel label) //set the colour after  click
        {
            label.setBackground(new Color (0,204,204));
        }
    /**
     * @param args the command line arguments
     */
        //Nimbus or Windows
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StockControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockControl().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Item;
    private javax.swing.JPanel Reports;
    private javax.swing.JPanel Stock;
    private javax.swing.JLabel adddetail;
    private javax.swing.JLabel adddetail1;
    private javax.swing.JPanel bar1;
    private javax.swing.JPanel bar2;
    private javax.swing.JPanel bar3;
    private javax.swing.JPanel bar4;
    private javax.swing.JPanel bar5;
    private javax.swing.JPanel bar6;
    private javax.swing.JPanel bar7;
    private javax.swing.JPanel bar8;
    private javax.swing.ButtonGroup bg_cusdet_gender;
    private javax.swing.JPanel center;
    private javax.swing.JLabel close;
    private javax.swing.JLabel date;
    private javax.swing.JLabel emp_id;
    private javax.swing.JLabel emp_name;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    private javax.swing.JLabel pic7;
    private javax.swing.ButtonGroup puchase_paytype;
    private javax.swing.JButton purchase_save_btn;
    private javax.swing.JLabel retail;
    private javax.swing.JLabel searchme;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JComboBox<String> solution_combo;
    private javax.swing.JLabel time;
    private javax.swing.JPanel topbar;
    private javax.swing.JPanel topic1;
    private javax.swing.JPanel topic2;
    private javax.swing.JPanel topic3;
    private javax.swing.JPanel topic4;
    private javax.swing.JPanel topic5;
    private javax.swing.JPanel topic6;
    private javax.swing.JPanel topic7;
    private javax.swing.JPanel topic8;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtbrand2;
    private javax.swing.JTextField txtbudget;
    private javax.swing.JTextField txtcb4;
    private javax.swing.JTextField txtdel;
    private javax.swing.JTextField txtdis;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmc;
    private javax.swing.JTextField txtmdl1;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnro;
    private javax.swing.JTextField txtprice1;
    private javax.swing.JTextField txtpro;
    private javax.swing.JTextField txtqty1;
    private javax.swing.JTextField txtqty2;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsearch2;
    private javax.swing.JTextField txtsearch3;
    private javax.swing.JTextField txtship;
    private javax.swing.JTextField txtup2;
    private javax.swing.JTextField txtvendor;
    private javax.swing.JLabel vendor;
    // End of variables declaration//GEN-END:variables
}
