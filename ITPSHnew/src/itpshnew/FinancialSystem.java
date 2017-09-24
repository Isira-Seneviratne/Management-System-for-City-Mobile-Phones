/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;


import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Isira
 */
public class FinancialSystem extends JFrame {

    /**
     * Creates new form FinancialSystem
     */
    private float MonthRepRev = 0, MonthRepCost = 0, MonthRepProf = 0, MonthSalesRev = 0, MonthSalesCost = 0,
            MonthSalesProf = 0, MonthDisRev = 0, MonthDisCost = 0, MonthDisProf = 0, MonthHRCost = 0,
            MonthOtherCost = 0;
    private float TodayRepRev, TodayRepCost, TodayRepProf, TodaySalesRev, TodaySalesCost, TodaySalesProf,
            TodayDisRev, TodayDisCost, TodayDisProf, TodayHRCost, TodayOtherCost;
    private float TodayTotCost = 0, MonthTotCost = 0, TodayTotRev = 0,
            MonthTotRev = 0, TodayTotProf = 0, MonthTotProf = 0;
    
    private Connection conn;
    private TimerThread timer;
    
    public FinancialSystem() {
        
        setUndecorated(true);
        //this.setAlwaysOnTop(true);
        setResizable(true);
        setVisible(true);
        initComponents();
        month_pan.setVisible(false);
        setlabelcolor(today_fin);
        initToday();
        
        setColor(topic6);   //set the colour to FinancialSystem bar
        bar6.setOpaque(true);
        setlabelcolor(today_fin); // set the today  label colour as default one
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        updateResults();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        calculateResults();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        generateReport();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        clear();
    }
    
