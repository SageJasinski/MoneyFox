module com.example.moneyfox {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.moneyfox to javafx.fxml;
    exports com.example.moneyfox;
}