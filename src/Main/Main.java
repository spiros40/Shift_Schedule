package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {


    static String LoginView= "/FXMLControllerPackage/Login/LoginView.fxml";
    static String MainView= "/Main/mainView.fxml";
    static String importEmployee="/FXMLControllerPackage/ImportEmployee/ImportEmployee.fxml";
    static String Menubar="/FXMLControllerPackage/MenuBar/MenuBar.fxml";
    static String FastBar= "/FXMLControllerPackage/FastButton/FastButtonView.fxml";
    static String ShiftView="/FXMLControllerPackage/ShiftView/ShiftView.fxml";



        public static void main(String[] args) {
            Application.launch(Main.class, args);
        }

    static public Stage stg;
        @Override
        public void start(Stage primaryStage) throws Exception {
            this.stg = primaryStage;
            Parent root = FXMLLoader.load(getClass().getResource(LoginView));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root, 400, 300));
            primaryStage.getIcons().add(new Image("/PicturePackage/LoginPic.png"));
            primaryStage.setResizable(false);
            primaryStage.initStyle(StageStyle.TRANSPARENT);;

            primaryStage.show();
        }


        /* //Parent root = FXMLLoader.load(getClass().getResource(LoginView));
        //Parent root = FXMLLoader.load(getClass().getResource(LoginView));
        //Parent root = FXMLLoader.load(getClass().getResource("/FXMLControllerPackage/Login/LoginView.fxml"));
        this.stg = stage;
        Parent root = FXMLLoader.load(getClass().getResource(MainView));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.getIcons().add(new Image("/PicturePackage/LoginPic.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }*/
}
