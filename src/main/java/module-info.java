module com.example.cms {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens controllers to javafx.fxml;
    opens models to javafx.base;

    exports main;
    opens main to javafx.fxml;
    exports controllers;
    exports models;
}