package FXMLControllerPackage.Login;

import Main.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField userName;
    @FXML
    private TextField passWord;
    @FXML
    private Label wrongCredentials;

    public void okButton(ActionEvent event) {

        System.out.println(userName.getText());
        System.out.println(passWord.getText());
        if (userName.getText().equals("admin")&&passWord.getText().equals("1234")) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Main/mainView.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.getIcons().add(new Image("/PicturePackage/login_Background.jpg"));
                stage.setFullScreen(false);
                stage.show();
                Main.stg.close();

                Alert alere = new Alert(Alert.AlertType.ERROR, "unable to connect to database");
                alere.showAndWait().ifPresent(response -> {
                    if (response == ButtonType.OK) {
                        System.out.println("i am in");
                    }
                });

            } catch (Exception e) {
                e.printStackTrace();
            }

        }else{
            userName.clear();
            passWord.clear();
            wrongCredentials.visibleProperty().setValue(true);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to format your system?");
            alert.setTitle("confirm");
            alert.show();
        }
    }

    public void cancel(ActionEvent actionEvent) {
        Main.stg.close();
    }




}
