package agoeden;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lab3ATest extends Application{

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Andrew's Lab");
		
		MyEventHandler eventHandler = new MyEventHandler();
		Text mainText = new Text("Nothing has been pressed.");
		
		Insets myPadding = new Insets(6,6,6,6);
		
		VBox root = new VBox();
		root.setPadding(myPadding);
		root.getChildren().add(mainText);
		
		for(int i = 1; i < 7; i++) {
			Button b1 = new Button();
			b1.setPadding(myPadding);
			b1.setText("" + i);
			b1.setId("" + i);
			eventHandler.onClick(mainText, b1);
			root.getChildren().add(b1);
		}
		
		Scene scene = new Scene(root, 200, 250);
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
}