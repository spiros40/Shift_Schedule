package FXMLControllerPackage.FastButton;


import Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;
import DataPackage.ViewsEnums;

public class FastButtonController {

    //Create new window
    public void openNewWindow(String windowToOpen,String windowTitle,String windowImage){
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(windowToOpen));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root,screenBounds.getWidth(),screenBounds.getHeight()));
            stage.setTitle(windowTitle);
            stage.getIcons().add(new Image(windowImage));
            Main.stg.close();
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Main.stg.close();
    }

    @FXML
    public void MonthView(ActionEvent actionEvent) {

    }

    @FXML
    public void WeekView(ActionEvent event) {


    }
    @FXML
    public void DayView(ActionEvent actionEvent) {

    }
    @FXML
    public void Employee(ActionEvent actionEvent){openNewWindow(ViewsEnums.importEmployee.getViewPath(),
            ViewsEnums.importEmployee.getTitleName(), ViewsEnums.importEmployee.getWindowPicture());
    }
    @FXML
    public void Save(ActionEvent actionEvent) {
        System.out.println("save");



    }
}
