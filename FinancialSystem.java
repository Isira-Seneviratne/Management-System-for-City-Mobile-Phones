/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialsystem;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class FinancialSystem extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
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
        grid.getChildren().add(calc_results);

        Button generate = new Button("Generate report");
        GridPane.setFillWidth(generate, true);
        generate.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setConstraints(generate, 3, 20);
        generate.setOnAction((ActionEvent event) ->
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Success!");
            alert.setContentText("A monthly financial report has been generated.");
            
            alert.showAndWait();
        });
        grid.getChildren().add(generate);
        
        Scene scene = new Scene(grid, 900, 500);
        
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        primaryStage.setTitle("Financial System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}