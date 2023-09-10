package org.learnings4success.day1.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class InvestmentCalculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getClassLoader().getResource("InvestmentCalculator.xml");
        Parent root = FXMLLoader.load(location);
        primaryStage.setTitle("Investment Calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
