package com.example.proyectoveterinaria;

import com.example.proyectoveterinaria.Vistas.MenuPrincipal;
import com.example.proyectoveterinaria.Vistas.VentanaLogin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VentanaLogin root = new VentanaLogin();
        Scene scene = new Scene(root, 500, 700);
        stage.setTitle("Registro de citas animalia");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
