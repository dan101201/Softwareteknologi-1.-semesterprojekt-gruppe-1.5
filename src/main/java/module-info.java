module gui.semesterprojekt {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires java.desktop;


    opens gui.semesterprojekt to javafx.fxml;
    exports gui.semesterprojekt;
}