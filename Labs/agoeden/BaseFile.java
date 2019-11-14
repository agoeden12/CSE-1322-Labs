package agoeden;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BaseFile extends Application {

    File file;
    TextField fileNameInput = new TextField("");
    String outputString = fileNameInput.getText();
    TextField fileContent = new TextField("");

    Button saveButton = new Button("Save");
    Button findButton = new Button("Find");
    Label fileNameLabel = new Label("Input file name:");
    Label fileContentLabel = new Label("File Content");
    Label labelNotFoundLabel = new Label("");

    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        Scene scene = new Scene(root, 405, 300);

        fileContent.setMinSize(100, 100);

        findButton.setOnAction(e -> {
            try {
                fileButtons(findButton);
            } catch (IOException ex) {
                labelNotFoundLabel.setText("File not found!");
            }
        });
        saveButton.setOnAction(e -> {
            try {
                fileButtons(saveButton);
            } catch (IOException ex) {
            }
        });
        GridPane.setConstraints(fileNameLabel, 0, 0);
        GridPane.setConstraints(fileNameInput, 0, 1);
        GridPane.setConstraints(findButton, 0, 2);
        GridPane.setConstraints(labelNotFoundLabel, 1, 1);
        GridPane.setConstraints(labelNotFoundLabel, 2, 1);
        GridPane.setConstraints(fileContentLabel, 0, 3);
        GridPane.setConstraints(fileContent, 0, 4);
        GridPane.setConstraints(saveButton, 0, 5);

        root.getChildren().addAll(findButton, fileNameInput, fileNameLabel, fileContent, saveButton, fileContentLabel,
                labelNotFoundLabel);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void fileButtons(Button button) throws FileNotFoundException, IOException {
        if ("Find".equalsIgnoreCase(button.getText())) {
            if (fileNameInput.equals("")) {
                System.out.println("Need a file name!");
            } else {

                labelNotFoundLabel.setText("");
                String fileName = fileNameInput.getText();
                fileContent.setText("");
                file = new File(String.format("Labs/agoeden/%s.txt", fileName));

                BufferedReader reader = new BufferedReader(new FileReader(file));

                String st;
                if (fileContent.getText().equals("")) {
                    while ((st = reader.readLine()) != null) {
                        fileContent.appendText(st + " ");
                    }
                }
                reader.close();
            }
        } else if ("Save".equalsIgnoreCase(button.getText())) {
            String output = "";
            if (fileNameInput.equals("")) {
                System.out.println("Need a file name!");
            } else {
                if (fileContent.getText() == null) {
                    output = "";
                }
                output = fileContent.getText();
                FileWriter fw = new FileWriter(file, false);
                fw.write(output);
                fw.flush();
                fw.close();
                file = null;
                System.out.println("File Updated!");
                fileContent.setText("");
                fileNameInput.setText("");
            }

        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}