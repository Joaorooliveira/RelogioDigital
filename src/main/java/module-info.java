module br.com.joaov.relogiodigital {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens br.com.joaov.relogiodigital to javafx.fxml;
    exports br.com.joaov.relogiodigital;
}