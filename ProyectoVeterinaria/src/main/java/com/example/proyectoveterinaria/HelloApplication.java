package com.example.proyectoveterinaria;

import com.example.proyectoveterinaria.Vistas.MenuPrincipal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MenuPrincipal root = new MenuPrincipal();
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Registro de citas animalia");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
