package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class controller {
	
	@FXML
	public void startButton(ActionEvent event){
		Parent root  = FXMLLoader.load(getClass().getResource("minterms.fxml"));
		Scene scene = new Scene(root,1200,600);
		Stage try_stage = (Stage) ((Node) event.getSource()).getScene.getWindow;
		try_stage.setScene(scene);
		try_stage.show();
		
	}

}
