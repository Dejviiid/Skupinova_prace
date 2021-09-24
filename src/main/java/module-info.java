module com.example.skupinova_prace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.skupinova_prace to javafx.fxml;
    exports com.example.skupinova_prace;
}