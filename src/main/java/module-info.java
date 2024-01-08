module com.example.td_sitd_moussaoui_amina {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.td_sitd_moussaoui_amina to javafx.fxml;
    exports com.example.td_sitd_moussaoui_amina;
}