package com.example.proyectoveterinaria;

import com.example.proyectoveterinaria.Vistas.VentanaLogin;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        VentanaLogin root = new VentanaLogin(stage); //Revibe como parametro el stage
        Scene scene = new Scene(root, 550, 700);
        stage.setTitle("Registro de citas animalia");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
