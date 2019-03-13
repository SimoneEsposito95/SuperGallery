package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private AnchorPane anchorID;

    @FXML
    private TextField textFieldID;

    @FXML
    private void handleButtonAction(ActionEvent event){

        final DirectoryChooser dirChooser = new DirectoryChooser();

        Stage stage = (Stage) anchorID.getScene().getWindow();
        File file = dirChooser.showDialog(stage);

        if (file != null) {
            System.out.println("Path: " + file.getAbsolutePath());
            textFieldID.setText(file.getAbsolutePath());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

}