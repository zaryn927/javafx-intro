package edu.cnm.deepdive.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
  @FXML
  private Text actionTarget;
  
  @FXML
  protected void handleButton(ActionEvent evt) {
    actionTarget.setText("Clicked");
  }
}
