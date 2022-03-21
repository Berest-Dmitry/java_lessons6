module com.example._35_savanchuk {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._35_savanchuk to javafx.fxml;
    exports com.example._35_savanchuk;
}