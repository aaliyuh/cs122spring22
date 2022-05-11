package projects.project1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.Queue;
import java.util.LinkedList;


public class ButtonPusher extends Application {
	Button addButton;
	Button remButton;
	Button clearButton;
	public FlowPane pane;
	TextField input;

	LinkedList q = new LinkedList(); 
	
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		primaryStage.setTitle("LinkedList Buttons");

		addButton = new Button("ADD");
		addButton.setOnAction(this::ButtonChoice);


		remButton = new Button("REMOVE");
		remButton.setOnAction(this::ButtonChoice);


		clearButton = new Button("CLEAR");
		clearButton.setOnAction(this::ButtonChoice);
		
		input = new TextField("test");
		input.setOnAction(this::ButtonChoice);
		
		

		pane = new FlowPane(addButton, remButton, clearButton, input);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setStyle("-fx-background-color: white");

		Scene scene = new Scene(pane, 200, 100);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void ButtonChoice(ActionEvent event) {
		try {
			if (event.getSource() == addButton ) {
				q.add(input.getText());
				System.out.println(q);
			}
			else if (event.getSource() == remButton) {
				q.remove();
			} 
			else if (event.getSource() == clearButton) {
				q.clear();
					  System.out.println(q);
				
			} 
		}
		catch (Exception e) {
				System.out.println("Error--Invalid Input.");
	 		}
	}
}


