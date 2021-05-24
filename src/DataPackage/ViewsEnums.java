package DataPackage;

public enum ViewsEnums {

    loginView("/FXMLControllerPackage/Login/LoginView.fxml","Login",
            "/PicturePackage/login_Background.jpg"),
    importEmployee("/FXMLControllerPackage/ImportEmployee/ImportEmployee.fxml",
            "New Employee","/PicturePackage/login_Background.jpg"),
    ShiftView("/FXMLControllerPackage/ShiftView/ShiftView.fxml","Shift View",
            "/PicturePackage/login_Background.jpg"),
    MainView("/Main/mainView.fxml","Main View",
            "/PicturePackage/login_Background.jpg"),
    addNewShift("/FXMLControllerPackage/AddNewShift/AddNewShift.fxml","Add new Shift",
            "/PicturePackage/login_Background.jpg");


    private String viewPath, titleName, windowPicture;


    ViewsEnums(String viewName, String titleName, String windowPicture){
        this.viewPath=viewName;
        this.titleName=titleName;
        this.windowPicture=windowPicture;
    }

    public String getViewPath() {
        return viewPath;
    }

    public String getTitleName() {
        return titleName;
    }

    public String getWindowPicture() {
        return windowPicture;
    }


}
