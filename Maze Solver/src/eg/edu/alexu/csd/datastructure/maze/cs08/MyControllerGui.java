package eg.edu.alexu.csd.datastructure.maze.cs08;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class MyControllerGui {

	MazeSolver m = new MazeSolver();
	public StringBuilder answer = new StringBuilder();

	@FXML
	private ListView lv1;

	public void fileChoose(ActionEvent e) {
		FileChooser f1 = new FileChooser();
		File f2 = f1.showOpenDialog(null);
		if (f2 != null) {
			lv1.getItems().add(f2.getAbsolutePath());
		}
	}

	@FXML
	private TextArea BFS;
	@FXML
	private TextArea DFS;
	@FXML
	private Label lbpath;

	public void passpath(ActionEvent e) throws IOException {
		if ((boolean) lv1.getItems().isEmpty()) {
			lbpath.setText("YOU SHOULD ENTER A PATH");
		} else {
			String path = (String) lv1.getItems().get(0);
			m.solveBFS(new File(path));
			for (int i = 0; i < m.counter; i++) {
				answer.append("(");
				answer.append(m.path[i][0]);
				answer.append(",");
				answer.append(m.path[i][1]);
				answer.append(")");
				answer.append("\n");
			}
			BFS.setText(String.valueOf(answer));
		}
	}

	public void passpath2(ActionEvent e) throws IOException {
		if ((boolean) lv1.getItems().isEmpty()) {
			lbpath.setText("YOU SHOULD ENTER A PATH");
		} else {
			String path = (String) lv1.getItems().get(0);
			m.solveDFS(new File(path));
			for (int i = 0; i < m.counter; i++) {
				answer.append("(");
				answer.append(m.path[i][0]);
				answer.append(",");
				answer.append(m.path[i][1]);
				answer.append(")");
				answer.append("\n");
			}
			DFS.setText(String.valueOf(answer));
		}
	}
}
