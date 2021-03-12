package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class Main extends Application{

	int width = 320;
	int height = 480;
	Scene scene; //MainMenu,LoginScreen;
	public static Stage window;
	String title = "Star Wars The Phantom Menace";
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
	/*
		//Parent root = FXMLLoader.load(getClass().getResource("Test.fxml"));	
		//Scene scene = new Scene(root,100,100);
		
		window.setTitle("test fxml");
		window.setScene(scene);
		window.show();
		*/
		
	
		try {
			
			//BorderPane root = new BorderPane();
		
					window.setScene(MainMenu.display(window,title, height, width));
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	

	
	public static void main(String[] args) {
		
		launch(args);
		
	}
}
