module com.example.cms {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.cms to javafx.fxml;
    exports com.example.cms;
}