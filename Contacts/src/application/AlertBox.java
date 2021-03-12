package application;

import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class AlertBox {

	public static void display(String title, String mesaje) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(200);
		window.setMinHeight(200);		
		
		Label lblmessage = new Label(mesaje);
		Button btnExit = new Button("Close Window");
		
		// Setting the acctions	
		btnExit.setOnAction(e->window.close());
		
		// Adding the controllers to the layout.
		VBox layout = new VBox(20);
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().addAll(lblmessage,btnExit);
		
		// Creating the Scene.
		Scene scene = new Scene(layout);
		
		// Appending the Scene to the window.
		window.setScene(scene);
		window.showAndWait();
	}
	
}
