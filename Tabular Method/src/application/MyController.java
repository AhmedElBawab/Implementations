package application;

import java.io.File;
import java.io.IOException;

import com.sun.glass.ui.Window;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MyController {
	

	public void startButton(ActionEvent e) throws IOException{
		Stage primaryStage = new Stage(); 
		Parent root  = FXMLLoader.load(getClass().getResource("Start.fxml"));
		Scene scene = new Scene(root,1200,600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("TABULAR METHOD APP ^_^");
		primaryStage.show();
	}
	
	public void endButton(ActionEvent e) throws IOException{
		Stage primaryStage = new Stage(); 
		Parent root  = FXMLLoader.load(getClass().getResource("Close.fxml"));
		Scene scene = new Scene(root,400,200);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("TABULAR METHOD APP ^_^");
		primaryStage.show();
	}
	
	public void close(ActionEvent e){
		
	}
	
	public void restart(ActionEvent e) throws IOException{
		Stage primaryStage = new Stage(); 
		Parent root  = FXMLLoader.load(getClass().getResource("MainGui.fxml"));
		Scene scene = new Scene(root,1200,600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("TABULAR METHOD APP ^_^");
		primaryStage.show();
	}
	
	public void programme(ActionEvent e) throws IOException{
		Stage primaryStage = new Stage(); 
		Parent root  = FXMLLoader.load(getClass().getResource("aboutProgramme.fxml"));
		Scene scene = new Scene(root,1200,600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("TABULAR METHOD APP ^_^");
		primaryStage.show();
	}
	
	public void us(ActionEvent e) throws IOException{
		Stage primaryStage = new Stage(); 
		Parent root  = FXMLLoader.load(getClass().getResource("aboutUS.fxml"));
		Scene scene = new Scene(root,355,125);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("TABULAR METHOD APP ^_^");
		primaryStage.show();
	}
	
	public void manulal(ActionEvent e) throws IOException{
		Stage primaryStage = new Stage(); 
		Parent root  = FXMLLoader.load(getClass().getResource("manual.fxml"));
		Scene scene = new Scene(root,1200,600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("TABULAR METHOD APP ^_^");
		primaryStage.show();
	}
	
	public void choose(ActionEvent e) throws IOException{
		Stage primaryStage = new Stage(); 
		Parent root  = FXMLLoader.load(getClass().getResource("choose.fxml"));
		Scene scene = new Scene(root,1200,600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("TABULAR METHOD APP ^_^");
		primaryStage.show();
	}
	
	public void fileChoose(ActionEvent e){
		FileChooser f1 = new FileChooser();
		File f2 = f1.showOpenDialog(null);
		if(f2!=null){
			
		}
	}
}
