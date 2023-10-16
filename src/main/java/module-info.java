module com.example.xdlolkalkulaor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.xdlolkalkulaor to javafx.fxml;
    exports com.example.xdlolkalkulaor;
}