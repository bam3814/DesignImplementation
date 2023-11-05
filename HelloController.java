package com.example.designimplementation;



import javafx.animation.TranslateTransition;
import javafx.scene.control.*;
import javafx.scene.shape.Circle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.util.Duration;


import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private Button cropGrowth;

    @FXML
    private TextArea cropGrowthArea;

    @FXML
    private Button financialManagement;

    @FXML
    private TextArea financialManagementArea;

    @FXML
    private Button harvestTracker;

    @FXML
    private TextArea harvestTrackerArea;

    @FXML
    private Button inventoryTracker;

    @FXML
    private TextArea inventoryTrackerArea;

    @FXML
    private Button soilMoisture;

    @FXML
    private TextArea soilMoistureArea;

    @FXML
    private Button waterpH;

    @FXML
    private TextArea waterpHArea;

    @FXML
    private TreeView<String> treeView;


    @FXML
    private Circle drone;

    @FXML
    private Button farm;

    @FXML
    private Button farm2;

    @FXML
    private Button home;

    @FXML
    void selectItem(ActionEvent event) {


    }


    @FXML
    void handleFarm(ActionEvent event) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), drone);

        double endX = Math.random() * (320 - (2 * drone.getRadius()));
        double endY = Math.random() * (240 - (2 *drone.getRadius()));

        transition.setToX(endX);
        transition.setToY(endY);

        transition.play();
    }




    @FXML
    void handleFarm2(ActionEvent event) {

    }


    @FXML
    void handleHome(ActionEvent event) {

    }
    @FXML
    void handlecropGrowth(ActionEvent event) {
        double crop = Math.random() * 100;
        cropGrowthArea.setText(cropGrowthArea.getText() + crop + " CGR" + "\n");

    }

    @FXML
    void handlefinancialManagement(ActionEvent event) {
        double financial = Math.random() * 100000;
        financialManagementArea.setText(financialManagementArea.getText() + "$" + financial + "\n");

    }

    @FXML
    void handleinventoryTracker(ActionEvent event) {
        double seeds = Math.random() * 20;
        double cropsHarvested = Math.random() * 15;
        inventoryTrackerArea.setText(inventoryTrackerArea.getText() + "Amount of seeds bought: "
        + seeds + "\n" + "Crops harvested: " + cropsHarvested + "\n");

    }

    @FXML
    void handlesoilMoisture(ActionEvent event) {
        double soil = Math.random() * 10;
        soilMoistureArea.setText(soilMoistureArea.getText() + soil + " wfv" + "\n");

    }

    @FXML
    void handlewaterpH(ActionEvent event) {
        double water = Math.random() * 14;
        waterpHArea.setText(waterpHArea.getText() + water + "\n");

    }

    @FXML
    void handleHarvestTracker(ActionEvent event) {
        double harvest = Math.random() * 1000;
        harvestTrackerArea.setText(harvestTrackerArea.getText() + "Time elapsed: " + harvest + "minutes" + "\n");

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> rootItem = new TreeItem<>("Root");


        TreeItem<String> branchItem1 = new TreeItem<>("Command Center");
        TreeItem<String> branchItem2 = new TreeItem<>("Barn");


        rootItem.getChildren().addAll(branchItem1,branchItem2);
        treeView.setRoot(rootItem);
    }
}