    private void dbConnect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcitymobile?verifyServerCertificate=false&useSSL=true", "root", "");
        }
        catch(ClassNotFoundException ce)
        {
            JOptionPane.showMessageDialog(this, "Unable to load the database driver.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "Unable to connect to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void initToday()
    {
        if(conn == null)
            dbConnect();
        try
        {
            Statement s = conn.createStatement();
            ResultSet rs/* = s.executeQuery("SELECT * FROM Repair_Checkout")*/;
            TodayRepRev = 300;
            TodayRepCost = 300;
            TodayRepProf = TodayRepRev - TodayRepCost;
            rs = s.executeQuery("SELECT net_amount FROM Payment p, Bill b WHERE b.Bill_Number=p.bill_number AND Date = CURDATE()");
            while(rs.next())
                TodaySalesRev += rs.getFloat("net_amount");
            rs = s.executeQuery("SELECT totalCost FROM Reorder");
            while(rs.next())
                TodaySalesCost += rs.getFloat("totalCost");
            TodaySalesProf = TodaySalesRev - TodaySalesCost;
            rs = s.executeQuery("SELECT item_cost FROM Shipping_rec WHERE Day="+getDay()+" AND Month='"+getMonth()+"' AND Year="+getYear()+" AND ship_type='Retail'");
            while(rs.next())
                TodayDisRev += rs.getFloat("item_cost");
            rs = s.executeQuery("SELECT item_cost, Shipping_Cost FROM Shipping_rec WHERE Day="+getDay()+" AND Month='"+getMonth()+"' AND Year="+getYear()+" AND ship_type='Vendor'");
            while(rs.next())
                TodayDisCost += rs.getFloat("item_cost") + rs.getFloat("Shipping_Cost");
            TodayDisProf = TodayDisRev - TodayDisCost;
            rs = s.executeQuery("SELECT hour(ExitTime-Shift_eTime) AS Overtime_hours, dailyRate, otRate"
                    + " FROM dailyattendance da, currentemployee ce, salaryrate sr"
                    + " WHERE da.EmpID=ce.EmpID AND ce.JobID=sr.JobID AND Date=STR_TO_DATE('"+getDate()+"', '%d %m %y')");
            while(rs.next())
                TodayHRCost += rs.getInt("Overtime_hours") * rs.getFloat("otRate") + rs.getFloat("dailyRate");
            TodayTotRev = TodayRepRev + TodaySalesRev + TodayDisRev;
            TodayTotCost = TodayRepCost + TodaySalesCost + TodayDisCost + TodayHRCost;
            TodayTotProf = TodayTotRev - TodayTotCost;
            rs = s.executeQuery("SELECT Other_cost FROM daily_finances WHERE Day="+getDay()+" AND Month='"+getMonth()+"' AND Year="+getYear());
            if(rs.next() && rs.getFloat("Other_Cost") != 0)
                TodayOtherCost = rs.getFloat("Other_Cost");
            repair_rev.setText(Float.toString(TodayRepRev).replaceAll("\\.0*$", ""));
            repair_cost.setText(Float.toString(TodayRepCost).replaceAll("\\.0*$", ""));
            repair_prof.setText(Float.toString(TodayRepProf).replaceAll("\\.0*$", ""));
            sales_rev.setText(Float.toString(TodaySalesRev).replaceAll("\\.0*$", ""));
            sales_cost.setText(Float.toString(TodaySalesCost).replaceAll("\\.0*$", ""));
            sales_prof.setText(Float.toString(TodaySalesProf).replaceAll("\\.0*$", ""));
            dis_rev.setText(Float.toString(TodayDisRev).replaceAll("\\.0*$", ""));
            dis_cost.setText(Float.toString(TodayDisCost).replaceAll("\\.0*$", ""));
            dis_prof.setText(Float.toString(TodayDisProf).replaceAll("\\.0*$", ""));
            hr_cost.setText(Float.toString(TodayHRCost).replaceAll("\\.0*$", ""));
            other_costs.setText(Float.toString(TodayOtherCost).replaceAll("\\.0*$", ""));
            tot_rev.setText(Float.toString(TodayTotRev).replaceAll("\\.0*$", ""));
            tot_cost.setText(Float.toString(TodayTotCost).replaceAll("\\.0*$", ""));
            tot_prof.setText(Float.toString(TodayTotProf).replaceAll("\\.0*$", ""));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Unable to retrieve values from database.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void calculateResults()
    {
        if(conn == null)
            dbConnect();
        try
        {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Daily_Finances WHERE Month='"+getMonth()+"' AND Year="+getYear());
            while(rs.next())
            {
                MonthRepRev += rs.getFloat("Rep_inc");
                MonthRepCost += rs.getFloat("Rep_cost");
                MonthRepProf += rs.getFloat("Rep_prof");
                MonthSalesRev += rs.getFloat("Sales_inc");
                MonthSalesCost += rs.getFloat("Sales_cost");
                MonthSalesProf += rs.getFloat("Sales_prof");
                MonthDisRev += rs.getFloat("Dis_inc");
                MonthDisCost += rs.getFloat("Dis_cost");
                MonthDisProf += rs.getFloat("Dis_prof");
                MonthHRCost += rs.getFloat("HR_cost");
                MonthOtherCost += rs.getFloat("Other_cost");
            }
            rs = s.executeQuery("SELECT Salary FROM monthlysal WHERE Month='"+getMonth()+"'");
            while(rs.next())
                MonthHRCost += rs.getFloat("Salary");
            
            MonthTotRev = MonthRepRev + MonthSalesRev + MonthDisRev;
            MonthTotCost = MonthRepCost + MonthSalesCost + MonthDisRev + MonthHRCost + MonthOtherCost;
            MonthTotProf = MonthTotRev - MonthTotCost;
            
            repair_rev1.setText(Float.toString(MonthRepRev).replaceAll("\\.0*$", ""));
            repair_cost1.setText(Float.toString(MonthRepCost).replaceAll("\\.0*$", ""));
            repair_prof1.setText(Float.toString(MonthRepProf).replaceAll("\\.0*$", ""));
            sales_rev1.setText(Float.toString(MonthSalesRev).replaceAll("\\.0*$", ""));
            sales_cost1.setText(Float.toString(MonthSalesCost).replaceAll("\\.0*$", ""));
            sales_prof1.setText(Float.toString(MonthSalesProf).replaceAll("\\.0*$", ""));
            dis_rev1.setText(Float.toString(MonthDisRev).replaceAll("\\.0*$", ""));
            dis_cost1.setText(Float.toString(MonthDisCost).replaceAll("\\.0*$", ""));
            dis_prof1.setText(Float.toString(MonthDisProf).replaceAll("\\.0*$", ""));
            hr_cost1.setText(Float.toString(MonthHRCost).replaceAll("\\.0*$", ""));
            other_costs1.setText(Float.toString(MonthOtherCost).replaceAll("\\.0*$", ""));
            tot_rev1.setText(Float.toString(MonthTotRev).replaceAll("\\.0*$", ""));
            tot_cost1.setText(Float.toString(MonthTotCost).replaceAll("\\.0*$", ""));
            tot_prof1.setText(Float.toString(MonthTotProf).replaceAll("\\.0*$", ""));
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "There was an error while retrieving financial values to calculate results.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
        }
    }
    
    private void updateResults()
    {
        try
        {
            MonthRepRev = Float.parseFloat(repair_rev1.getText());
            MonthRepCost = Float.parseFloat(repair_cost1.getText());
            MonthRepProf = MonthRepRev - MonthRepCost;
            repair_prof1.setText(Float.toString(MonthRepProf).replaceAll("\\.0*$", ""));
            
            MonthSalesRev = Float.parseFloat(sales_rev1.getText());
            MonthSalesCost = Float.parseFloat(sales_cost1.getText());
            MonthSalesProf = MonthSalesRev - MonthSalesCost;
            sales_prof1.setText(Float.toString(MonthSalesProf).replaceAll("\\.0*$", ""));
            
            MonthDisRev = Float.parseFloat(dis_rev1.getText());
            MonthDisCost = Float.parseFloat(dis_cost1.getText());
            MonthDisProf = MonthDisRev - MonthDisCost;
            dis_prof1.setText(Float.toString(MonthDisProf).replaceAll("\\.0*$", ""));
            
            MonthHRCost = Float.parseFloat(hr_cost1.getText());
            
            MonthOtherCost = Float.parseFloat(other_costs1.getText());
            
            MonthTotRev = MonthRepRev + MonthSalesRev + MonthDisRev;
            MonthTotCost = MonthRepCost + MonthSalesCost + MonthDisRev + MonthHRCost + MonthOtherCost;
            MonthTotProf = MonthTotRev - MonthTotCost;
            tot_rev1.setText(Float.toString(MonthTotRev).replaceAll("\\.0*$", ""));
            tot_cost1.setText(Float.toString(MonthTotCost).replaceAll("\\.0*$", ""));
            tot_prof1.setText(Float.toString(MonthTotProf).replaceAll("\\.0*$", ""));

            JOptionPane.showMessageDialog(this, "The financial values have been successfully updated.",
                    "Financial values updated", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "You have attempted to store blank or invalid numbers. Please enter valid numbers.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void generateReport()
    {
        if(conn == null)
            dbConnect();
        if(MonthTotProf == 0 && MonthTotRev == 0 && MonthTotCost == 0)
        {
            JOptionPane.showMessageDialog(this, "You have not generated the required financial values. Please click the \"Calculate Results\" button to do so.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String month = getMonth();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        try
        {
            Statement s = conn.createStatement();
            String title, message;
            s.execute("SELECT * FROM Financial_Reports WHERE Month_issued='"+month+"' AND Year_issued="+year);
            if(s.getResultSet().next())
            {
                s.execute("UPDATE Financial_Reports SET Total_revenue="+MonthTotRev+", Total_costs="+MonthTotCost+", Total_profit="+MonthTotProf
                        +" WHERE Month_issued='"+month+"' AND Year_issued="+year);
                title = "Update successful";
                message = "The financial report for the current month and year has been updated.";
            }
            else
            {
                s.execute("INSERT INTO Financial_Reports VALUES('"+month+"',"+year+","+MonthTotRev+","+MonthTotCost+","+MonthTotProf+")");
                title = "Insertion successful";
                message = "The financial report for the current month and year has been inserted.";
            }
            JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NullPointerException npe)
        {
            JOptionPane.showMessageDialog(this, "A database connection was not properly established.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "An error occurred while writing the financial report to the database.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
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
        topbar = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        month_fin = new javax.swing.JLabel();
        today_fin = new javax.swing.JLabel();
        today_pan = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        repair_rev = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        repair_cost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        repair_prof = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sales_rev = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sales_cost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sales_prof = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dis_rev = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dis_cost = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dis_prof = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        tot_rev = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tot_cost = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tot_prof = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        hr_cost = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        other_costs = new javax.swing.JTextField();
        updateToday = new javax.swing.JButton();
        month_pan = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        hr_cost1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        other_costs1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        repair_rev1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        repair_cost1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        repair_prof1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        sales_rev1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        sales_cost1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        sales_prof1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        dis_rev1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        dis_cost1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        dis_prof1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        search_month = new com.toedter.calendar.JMonthChooser();
        search_year = new com.toedter.calendar.JYearChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        tot_rev1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tot_cost1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tot_prof1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Financial System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(0, 153, 153));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topic1.setBackground(new java.awt.Color(0, 153, 153));
        topic1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar1.setOpaque(false);

        javax.swing.GroupLayout bar1Layout = new javax.swing.GroupLayout(bar1);
        bar1.setLayout(bar1Layout);
        bar1Layout.setHorizontalGroup(
            bar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
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
        topic1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Home_48px.png"))); // NOI18N
        topic1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 60));

        topic2.setBackground(new java.awt.Color(0, 153, 153));
        topic2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar2.setOpaque(false);

        javax.swing.GroupLayout bar2Layout = new javax.swing.GroupLayout(bar2);
        bar2.setLayout(bar2Layout);
        bar2Layout.setHorizontalGroup(
            bar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
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
        topic2.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Cash_Register_40px_1.png"))); // NOI18N
        topic2.add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 60));

        topic3.setBackground(new java.awt.Color(0, 153, 153));
        topic3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar3.setOpaque(false);

        javax.swing.GroupLayout bar3Layout = new javax.swing.GroupLayout(bar3);
        bar3.setLayout(bar3Layout);
        bar3Layout.setHorizontalGroup(
            bar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
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
            .addGap(0, 10, Short.MAX_VALUE)
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
            .addGap(0, 10, Short.MAX_VALUE)
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
        topic6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar6.setBackground(new java.awt.Color(255, 255, 255));
        bar6.setOpaque(false);

        javax.swing.GroupLayout bar6Layout = new javax.swing.GroupLayout(bar6);
        bar6.setLayout(bar6Layout);
        bar6Layout.setHorizontalGroup(
            bar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
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
        topic6.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 260, 40));

        pic5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Money_Bag_40px.png"))); // NOI18N
        topic6.add(pic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        sidepanel.add(topic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 290, 60));

        topic7.setBackground(new java.awt.Color(0, 153, 153));
        topic7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar7.setOpaque(false);

        javax.swing.GroupLayout bar7Layout = new javax.swing.GroupLayout(bar7);
        bar7.setLayout(bar7Layout);
        bar7Layout.setHorizontalGroup(
            bar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
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
        sidepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 60));
        sidepanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 270, 20));
        sidepanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 10));

        topic8.setBackground(new java.awt.Color(0, 153, 153));
        topic8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar8.setOpaque(false);

        javax.swing.GroupLayout bar8Layout = new javax.swing.GroupLayout(bar8);
        bar8.setLayout(bar8Layout);
        bar8Layout.setHorizontalGroup(
            bar8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
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
        timer = new TimerThread(time);
        timer.start();
        topbar.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 120, 50));

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText(getDate());
        topbar.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 200, 50));

        month_fin.setBackground(new java.awt.Color(0, 204, 204));
        month_fin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        month_fin.setForeground(new java.awt.Color(255, 255, 255));
        month_fin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        month_fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Money_Bag_40px.png"))); // NOI18N
        month_fin.setText("  Monthly finances");
        month_fin.setOpaque(true);
        month_fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                month_finMouseClicked(evt);
            }
        });
        topbar.add(month_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 220, 50));

        today_fin.setBackground(new java.awt.Color(0, 204, 204));
        today_fin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        today_fin.setForeground(new java.awt.Color(255, 255, 255));
        today_fin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        today_fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itpshnew/images/icons8_Money_Bag_40px.png"))); // NOI18N
        today_fin.setText("  Today's finances ");
        today_fin.setOpaque(true);
        today_fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                today_finMouseClicked(evt);
            }
        });
        topbar.add(today_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 50));

        getContentPane().add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1170, 50));

        today_pan.setBackground(new java.awt.Color(202, 254, 227));
        today_pan.setPreferredSize(new java.awt.Dimension(1076, 718));
        today_pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(100, 199, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Today's repair income:");

        repair_rev.setEditable(false);
        repair_rev.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Today's repair costs:");

        repair_cost.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Today's repair profit:");

        repair_prof.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Today's sales income:");

        sales_rev.setEditable(false);
        sales_rev.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Today's sales costs:");

        sales_cost.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Today's sales profit:");

        sales_prof.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Today's distribution revenue:");

        dis_rev.setEditable(false);
        dis_rev.setName(""); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Today's distribution costs:");

        dis_cost.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Today's distribution profit:");

        dis_prof.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(repair_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(repair_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(dis_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(dis_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(dis_prof, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(repair_rev)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(sales_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sales_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sales_prof)
                            .addComponent(jLabel8))
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );

        today_pan.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1090, -1));

        jPanel7.setBackground(new java.awt.Color(100, 199, 150));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Today's total income:");

        tot_rev.setEditable(false);
        tot_rev.setName(""); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Today's total costs:");

        tot_cost.setEditable(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Today's total profit:");

        tot_prof.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tot_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tot_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tot_rev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_rev, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel28))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_cost, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_prof, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18))
        );

        today_pan.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 340, -1));

        jPanel3.setBackground(new java.awt.Color(100, 199, 150));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Today's HR costs:");

        hr_cost.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Today's other costs:");

        other_costs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                other_costsActionPerformed(evt);
            }
        });

        updateToday.setBackground(new java.awt.Color(48, 214, 48));
        updateToday.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateToday.setText("Update");
        updateToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTodayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hr_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(other_costs, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(updateToday, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(hr_cost)
                            .addGap(3, 3, 3))
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(other_costs)
                                .addGap(3, 3, 3))
                            .addComponent(jLabel16))
                        .addGap(3, 3, 3)))
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateToday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        today_pan.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1100, 70));

        getContentPane().add(today_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 1120, 718));

        month_pan.setBackground(new java.awt.Color(202, 254, 227));
        month_pan.setMinimumSize(new java.awt.Dimension(1060, 710));
        month_pan.setPreferredSize(new java.awt.Dimension(1076, 718));
        month_pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(100, 199, 150));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Monthly HR costs:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Other monthly costs:");

        other_costs1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hr_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(other_costs1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(other_costs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hr_cost1)
                        .addComponent(jLabel33)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        month_pan.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1110, -1));

        jPanel6.setBackground(new java.awt.Color(100, 199, 150));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Monthly repair income:");

        repair_rev1.setName(""); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Monthly repair costs:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Monthly repair profit:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Monthly sales income:");

        sales_rev1.setName(""); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Monthly sales costs:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Monthly sales profit:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Monthly distribution revenue:");

        dis_rev1.setName(""); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Monthly distribution costs:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Monthly distribution profit:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repair_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sales_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dis_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(sales_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sales_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sales_prof1))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(repair_rev1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(jLabel12))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(repair_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(repair_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(dis_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(dis_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27)
                            .addComponent(dis_prof1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))))
                .addContainerGap())
        );

        month_pan.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 40, 1110, -1));

        jPanel5.setBackground(new java.awt.Color(100, 199, 150));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Year:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Month:");

        search.setBackground(new java.awt.Color(48, 214, 48));
        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(search_month, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search_year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(search)
                        .addGap(121, 121, 121))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(search_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(search_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search)
                .addGap(99, 99, 99))
        );

        month_pan.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 340, 130));

        jPanel4.setBackground(new java.awt.Color(100, 199, 150));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Monthly total income:");

        tot_rev1.setEditable(false);
        tot_rev1.setName(""); // NOI18N
        tot_rev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tot_rev1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Monthly total costs:");

        tot_cost1.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Monthly total profit:");

        tot_prof1.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tot_cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tot_prof1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tot_rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_rev1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel17))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_cost1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_prof1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18))
        );

        month_pan.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 340, -1));

        jButton1.setBackground(new java.awt.Color(48, 214, 48));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Update Results");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        month_pan.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 180, -1));

        jButton2.setBackground(new java.awt.Color(48, 214, 48));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Calculate Results");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        month_pan.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, -1, -1));

        jButton3.setBackground(new java.awt.Color(48, 214, 48));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Generate Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        month_pan.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, -1));

        jButton4.setBackground(new java.awt.Color(48, 214, 48));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        month_pan.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 180, -1));

        getContentPane().add(month_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 48, 1150, 720));

        setSize(new java.awt.Dimension(1395, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public class TimerThread extends Thread
    {
        private JLabel time;
        private boolean running;
        private SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        
        public TimerThread(JLabel time)
        {
            this.time = time;
            running = true;
        }
        
        public void setRunning(boolean running)
        {
            this.running = running;
        }
        
        public void run()
        {
            while(running)
            {
                SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        time.setText(timeFormat.format(Calendar.getInstance().getTime()));
                    }
                });
                try
                {
                    sleep(1000);
                }
                catch(InterruptedException e)
                {
                    JOptionPane.showMessageDialog(null, "There was an issue with the time system.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    private void clear()
    {
        repair_rev.setText("");
        repair_cost.setText("");
        repair_prof.setText(""); 
        sales_rev.setText("");
        sales_cost.setText("");
        sales_prof.setText("");
        dis_rev.setText("");
        dis_cost.setText("");
        dis_prof.setText("");
        hr_cost.setText("");
        other_costs1.setText("");
        tot_rev1.setText("");
        tot_cost1.setText("");
        tot_prof1.setText("");
    }

    private String getDate()
    {
        return getDay()+" "+getMonth()+" "+getYear();
    }
    
    private int getDay()
    {
        return Calendar.getInstance().get(Calendar.DATE);
    }
    
    private String getMonth()
    {
        return new String[]{"January", "February", "March",
            "April", "May", "June", "July", "August", "September",
            "October", "November", "December"}[Calendar.getInstance().get(Calendar.MONTH)];
    }
    
    private int getMonthVal()
    {
        return Calendar.getInstance().get(Calendar.MONTH)+1;
    }
    
    private int getYear()
    {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
    
    private void setlabelcolor(JLabel label) //set the colour after  click
    {
        label.setBackground(new Color (0,153,153));
    }
    
    private void resettlabelcolor(JLabel label) //set the colour after  click
    {
        label.setBackground(new Color (0,204,204));
    }
    
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        timer.setRunning(false);
        try
        {
            conn.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Unable to close database connection.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose(); // cancel button
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(conn == null)
            dbConnect();
        String month = new String[]{"January", "February", "March",
            "April", "May", "June", "July",
            "August", "September", "October", "November", "December"}[search_month.getMonth()];
        String year = ""+search_year.getYear();

        try
        {
            Statement s = conn.createStatement();
            s.execute("SELECT 1 FROM Financial_Reports WHERE Month_issued='"+month+"' AND Year_issued="+year);
            if(s.getResultSet().next())
            {
                ResultSet rs = s.executeQuery("SELECT * FROM Financial_Reports WHERE Month_issued='"+month+"' AND Year_issued="+year);
                rs.next();
                double s_totrev = rs.getDouble("Total_revenue"), s_totcost = rs.getDouble("Total_costs"), s_totprof = rs.getDouble("Total_profit");
                JOptionPane.showMessageDialog(this, "<html><b>Financial values for "+month+" "+year+"</b></html>\n\nTotal income: "
                        +s_totrev+"\nTotal costs: "+s_totcost+"\nTotal profit: "+s_totprof,
                        "Results found", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "A financial record for "+month+" "+year+" does not exist.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "An error occurred while searching.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void today_finMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_today_finMouseClicked
        setlabelcolor(today_fin);
        resettlabelcolor(month_fin);
        today_pan.setVisible(true);
        month_pan.setVisible(false);
    }//GEN-LAST:event_today_finMouseClicked

    private void month_finMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_month_finMouseClicked
        setlabelcolor(month_fin);
        resettlabelcolor(today_fin);
        today_pan.setVisible(false);
        month_pan.setVisible(true);
    }//GEN-LAST:event_month_finMouseClicked

    private void updateTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTodayActionPerformed
        if(conn == null)
            dbConnect();
        try
        {
            TodayOtherCost = Float.parseFloat(other_costs.getText());
            TodayTotCost = TodayRepCost + TodaySalesCost + TodayDisCost + TodayHRCost + TodayOtherCost;
            TodayTotProf = TodayTotRev - TodayTotCost;
            Statement s = conn.createStatement();
            s.execute("SELECT 1 FROM Daily_Finances WHERE Day="+getDay()+" AND Month='"+getMonth()+"' AND Year="+getYear());
            if(s.getResultSet().next())
            {
                s.execute("UPDATE Daily_Finances SET Rep_inc="+TodayRepRev+", Rep_cost="+TodayRepCost
                +", Rep_prof="+TodayRepProf+", Sales_inc="+TodaySalesRev+", Sales_cost="+TodaySalesCost
                +", Sales_prof="+TodaySalesCost+", Dis_inc="+TodayDisRev+", Dis_cost="+TodayDisCost
                +", Dis_prof="+TodayDisProf+", HR_cost="+TodayHRCost
                +", Other_cost="+TodayOtherCost
                +", Tot_cost="+TodayTotCost+", Tot_prof="+TodayTotProf
                +" WHERE Day="+getDay()+" AND Month='"+getMonth()+"' AND Year="+getYear());
                JOptionPane.showMessageDialog(this, "Successfully updated record for "+getDate()+" to database.", "Update successful", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                s.execute("INSERT INTO Daily_Finances VALUES("+getDay()+", '"+getMonth()+"', "+getYear()+", "
                +TodayRepRev+", "+TodayRepCost+", "+TodayRepProf+", "+TodaySalesRev+", "+TodaySalesCost+", "+TodaySalesProf
                +", "+TodayDisRev+", "+TodayDisCost+", "+TodayDisProf+", "+TodayHRCost+", "+TodayOtherCost
                +", "+TodayTotRev+", "+TodayTotCost+", "+TodayTotProf+")");
                JOptionPane.showMessageDialog(this, "Successfully inserted record for "+getDate()+".", "Insertion successful", JOptionPane.INFORMATION_MESSAGE);
            }
            tot_cost.setText(Float.toString(TodayTotCost).replaceAll("\\.0*$", ""));
            tot_prof.setText(Float.toString(TodayTotProf).replaceAll("\\.0*$", ""));
        }
        catch(NumberFormatException ne)
        {
            JOptionPane.showMessageDialog(this, "You have attempted to store a blank or invalid number. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "Unable to insert/update record for "+getDate()+" to database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateTodayActionPerformed

    private void other_costsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_other_costsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_other_costsActionPerformed

    private void tot_rev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tot_rev1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tot_rev1ActionPerformed
    
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
    private javax.swing.JLabel close;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dis_cost;
    private javax.swing.JTextField dis_cost1;
    private javax.swing.JTextField dis_prof;
    private javax.swing.JTextField dis_prof1;
    private javax.swing.JTextField dis_rev;
    private javax.swing.JTextField dis_rev1;
    private javax.swing.JTextField hr_cost;
    private javax.swing.JTextField hr_cost1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel month_fin;
    private javax.swing.JPanel month_pan;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JTextField other_costs;
    private javax.swing.JTextField other_costs1;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    private javax.swing.JLabel pic7;
    private javax.swing.JTextField repair_cost;
    private javax.swing.JTextField repair_cost1;
    private javax.swing.JTextField repair_prof;
    private javax.swing.JTextField repair_prof1;
    private javax.swing.JTextField repair_rev;
    private javax.swing.JTextField repair_rev1;
    private javax.swing.JTextField sales_cost;
    private javax.swing.JTextField sales_cost1;
    private javax.swing.JTextField sales_prof;
    private javax.swing.JTextField sales_prof1;
    private javax.swing.JTextField sales_rev;
    private javax.swing.JTextField sales_rev1;
    private javax.swing.JButton search;
    private com.toedter.calendar.JMonthChooser search_month;
    private com.toedter.calendar.JYearChooser search_year;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel time;
    private javax.swing.JLabel today_fin;
    private javax.swing.JPanel today_pan;
    private javax.swing.JPanel topbar;
    private javax.swing.JPanel topic1;
    private javax.swing.JPanel topic2;
    private javax.swing.JPanel topic3;
    private javax.swing.JPanel topic4;
    private javax.swing.JPanel topic5;
    private javax.swing.JPanel topic6;
    private javax.swing.JPanel topic7;
    private javax.swing.JPanel topic8;
    private javax.swing.JTextField tot_cost;
    private javax.swing.JTextField tot_cost1;
    private javax.swing.JTextField tot_prof;
    private javax.swing.JTextField tot_prof1;
    private javax.swing.JTextField tot_rev;
    private javax.swing.JTextField tot_rev1;
    private javax.swing.JButton updateToday;
    // End of variables declaration//GEN-END:variables

}
