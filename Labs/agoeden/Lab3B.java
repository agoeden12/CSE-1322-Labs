package agoeden;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lab3B extends Application{

	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Andrew's Lab 3B");
		Insets myPadding = new Insets(6,6,6,6);
		
		MyEventHandler eventHandler = new MyEventHandler();

		Label inputOneLabel = new Label("Enter number 1");
		Label inputTwoLabel = new Label("Enter number 2");
		
		TextField inputOneTextField = new TextField();
		TextField inputTwoTextField = new TextField();
		
		Button sumButton = new Button();
		sumButton.setPadding(myPadding);
		sumButton.setText("Add Numbers");
		
		Label resultLabel = new Label();
		
		eventHandler.onClick(resultLabel, Integer.parseInt(inputOneTextField.getText()), Integer.parseInt(inputTwoTextField.getText()), sumButton);
		
		GridPane root = new GridPane();
		root.setVgap(2);
		root.setHgap(2);
		root.setPadding(myPadding);
		root.add(inputOneLabel, 0, 0);
		root.add(inputTwoLabel, 0, 1);
		root.add(inputOneTextField, 1, 0);
		root.add(inputTwoTextField, 1, 1);
		root.add(sumButton, 0, 2);
		root.add(resultLabel, 2, 2);
		
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
}