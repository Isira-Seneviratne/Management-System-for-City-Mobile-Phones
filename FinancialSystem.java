/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

import java.awt.Color;
import javax.swing.*;
import javafx.embed.swing.JFXPanel;
import java.sql.*;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Thareendra
 */
public class FinancialSystem extends JFrame {

    /**
     * Creates new form FinancialSystem
     */
    public FinancialSystem() {
        
        this.setUndecorated(true);
        //this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        cent = new JFXPanel();
        initJFXPanel();
        this.add(cent);
        cent.setScene(scene);
        initComponents();
        
        setColor(topic6);   //set the colour to FinancialSystem bar
        bar6.setOpaque(true);
    }
    
    private static void dbConnect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ManagementSystem", "Admin", "abcd1234");
        }
        catch(ClassNotFoundException ce)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Driver Error");
            alert.setHeaderText("Error");
            alert.setContentText("Unable to load the database driver.");
            
            alert.showAndWait();
        }
        catch(SQLException se)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Connection Error");
            alert.setHeaderText("Error");
            alert.setContentText("Unable to connect to the database.");
            
            alert.showAndWait();
        }
    }
    
    private static void calculateResults()
    {
        dbConnect();
    }
    
    private static void generateReport()
    {
        dbConnect();
    }
    
    private void initJFXPanel()
    {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);
        
        final Label lrepair_rev = new Label("Repair revenue: ");
        GridPane.setConstraints(lrepair_rev, 0, 0);
        GridPane.setHalignment(lrepair_rev, HPos.RIGHT);
        grid.getChildren().add(lrepair_rev);
        
        final TextField repair_rev = new TextField();
        GridPane.setConstraints(repair_rev, 1, 0);
        grid.getChildren().add(repair_rev);
        
        final Label lrepair_cost = new Label("Repair costs: ");
        GridPane.setConstraints(lrepair_cost, 0, 1);
        GridPane.setHalignment(lrepair_cost, HPos.RIGHT);
        grid.getChildren().add(lrepair_cost);
        
        final TextField repair_cost = new TextField();
        GridPane.setConstraints(repair_cost, 1, 1);
        grid.getChildren().add(repair_cost);

        final Label lrepair_prof = new Label("Repair profit: ");
        GridPane.setConstraints(lrepair_prof, 0, 2);
        GridPane.setHalignment(lrepair_prof, HPos.RIGHT);
        grid.getChildren().add(lrepair_prof);
        
        final TextField repair_profit = new TextField();
        GridPane.setConstraints(repair_profit, 1, 2);
        grid.getChildren().add(repair_profit);

        final Label lsales_rev = new Label("Sales revenue: ");
        GridPane.setConstraints(lsales_rev, 2, 0);
        GridPane.setHalignment(lsales_rev, HPos.RIGHT);
        grid.getChildren().add(lsales_rev);
        
        final TextField sales_rev = new TextField();
        GridPane.setConstraints(sales_rev, 3, 0);
        grid.getChildren().add(sales_rev);
        
        final Label lsales_cost = new Label("Sales costs: ");
        GridPane.setConstraints(lsales_cost, 2, 1);
        GridPane.setHalignment(lsales_cost, HPos.RIGHT);
        grid.getChildren().add(lsales_cost);
        
        final TextField sales_loss = new TextField();
        GridPane.setConstraints(sales_loss, 3, 1);
        grid.getChildren().add(sales_loss);
        
        final Label lsales_prof = new Label("Sales profit: ");
        GridPane.setConstraints(lsales_prof, 2, 2);
        GridPane.setHalignment(lsales_prof, HPos.RIGHT);
        grid.getChildren().add(lsales_prof);
        
        final TextField sales_prof = new TextField();
        GridPane.setConstraints(sales_prof, 3, 2);
        grid.getChildren().add(sales_prof);
        
        final Label ldis_rev = new Label("Distribution revenue: ");
        GridPane.setConstraints(ldis_rev, 4, 0);
        GridPane.setHalignment(ldis_rev, HPos.RIGHT);
        grid.getChildren().add(ldis_rev);
        
        final TextField dis_rev = new TextField();
        GridPane.setConstraints(dis_rev, 5, 0);
        grid.getChildren().add(dis_rev);
        
        final Label ldis_cost = new Label("Distribution costs: ");
        GridPane.setConstraints(ldis_cost, 4, 1);
        GridPane.setHalignment(ldis_cost, HPos.RIGHT);
        grid.getChildren().add(ldis_cost);
        
        final TextField dis_cost = new TextField();
        GridPane.setConstraints(dis_cost, 5, 1);
        grid.getChildren().add(dis_cost);
        
        final Label ldis_prof = new Label("Distribution profit: ");
        GridPane.setConstraints(ldis_prof, 4, 2);
        GridPane.setHalignment(ldis_prof, HPos.RIGHT);
        grid.getChildren().add(ldis_prof);
        
        final TextField dis_prof = new TextField();
        GridPane.setConstraints(dis_prof, 5, 2);
        grid.getChildren().add(dis_prof);
        
        final Label lord_rev = new Label("Order revenue: ");
        GridPane.setConstraints(lord_rev, 1, 4);
        GridPane.setHalignment(lord_rev, HPos.RIGHT);
        grid.getChildren().add(lord_rev);
        
        final TextField ord_rev = new TextField();
        GridPane.setConstraints(ord_rev, 2, 4);
        grid.getChildren().add(ord_rev);
        
        final Label lord_cos = new Label("Order costs: ");
        GridPane.setConstraints(lord_cos, 1, 5);
        GridPane.setHalignment(lord_cos, HPos.RIGHT);
        grid.getChildren().add(lord_cos);
        
        final TextField ord_cos = new TextField();
        GridPane.setConstraints(ord_cos, 2, 5);
        grid.getChildren().add(ord_cos);
        
        final Label lord_prof = new Label("Order profit: ");
        GridPane.setConstraints(lord_prof, 1, 6);
        GridPane.setHalignment(lord_prof, HPos.RIGHT);
        grid.getChildren().add(lord_prof);
        
        final TextField ord_prof = new TextField();
        GridPane.setConstraints(ord_prof, 2, 6);
        grid.getChildren().add(ord_prof);
        
        final Label lother_costs = new Label("Other costs: ");
        GridPane.setConstraints(lother_costs, 3, 4);
        GridPane.setHalignment(lother_costs, HPos.RIGHT);
        grid.getChildren().add(lother_costs);
        
        final TextField other_costs = new TextField();
        GridPane.setConstraints(other_costs, 4, 4);
        grid.getChildren().add(other_costs);
        
        final Label ltot_rev = new Label("Total monthly revenue: ");
        GridPane.setConstraints(ltot_rev, 2, 13);
        GridPane.setHalignment(ltot_rev, HPos.RIGHT);
        grid.getChildren().add(ltot_rev);
        
        final TextField tot_rev = new TextField();
        GridPane.setConstraints(tot_rev, 3, 13);
        grid.getChildren().add(tot_rev);
        
        final Label ltot_cost = new Label("Total monthly costs: ");
        GridPane.setConstraints(ltot_cost, 2, 14);
        GridPane.setHalignment(ltot_cost, HPos.RIGHT);
        grid.getChildren().add(ltot_cost);
        
        final TextField tot_loss = new TextField();
        GridPane.setConstraints(tot_loss, 3, 14);
        grid.getChildren().add(tot_loss);
        
        final Label ltot_prof = new Label("Total monthly profit: ");
        GridPane.setConstraints(ltot_prof, 2, 15);
        GridPane.setHalignment(ltot_prof, HPos.RIGHT);
        grid.getChildren().add(ltot_prof);
        
        final TextField tot_prof = new TextField();
        GridPane.setConstraints(tot_prof, 3, 15);
        grid.getChildren().add(tot_prof);
        
        Button calc_results = new Button("Calculate results");
        GridPane.setFillWidth(calc_results, true);
        calc_results.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setConstraints(calc_results, 2, 20);
        calc_results.setOnAction((ActionEvent event) ->
        {
            calculateResults();
        });
        grid.getChildren().add(calc_results);

        Button generate = new Button("Generate report");
        GridPane.setFillWidth(generate, true);
        generate.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setConstraints(generate, 3, 20);
        generate.setOnAction((ActionEvent event) ->
        {
            generateReport();
        });
        grid.getChildren().add(generate);
        
        scene = new Scene(grid, 500, 500);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepanel = new javax.swing.JPanel();
        topic1 = new javax.swing.JPanel();
        bar1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        topic2 = new javax.swing.JPanel();
        bar2 = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        topic3 = new javax.swing.JPanel();
        bar3 = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        topic4 = new javax.swing.JPanel();
        bar4 = new javax.swing.JPanel();
        name3 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
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
        jLabel6 = new javax.swing.JLabel();
        center = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(0, 153, 153));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topic1.setBackground(new java.awt.Color(0, 153, 153));
        topic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic1MousePressed(evt);
            }
        });
        topic1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar1.setOpaque(false);
        bar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic1MousePressed(evt);
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic1.add(bar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText(" Home");
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic1MousePressed(evt);
            }
        });
        topic1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Home_48px.png"))); // NOI18N
        pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic1MousePressed(evt);
            }
        });
        topic1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 60));

        topic2.setBackground(new java.awt.Color(0, 153, 153));
        topic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic2MousePressed(evt);
            }
        });
        topic2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic2.add(bar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Sales");
        name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic2MousePressed(evt);
            }
        });
        topic2.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Cash_Register_40px_1.png"))); // NOI18N
        pic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topic2MousePressed(evt);
            }
        });
        topic2.add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

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
            .addGap(0, 0, Short.MAX_VALUE)
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
        topic4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar4.setOpaque(false);

        javax.swing.GroupLayout bar4Layout = new javax.swing.GroupLayout(bar4);
        bar4.setLayout(bar4Layout);
        bar4Layout.setHorizontalGroup(
            bar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bar4Layout.setVerticalGroup(
            bar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topic4.add(bar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText(" Stock");
        topic4.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Warehouse_40px.png"))); // NOI18N
        topic4.add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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

        jLabel6.setText("Empid16428685662");
        sidepanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 170, 50));

        getContentPane().add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 810));

        center.setBackground(new java.awt.Color(199, 238, 238));

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        getContentPane().add(center, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 1090, 760));

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

        time.setText("Time");
        topbar.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 120, 50));

        date.setText("Date with calender");
        topbar.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 130, 50));

        getContentPane().add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1110, 50));

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0); // cancel button
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        JFrame frame = new JFrame("test");   //minimize label
        frame.setExtendedState(JFrame.ICONIFIED);

    }//GEN-LAST:event_minimizeMouseClicked

    private void topic6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topic6MousePressed
        /*setColor(topic6);   //set the colour
        bar6.setOpaque(true);*/
    }//GEN-LAST:event_topic6MousePressed

    private void topic1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topic1MousePressed
        home h1 = new home(); // go to home page
        h1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_topic1MousePressed

    private void topic2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topic2MousePressed
        purchase p1 = new purchase(); // go to home page
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_topic2MousePressed
    void setColor(JPanel pl) //set the colour after  click
        {
            pl.setBackground(new Color (0,204,204));
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinancialSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinancialSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinancialSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinancialSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinancialSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar1;
    private javax.swing.JPanel bar2;
    private javax.swing.JPanel bar3;
    private javax.swing.JPanel bar4;
    private javax.swing.JPanel bar5;
    private javax.swing.JPanel bar6;
    private javax.swing.JPanel bar7;
    private javax.swing.JPanel bar8;
    private javax.swing.JPanel center;
    private javax.swing.JLabel close;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
    private javax.swing.JPanel sidepanel;
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
    // End of variables declaration//GEN-END:variables
    private JFXPanel cent;
    private Scene scene;
    private static Connection conn;
}
