module com.example.projekt_4gewinnt {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.projekt_4gewinnt to javafx.fxml;
    exports com.example.projekt_4gewinnt;
}