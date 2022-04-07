package classSamples.gui2.FahrenheitConverter;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//************************************************************************
//  FahrenheitConverter.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a TextField and a GridPane.
//************************************************************************

public class FahrenheitConverter extends Application {
	// --------------------------------------------------------------------
	// Launches the temperature converter application.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new FahrenheitPane(), 300, 150);

		primaryStage.setTitle("Fahrenheit Converter");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter an integer");
	
	try {
		int num1 = scan.nextInt();
		System.out.println(num1);
	} catch (Exception e){
		System.out.println("That is not an integer. Please try again.");
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
