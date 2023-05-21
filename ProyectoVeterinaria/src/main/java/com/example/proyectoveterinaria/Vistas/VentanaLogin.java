package com.example.proyectoveterinaria.Vistas;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;

public class VentanaLogin extends BorderPane {
    //Componentes
    URL urllogo;
    Label iniciosesion;
    TextField txfiniciosesion;
    Label contrasena;
    PasswordField pswcontrasena;
    Button btnlogin;

    public void InicializarComponentes(){
        //Logo
        urllogo = this.getClass().getResource("ANIMALIA.png");
        Image imagelogo = new Image(urllogo.toString());
        ImageView imageViewlogo = new ImageView(imagelogo);

        VBox opclogin = new VBox();
        HBox ContLogo = new HBox();

        iniciosesion = new Label("Inicio de sesión");
        iniciosesion.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 14;");
        txfiniciosesion = new TextField();
        txfiniciosesion.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");
        txfiniciosesion.setPromptText("Nombre de usuario");
        txfiniciosesion.setMaxWidth(150);
        txfiniciosesion.setMaxHeight(30);
        contrasena = new Label("Contraseña");
        contrasena.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 14;");
        pswcontrasena = new PasswordField();
        pswcontrasena.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");
        pswcontrasena.setPromptText("Contraseña");
        pswcontrasena.setMaxWidth(150);
        pswcontrasena.setMaxHeight(30);
        btnlogin = new Button("Iniciar sesión");
        btnlogin.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-background-radius: 5;");

        //Ordenar los componentes
        opclogin.getChildren().addAll(iniciosesion, txfiniciosesion, contrasena, pswcontrasena, btnlogin);
        opclogin.setAlignment(Pos.CENTER);
        opclogin.setSpacing(8);
        ContLogo.getChildren().addAll(imageViewlogo);
        ContLogo.setAlignment(Pos.TOP_CENTER);
        setTop(ContLogo);
        imageViewlogo.setLayoutX(250);
        setCenter(opclogin);
        setMargin(ContLogo, new Insets(10, 10, 0, 10));
        setMargin(opclogin, new Insets(10, 10, 0, 10));

    }
}
