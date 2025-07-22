module com.example.humanjavafxform {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.humanjavafxform to javafx.fxml;
    exports com.example.humanjavafxform;
}