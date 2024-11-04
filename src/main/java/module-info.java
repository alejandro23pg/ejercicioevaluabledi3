module com.example.ejercicioevaluable3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.ejercicioevaluable3 to javafx.fxml;
    exports com.example.ejercicioevaluable3;
}