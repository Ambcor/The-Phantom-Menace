package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainMenu {
	
	public static Scene display(Stage window, String title,int height, int width) {
						
			window.setTitle(title);
						
			// Creating the buttons and Setting the id for each.
			Button btnLogin = new Button("Login");
			btnLogin.setId("Login");
			Button btnRegister = new Button("Register New Player");
			btnRegister.setId("Register");
			Button btnConfiguration = new Button("Configuration");
			btnConfiguration.setId("Configuration");
			Button btnUninstall = new Button("Uninstall Game");
			btnUninstall.setId("Uninstall");
			Button btnExit = new Button("Exit");
			btnExit.setId("Exit");
			
			// Adding the Event to each component.
		
			btnLogin.setOnAction(event->{
				try {
					window.setScene(Login.display(window, title, width, height));
				} catch(Exception e) {
					e.printStackTrace();
				}
						
				}
			);
			//btnRegister.setOnAction(this);
			//btnConfiguration.setOnAction(this);
			//btnUninstall.setOnAction(this);
			
			btnExit.setOnAction(event->{
				try {
					exitProgram(window);
				} catch(Exception e) {
					e.printStackTrace();
				}
						
				}
			);
			
			// Creating the layout for the render.
			VBox layout = new VBox();
			
			// Adding Elements to the layout.
			layout.getChildren().addAll(btnLogin, btnRegister, btnConfiguration, btnUninstall, btnExit);
		
			Scene scene = new Scene(layout, width, height);
			//scene.getStylesheets().add(getClass().getResource("DarkTheme.css").toExternalForm());
			scene.getStylesheets().add(Login.class.getResource("DarkTheme.css").toExternalForm());
			return (scene);
		}
	
	public static void exitProgram(Stage window) {
		window.close();
	}
	
	
	/*
@Override
public void handle(ActionEvent event) {
	
	switch (((Control)event.getSource()).getId()) {
	case "Login": 
		//System.out.println("Button : "+((Control)event.getSource()).getId()+" has been pressed");
		
		//AlertBox.display("Test", "This is a test");
		break;
	case "Register": 
		System.out.println("Button : "+((Control)event.getSource()).getId()+" has been pressed");
		break;
	case "Configuration": 
		System.out.println("Button : "+((Control)event.getSource()).getId()+" has been pressed");
		break;
	case "Uninstall": 
		System.out.println("Button : "+((Control)event.getSource()).getId()+" has been pressed");
		break;
	case "Exit": 
		window.close();
		break;
	default: 
		System.out.println("Button : "+((Control)event.getSource()).getId()+" has been pressed");
		break;
	}

}
*/}
