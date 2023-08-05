module com.example.fxejemplo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.fxejemplo to javafx.fxml;
    exports com.example.fxejemplo;
}