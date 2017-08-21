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
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author hp
 */
public class FinancialSystem extends Application {
    
    private static Connection conn = null;
    private static float TotCost = 0, TotRev = 0, TotProf = 0;
    
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
    
    private static void generateReport()
    {
        if(TotProf == 0 && TotRev == 0 && TotCost == 0)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Financial Values Not Generated");
            alert.setContentText("You have not generated the required financial values. Please click the \"Calculate Results\" button to do so.");
            alert.getDialogPane().setPrefSize(400, 200);
            alert.showAndWait();
            return; //prevents NullPointerException if calculateResults() has not been executed, due to the Connection variable having a null value
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
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setStyle("-fx-background-color: #c7eeee;");
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
        
        final TextField repair_prof = new TextField();
        GridPane.setConstraints(repair_prof, 1, 2);
        grid.getChildren().add(repair_prof);

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
        
        final TextField sales_cost = new TextField();
        GridPane.setConstraints(sales_cost, 3, 1);
        grid.getChildren().add(sales_cost);
        
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
        GridPane.setConstraints(lord_rev, 1, 8);
        GridPane.setHalignment(lord_rev, HPos.RIGHT);
        grid.getChildren().add(lord_rev);
        
        final TextField ord_rev = new TextField();
        GridPane.setConstraints(ord_rev, 2, 8);
        grid.getChildren().add(ord_rev);
        
        final Label lord_cost = new Label("Order costs: ");
        GridPane.setConstraints(lord_cost, 1, 9);
        GridPane.setHalignment(lord_cost, HPos.RIGHT);
        grid.getChildren().add(lord_cost);
        
        final TextField ord_cost = new TextField();
        GridPane.setConstraints(ord_cost, 2, 9);
        grid.getChildren().add(ord_cost);
        
        final Label lord_prof = new Label("Order profit: ");
        GridPane.setConstraints(lord_prof, 1, 10);
        GridPane.setHalignment(lord_prof, HPos.RIGHT);
        grid.getChildren().add(lord_prof);
        
        final TextField ord_prof = new TextField();
        GridPane.setConstraints(ord_prof, 2, 10);
        grid.getChildren().add(ord_prof);
        
        final Label lother_costs = new Label("Other costs: ");
        GridPane.setConstraints(lother_costs, 3, 8);
        GridPane.setHalignment(lother_costs, HPos.RIGHT);
        grid.getChildren().add(lother_costs);
        
        final TextField other_costs = new TextField();
        GridPane.setConstraints(other_costs, 4, 8);
        grid.getChildren().add(other_costs);
        
        final Label ltot_rev = new Label("Total monthly revenue: ");
        GridPane.setConstraints(ltot_rev, 2, 18);
        GridPane.setHalignment(ltot_rev, HPos.RIGHT);
        grid.getChildren().add(ltot_rev);
        
        final TextField tot_rev = new TextField();
        GridPane.setConstraints(tot_rev, 3, 18);
        grid.getChildren().add(tot_rev);
        
        final Label ltot_cost = new Label("Total monthly costs: ");
        GridPane.setConstraints(ltot_cost, 2, 19);
        GridPane.setHalignment(ltot_cost, HPos.RIGHT);
        grid.getChildren().add(ltot_cost);
        
        final TextField tot_cost = new TextField();
        GridPane.setConstraints(tot_cost, 3, 19);
        grid.getChildren().add(tot_cost);
        
        final Label ltot_prof = new Label("Total monthly profit: ");
        GridPane.setConstraints(ltot_prof, 2, 20);
        GridPane.setHalignment(ltot_prof, HPos.RIGHT);
        grid.getChildren().add(ltot_prof);
        
        final TextField tot_prof = new TextField();
        GridPane.setConstraints(tot_prof, 3, 20);
        grid.getChildren().add(tot_prof);
        
        Button update_results = new Button("Update Results");
        GridPane.setFillWidth(update_results, true);
        update_results.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setConstraints(update_results, 1, 30);
        update_results.setOnAction((ActionEvent event) ->
        {
            try
            {
                TotRev = Float.parseFloat(tot_rev.getText());
                TotCost = Float.parseFloat(tot_cost.getText());
                TotProf = Float.parseFloat(tot_prof.getText());
                
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText("Financial values updated");
                alert.setContentText("The financial values have been successfully updated.");
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
        });
        grid.getChildren().add(update_results);
        update_results.setStyle("-fx-base: #309c9c;");
        
        Button calc_results = new Button("Calculate Results");
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
        GridPane.setFillWidth(clear, true);
        clear.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setConstraints(clear, 4, 30);
        clear.setOnAction((ActionEvent event) ->
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