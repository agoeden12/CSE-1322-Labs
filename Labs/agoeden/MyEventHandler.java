package agoeden;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyEventHandler{
	
	public MyEventHandler() {}
	
	public void onClick(Label text, int val1, int val2, Button button) {
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
		    public void handle(ActionEvent event) {
				text.setText(val1 + val2 + "");
		    }
		});		
	}

}
