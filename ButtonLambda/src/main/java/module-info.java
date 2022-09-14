module com.kamathad.buttonlambda {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kamathad.buttonlambda to javafx.fxml;
    exports com.kamathad.buttonlambda;
}