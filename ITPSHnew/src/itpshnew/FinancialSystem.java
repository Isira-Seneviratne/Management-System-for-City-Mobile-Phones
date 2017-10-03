/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

import java.awt.Color;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;

public class FinancialSystem extends JPanel {

    protected Connection conn;
    
    protected float RepRev = 0, RepCost = 0, RepProf = 0, SalesRev = 0, SalesCost = 0,
            SalesProf = 0, DisRev = 0, DisCost = 0, DisProf = 0, HRCost = 0, OtherCost = 0,
            TotCost = 0, TotProf = 0, TotRev = 0;
    
    public FinancialSystem() {
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

        setPreferredSize(new java.awt.Dimension(0, 0));
        setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    protected int getDay()
    {
        return Calendar.getInstance().get(Calendar.DATE);
    }
    
    protected String getMonth()
    {
        return new String[]{"January", "February", "March",
            "April", "May", "June", "July", "August", "September",
            "October", "November", "December"}[Calendar.getInstance().get(Calendar.MONTH)];
    }

    protected int getYear()
    {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
    
    protected String getDate()
    {
        return getDay()+" "+getMonth()+" "+getYear();
    }
    
    protected int getMonthVal()
    {
        return Calendar.getInstance().get(Calendar.MONTH)+1;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
