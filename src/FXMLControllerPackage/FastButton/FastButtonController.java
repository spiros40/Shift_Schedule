package FXMLControllerPackage.FastButton;

import Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class FastButtonController {


    @FXML
    public void MonthView(ActionEvent actionEvent) {
        System.out.println("month");
        try{
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("/FXMLControllerPackage/Login/LoginView.fxml"));
            Parent root=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("new win");
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("/PicturePackage/LoginPic.png"));
            stage.show();

    }catch (Exception e){
            System.out.println("error");
        }
    }

    @FXML
    public void WeekView(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXMLControllerPackage/Login/LoginView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("/PicturePackage/loginBackground.jpg"));
            Main.stg.close();
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
    @FXML
    public void DayView(ActionEvent actionEvent) {

    }
    @FXML
    public void Employee(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXMLControllerPackage/ImportEmployee/ImportEmployee.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Employee View");
            stage.getIcons().add(new Image("/PicturePackage/login_Background.jpg"));
            Main.stg.close();
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void Save(ActionEvent actionEvent) {
        System.out.println("save");
    }
}
