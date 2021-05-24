package FXMLControllerPackage.Login;

import Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;
import DataPackage.ViewsEnums;

public class LoginController {

    @FXML
    private TextField userName;
    @FXML
    private TextField passWord;
    @FXML
    private Label wrongCredentials;


    public void okButton(ActionEvent event) {
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        System.out.println(userName.getText());
        System.out.println(passWord.getText());
        if (userName.getText().equals("admin")&&passWord.getText().equals("1234")) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(ViewsEnums.MainView.getViewPath()));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root,screenBounds.getWidth(),screenBounds.getHeight()));
                stage.setTitle(ViewsEnums.MainView.getTitleName());
                stage.getIcons().add(new Image(ViewsEnums.MainView.getWindowPicture()));
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
