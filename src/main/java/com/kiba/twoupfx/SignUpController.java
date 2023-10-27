package com.kiba.twoupfx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private Button back;
    @FXML
    private TextField playerName;
    @FXML
    private PasswordField password;
    @FXML
    private Button signup;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "two-up.fxml", null, null);
            }
        });

        signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.signUpUser(event, "game-time.fxml", playerName.getText(), password.getText());
            }
        });
    }


}
