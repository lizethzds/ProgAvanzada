module com.example.proyectoveterinaria {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.proyectoveterinaria to javafx.fxml;
    exports com.example.proyectoveterinaria;
    exports com.example.proyectoveterinaria.Modelos;
    opens com.example.proyectoveterinaria.Modelos to javafx.fxml;
}