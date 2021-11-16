module gui.semesterprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui.semesterprojekt to javafx.fxml;
    exports gui.semesterprojekt;
}