module Shift.Schedule {

    requires javafx.fxml;
    requires javafx.controls;

    opens Main;
    opens EmployeePackage;
    opens MachinePackage;
    opens ExtraWorkPackage;
    opens FXMLControllerPackage.Login;
    opens FXMLControllerPackage.ImportEmployee;
    opens FXMLControllerPackage.ShiftView;
    opens FXMLControllerPackage.MenuBar;
    opens FXMLControllerPackage.FastButton;
    //opens DataPackage;
    opens PicturePackage;
    opens StylePackage;
    opens StylePackage.LoginStyle;
    opens StylePackage.MenuBar;
    opens StylePackage.FastButtonStyle;
    opens StylePackage.Table;
    opens StylePackage.importEmployee;






}