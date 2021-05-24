package FXMLControllerPackage.MenuBar;

import Main.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import DataPackage.ViewsEnums;

public class MenuBarController {

    //Create new window
    public void openNewWindow(String windowToOpen,String windowTitle,String imagePath){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(windowToOpen));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(windowTitle);
            stage.getIcons().add(new Image(imagePath));
            Main.stg.close();
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void editEmployee() {
        openNewWindow(ViewsEnums.importEmployee.getViewPath(), ViewsEnums.importEmployee.getTitleName(),
                ViewsEnums.importEmployee.getWindowPicture());
    }

    public void addNewShift() {
        openNewWindow(ViewsEnums.addNewShift.getViewPath(), ViewsEnums.addNewShift.getTitleName(),
                ViewsEnums.addNewShift.getWindowPicture());
    }

    public void editShift() {
        openNewWindow(ViewsEnums.addNewShift.getViewPath(), ViewsEnums.addNewShift.getTitleName(),
                ViewsEnums.addNewShift.getWindowPicture());
    }
}
