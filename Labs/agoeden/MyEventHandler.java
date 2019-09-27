package agoeden;

import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyEventHandler{
	
	public MyEventHandler() {}
	
	public void onClick(Text text, Button button) {
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
		    public void handle(ActionEvent event) {
				text.setText("Button " + button.getId() + " was pressed.");
		    }
		});		
	}

}
