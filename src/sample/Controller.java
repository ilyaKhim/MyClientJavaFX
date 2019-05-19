package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import javax.swing.text.html.ImageView;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller  {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    public void sendMsg(){
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }





}
