package application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Login {

	public static Scene display(Stage window, String title, int width, int height) {
		window.setTitle(title);
		
		
		// Username Input
		Label lblUsername = new Label("Enter your Username");
		TextField txtUsername = new TextField();
		txtUsername.setPromptText("Enter your Username");
		
		// Password Input
		Label lblPassword = new Label("Enter your Password");
		PasswordField passwordField = new PasswordField();
		passwordField.setPromptText("Enter your Password");
		
		
		Button btnSubmit = new Button("Submit");
		btnSubmit.setId("Submit");
		
		btnSubmit.setOnAction(e->System.out.println("Button : "+((Control)e.getSource()).getId()+" has been pressed"));
		Label lblForgotPassword = new Label("Did you forget your ");
		
		Button btnResetPassword = new Button("password?");
		btnResetPassword.setStyle("-fx-text-fill: #0000ff;");
		HBox resetPasswordLayout = new HBox();
		resetPasswordLayout.getChildren().addAll( lblForgotPassword,btnResetPassword);
		
		
		VBox layout = new VBox(); 
		layout.getChildren().addAll(lblUsername,txtUsername, lblPassword, passwordField, resetPasswordLayout, btnSubmit);
		
		
		Scene scene = new Scene(layout, width, height);
		scene.getStylesheets().add(Login.class.getResource("DarkTheme.css").toExternalForm());
		window.setScene(scene);
		
		return (scene);
		
				
	}
	
}
