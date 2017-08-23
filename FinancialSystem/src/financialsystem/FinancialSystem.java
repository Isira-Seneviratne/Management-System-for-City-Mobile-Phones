/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialsystem;

import java.sql.*;
import java.util.Calendar;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class FinancialSystem extends Application {
    
    private static Connection conn = null;
    
    private static float RepRev, RepCost, RepProf, SalesRev, SalesCost, SalesProf;
    private static float DisRev, DisCost, DisProf, OrdRev, OrdCost, OrdProf, OtherCost;
    private static float TotCost = 0, TotRev = 0, TotProf = 0;
    
    private static TextField repair_rev, repair_cost, repair_prof, sales_rev, sales_cost, sales_prof;
    private static TextField dis_rev, dis_cost, dis_prof, ord_rev, ord_cost, ord_prof, other_costs;
    private static TextField tot_rev, tot_cost, tot_prof;
    
    private static void dbConnect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ManagementSystem", "root", "abcd1234");
        }
        catch(ClassNotFoundException ce)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Database Driver Error");
            alert.setContentText("Unable to load the database driver.");
            alert.showAndWait();
        }
        catch(SQLException se)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Database Connection Error");
            alert.setContentText("Unable to connect to the database.");
            alert.showAndWait();
        }
    }
    
    private static void calculateResults()
    {
        dbConnect();
        try
        {
            Statement s = conn.createStatement();
        }
        catch(SQLException e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Calculation Error");
            alert.setHeaderText("Error while calculating results");
            alert.setContentText("There was an error while retrieving financial values to calculate results.");
            alert.showAndWait();
        }
    }
    
    private static void updateResults()
    {
        try
        {
            RepRev = Float.parseFloat(repair_rev.getText());
            RepCost = Float.parseFloat(repair_cost.getText());
            RepProf = RepRev - RepCost;
            repair_prof.setText("");
            repair_prof.setText(Float.toString(RepProf).replaceAll("\\.0$", ""));
            
            SalesRev = Float.parseFloat(sales_rev.getText());
            SalesCost = Float.parseFloat(sales_cost.getText());
            SalesProf = SalesRev - SalesCost;
            sales_prof.setText("");
            sales_prof.setText(Float.toString(SalesProf).replaceAll("\\.0$", ""));
            
            DisRev = Float.parseFloat(dis_rev.getText());
            DisCost = Float.parseFloat(sales_cost.getText());
            DisProf = DisRev - DisCost;
            dis_prof.setText("");
            dis_prof.setText(Float.toString(DisProf).replaceAll("\\.0$", ""));
            
            OrdRev = Float.parseFloat(ord_rev.getText());
            OrdCost = Float.parseFloat(ord_cost.getText());
            OrdProf = OrdRev - OrdCost;
            ord_prof.setText("");
            ord_prof.setText(Float.toString(OrdProf).replaceAll("\\.0$", ""));
            
            OtherCost = Float.parseFloat(other_costs.getText());
            
            TotRev = RepRev + SalesRev + DisRev + OrdRev;
            TotCost = RepCost + SalesCost + DisCost + OrdCost + OtherCost;
            TotProf = TotRev - TotCost;
            tot_rev.setText("");
            tot_rev.setText(Float.toString(TotRev).replaceAll("\\.0$", ""));
            tot_cost.setText("");
            tot_cost.setText(Float.toString(TotCost).replaceAll("\\.0$", ""));
            tot_prof.setText("");
            tot_prof.setText(Float.toString(TotProf).replaceAll("\\.0$", ""));

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Financial values updated");
            alert.setContentText("The financial values have been successfully updated.");
            alert.getDialogPane().setPrefSize(400, 200);
            alert.showAndWait();
        }
        catch(NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid numbers entered");
            alert.setContentText("You have attempted to store invalid numbers. Please enter valid numbers.");
            alert.getDialogPane().setPrefSize(400, 200);
            alert.showAndWait();
        }
    }
    
    private static void generateReport()
    {
        dbConnect();
        if(TotProf == 0 && TotRev == 0 && TotCost == 0)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Financial Values Not Generated");
            alert.setContentText("You have not generated the required financial values. Please click the \"Calculate Results\" button to do so.");
            alert.getDialogPane().setPrefSize(400, 200);
            alert.showAndWait();
            return;
        }
        String month = getMonth();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        try
        {
            Statement s = conn.createStatement();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            s.execute("SELECT * FROM Financial_Reports WHERE Month_issued='"+month+"' AND Year_issued="+year);
            if(s.getResultSet().next())
            {
                s.execute("UPDATE Financial_Reports SET Total_revenue="+TotRev+", Total_costs="+TotCost+", Total_profit="+TotProf
                        +" WHERE Month_issued='"+month+"' AND Year_issued="+year);
                alert.setHeaderText("Update successful");
                alert.setContentText("The financial report for the current month and year has been updated.");
            }
            else
            {
                s.execute("INSERT INTO Financial_Reports VALUES('"+month+"',"+year+","+TotRev+","+TotCost+","+TotProf+")");
                alert.setHeaderText("Insertion successful");
                alert.setContentText("The financial report for the current month and year has been inserted.");
            }
            alert.getDialogPane().setPrefSize(400, 200);
            alert.showAndWait();
        }
        catch(SQLException e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("There was an unexpected database issue");
            alert.setContentText("An error occurred while writing the financial report to the database.");
            alert.showAndWait();
        }
    }
    
    private static void clear()
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
        ord_rev.setText("");
        ord_cost.setText("");
        ord_prof.setText("");
        other_costs.setText("");
        tot_rev.setText("");
        tot_cost.setText("");
        tot_prof.setText("");
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setStyle("-fx-background-color: #c7eeee;");
        grid.setVgap(10);
        grid.setHgap(10);
        
        final Label lrepair_rev = new Label("Repair revenue: ");
        lrepair_rev.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lrepair_rev, 0, 0);
        GridPane.setHalignment(lrepair_rev, HPos.RIGHT);
        grid.getChildren().add(lrepair_rev);
        
        repair_rev = new TextField();
        GridPane.setConstraints(repair_rev, 1, 0);
        grid.getChildren().add(repair_rev);
        
        final Label lrepair_cost = new Label("Repair costs: ");
        lrepair_cost.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lrepair_cost, 0, 1);
        GridPane.setHalignment(lrepair_cost, HPos.RIGHT);
        grid.getChildren().add(lrepair_cost);
        
        repair_cost = new TextField();
        GridPane.setConstraints(repair_cost, 1, 1);
        grid.getChildren().add(repair_cost);

        final Label lrepair_prof = new Label("Repair profit: ");
        lrepair_prof.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lrepair_prof, 0, 2);
        GridPane.setHalignment(lrepair_prof, HPos.RIGHT);
        grid.getChildren().add(lrepair_prof);
        
        repair_prof = new TextField();
        GridPane.setConstraints(repair_prof, 1, 2);
        grid.getChildren().add(repair_prof);

        final Label lsales_rev = new Label("Sales revenue: ");
        lsales_rev.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lsales_rev, 2, 0);
        GridPane.setHalignment(lsales_rev, HPos.RIGHT);
        grid.getChildren().add(lsales_rev);
        
        sales_rev = new TextField();
        GridPane.setConstraints(sales_rev, 3, 0);
        grid.getChildren().add(sales_rev);
        
        final Label lsales_cost = new Label("Sales costs: ");
        lsales_cost.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lsales_cost, 2, 1);
        GridPane.setHalignment(lsales_cost, HPos.RIGHT);
        grid.getChildren().add(lsales_cost);
        
        sales_cost = new TextField();
        GridPane.setConstraints(sales_cost, 3, 1);
        grid.getChildren().add(sales_cost);
        
        final Label lsales_prof = new Label("Sales profit: ");
        lsales_prof.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lsales_prof, 2, 2);
        GridPane.setHalignment(lsales_prof, HPos.RIGHT);
        grid.getChildren().add(lsales_prof);
        
        sales_prof = new TextField();
        GridPane.setConstraints(sales_prof, 3, 2);
        grid.getChildren().add(sales_prof);
        
        final Label ldis_rev = new Label("Distribution revenue: ");
        ldis_rev.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(ldis_rev, 4, 0);
        GridPane.setHalignment(ldis_rev, HPos.RIGHT);
        grid.getChildren().add(ldis_rev);
        
        dis_rev = new TextField();
        GridPane.setConstraints(dis_rev, 5, 0);
        grid.getChildren().add(dis_rev);
        
        final Label ldis_cost = new Label("Distribution costs: ");
        ldis_cost.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(ldis_cost, 4, 1);
        GridPane.setHalignment(ldis_cost, HPos.RIGHT);
        grid.getChildren().add(ldis_cost);
        
        dis_cost = new TextField();
        GridPane.setConstraints(dis_cost, 5, 1);
        grid.getChildren().add(dis_cost);
        
        final Label ldis_prof = new Label("Distribution profit: ");
        ldis_prof.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(ldis_prof, 4, 2);
        GridPane.setHalignment(ldis_prof, HPos.RIGHT);
        grid.getChildren().add(ldis_prof);
        
        dis_prof = new TextField();
        GridPane.setConstraints(dis_prof, 5, 2);
        grid.getChildren().add(dis_prof);
        
        final Label lord_rev = new Label("Order revenue: ");
        lord_rev.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lord_rev, 1, 8);
        GridPane.setHalignment(lord_rev, HPos.RIGHT);
        grid.getChildren().add(lord_rev);
        
        ord_rev = new TextField();
        GridPane.setConstraints(ord_rev, 2, 8);
        grid.getChildren().add(ord_rev);
        
        final Label lord_cost = new Label("Order costs: ");
        lord_cost.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lord_cost, 1, 9);
        GridPane.setHalignment(lord_cost, HPos.RIGHT);
        grid.getChildren().add(lord_cost);
        
        ord_cost = new TextField();
        GridPane.setConstraints(ord_cost, 2, 9);
        grid.getChildren().add(ord_cost);
        
        final Label lord_prof = new Label("Order profit: ");
        lord_prof.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lord_prof, 1, 10);
        GridPane.setHalignment(lord_prof, HPos.RIGHT);
        grid.getChildren().add(lord_prof);
        
        ord_prof = new TextField();
        GridPane.setConstraints(ord_prof, 2, 10);
        grid.getChildren().add(ord_prof);
        
        final Label lother_costs = new Label("Other costs: ");
        lother_costs.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(lother_costs, 3, 8);
        GridPane.setHalignment(lother_costs, HPos.RIGHT);
        grid.getChildren().add(lother_costs);
        
        other_costs = new TextField();
        GridPane.setConstraints(other_costs, 4, 8);
        grid.getChildren().add(other_costs);
        
        final Label ltot_rev = new Label("Total monthly revenue: ");
        ltot_rev.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(ltot_rev, 2, 18);
        GridPane.setHalignment(ltot_rev, HPos.RIGHT);
        grid.getChildren().add(ltot_rev);
        
        tot_rev = new TextField();
        GridPane.setConstraints(tot_rev, 3, 18);
        grid.getChildren().add(tot_rev);
        
        final Label ltot_cost = new Label("Total monthly costs: ");
        ltot_cost.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(ltot_cost, 2, 19);
        GridPane.setHalignment(ltot_cost, HPos.RIGHT);
        grid.getChildren().add(ltot_cost);
        
        tot_cost = new TextField();
        GridPane.setConstraints(tot_cost, 3, 19);
        grid.getChildren().add(tot_cost);
        
        final Label ltot_prof = new Label("Total monthly profit: ");
        ltot_prof.setFont(Font.font("Tahoma", 18));
        GridPane.setConstraints(ltot_prof, 2, 20);
        GridPane.setHalignment(ltot_prof, HPos.RIGHT);
        grid.getChildren().add(ltot_prof);
        
        tot_prof = new TextField();
        GridPane.setConstraints(tot_prof, 3, 20);
        grid.getChildren().add(tot_prof);
        
        Button update_results = new Button("Update Results");
        update_results.setFont(Font.font("Tahoma", 18));
        GridPane.setFillWidth(update_results, true);
        update_results.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setConstraints(update_results, 1, 30);
        update_results.setOnAction((ActionEvent event) ->
        {
            updateResults();
        });
        grid.getChildren().add(update_results);
        update_results.setStyle("-fx-base: #309c9c;");
        
        Button calc_results = new Button("Calculate Results");
        calc_results.setFont(Font.font("Tahoma", 18));
        GridPane.setFillWidth(calc_results, true);
        calc_results.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setConstraints(calc_results, 2, 30);
        calc_results.setOnAction((ActionEvent event) ->
        {
            calculateResults();
        });
        grid.getChildren().add(calc_results);
        calc_results.setStyle("-fx-base: #309c9c;");
        
        Button generate = new Button("Generate Report");
        generate.setFont(Font.font("Tahoma", 18));
        GridPane.setFillWidth(generate, true);
        generate.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setConstraints(generate, 3, 30);
        generate.setOnAction((ActionEvent event) ->
        {
            generateReport();
        });
        grid.getChildren().add(generate);
        generate.setStyle("-fx-base: #309c9c;");
        
        Button clear = new Button("Clear");
        clear.setFont(Font.font("Tahoma", 18));
        GridPane.setFillWidth(clear, true);
        clear.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setConstraints(clear, 4, 30);
        clear.setOnAction((ActionEvent event) ->
        {
            clear();
        });
        grid.getChildren().add(clear);
        clear.setStyle("-fx-base: #309c9c;");
        
        Scene scene = new Scene(grid, 1100, 675);
        
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        primaryStage.setTitle("Financial System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static String getMonth()
    {
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[Calendar.getInstance().get(Calendar.MONTH)];
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}