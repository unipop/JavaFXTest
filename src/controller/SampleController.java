package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleController {

	@FXML TextField textFieldSample;
	@FXML TextArea textAreaSample;
	@FXML Label labelSample1;
	@FXML Label labelSample2;
	@FXML Button buttonSample1;
	@FXML Button buttonSample2;

	@FXML public void mouseClickedEvent1() {
		System.out.println("mouseClickedEvent1");
		labelSample1.setText(textFieldSample.getText());
    }

	@FXML public void mouseClickedEvent2() {
		System.out.println("mouseClickedEvent2");
		labelSample2.setText(textAreaSample.getText());
	}

}
