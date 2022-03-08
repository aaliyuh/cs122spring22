package classSamples.gui2.ImageDisplay;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//************************************************************************
//  ImageDisplay.java       Author: Lewis/Loftus
//
//  Demonstrates a the use of Image and ImageView objects.
//************************************************************************

public class ImageDisplay extends Application {
	// --------------------------------------------------------------------
	// Displays an image centered in a window.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Image img = new Image("classSamples/gui2/ImageDisplay/gull.jpg");
		ImageView imgView = new ImageView(img);
		Image im2 = new Image("");
		ImageView = imgView2 = new ImageVier(img2);

		StackPane pane = new StackPane(imgView2, imgView);
		pane.setStyle("-fx-background-color: pink");
		imgView.setViewport(new Rectangle2D(200, 80, 70, 60));
		imgView2.setViewPort(new Rectangle(150,60,150,150));

		Scene scene = new Scene(pane, 500, 350);

		primaryStage.setTitle("Image Display");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}