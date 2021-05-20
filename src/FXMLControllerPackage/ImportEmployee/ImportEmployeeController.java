package FXMLControllerPackage.ImportEmployee;

import javafx.event.ActionEvent;
import javafx.beans.property.*;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ImportEmployeeController {

    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField department;
    @FXML
    private TextField profession;
    @FXML
    private TextField birthDate;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField homeAddress;
    @FXML
    private TextField AMKA;
    @FXML
    private TextField AFM;
    @FXML
    private TextField AMA;


    public void saveEmployee(ActionEvent event) {

        System.out.println(firstName.getText());
        System.out.println(lastName.getText());
        System.out.println(department.getText());
        System.out.println(profession.getText());
        System.out.println(birthDate.getText());
        System.out.println(phoneNumber.getText());
        System.out.println(homeAddress.getText());
        System.out.println(AMKA.getText());
        System.out.println(AFM.getText());
        System.out.println(AMA.getText());



    }
}
