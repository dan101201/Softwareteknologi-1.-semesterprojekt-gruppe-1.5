module gui.semesterprojekt {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens gui.semesterprojekt to javafx.fxml;
    exports gui.semesterprojekt;
}