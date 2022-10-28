module com.example.yildizileucgenyapimi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.yildizileucgenyapimi to javafx.fxml;
    exports com.example.yildizileucgenyapimi;
}