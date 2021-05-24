package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import DataPackage.ViewsEnums;

public class Main extends Application {


        public static void main(String[] args) {
            Application.launch(Main.class, args);
        }

    static public Stage stg;
        @Override
        public void start(Stage primaryStage) throws Exception {
            this.stg = primaryStage;
            Parent root = FXMLLoader.load(getClass().getResource(ViewsEnums.loginView.getViewPath()));
            primaryStage.setTitle(ViewsEnums.loginView.getTitleName());
            primaryStage.setScene(new Scene(root, 400, 300));
            primaryStage.getIcons().add(new Image(ViewsEnums.loginView.getWindowPicture()));
            primaryStage.setResizable(false);
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            primaryStage.show();
        }

}
