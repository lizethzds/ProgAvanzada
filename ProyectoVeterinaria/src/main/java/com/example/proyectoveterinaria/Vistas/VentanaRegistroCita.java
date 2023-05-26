package com.example.proyectoveterinaria.Vistas;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VentanaRegistroCita extends BorderPane {
    //Variable del nombre del usuario
    String nombreUsuario;
    Label labelregistrodecitas;
    Label labelusuario;
    Label labelnombredelcliente;
    TextField txfnombredelcliente;
    Label labelespeciemascota;
    TextField txfespeciemascota;
    Label labeledadmascota;
    TextField txfedadmascota;
    Label labelmotivoconsulta;
    TextArea txamotivodeconsulta;
    Button btnregistrarcita;
    Button btnvisualizarcitas;

    public VentanaRegistroCita() { //Constructor por defecto
        InciarComponentes();
    }


    public VentanaRegistroCita(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
        InciarComponentes();
    }

    public void InciarComponentes() {
        VBox vboxtituloregistro = new VBox();
        vboxtituloregistro.setAlignment(Pos.TOP_CENTER);

        VBox vboxregistroconsultas = new VBox();
        vboxregistroconsultas.setSpacing(3);
        vboxregistroconsultas.setAlignment(Pos.CENTER);

        HBox hboxbotonescitas = new HBox();
        hboxbotonescitas.setAlignment(Pos.CENTER);
        hboxbotonescitas.setSpacing(5);

        labelregistrodecitas = new Label("Registro de citas");
        labelregistrodecitas.setStyle("-fx-font-size: 25; -fx-font-family: 'Times New Roman';");

        labelusuario = new Label("Usuario: " + nombreUsuario);
        labelusuario.setStyle("-fx-font-size: 15; -fx-font-family: 'Times New Roman';");

        labelnombredelcliente = new Label("Nombre del cliente");
        labelnombredelcliente.setStyle("-fx-font-size: 14; -fx-font-family: 'Times New Roman';");

        txfnombredelcliente = new TextField("Introduce el nombre");
        txfnombredelcliente.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");
        txfnombredelcliente.setMinHeight(25);
        txfnombredelcliente.setMaxWidth(250);

        labelespeciemascota = new Label("Especie de la mascota");
        labelespeciemascota.setStyle("-fx-font-size: 14; -fx-font-family: 'Times New Roman';");

        txfespeciemascota = new TextField("Introduce la especie");
        txfespeciemascota.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");
        txfespeciemascota.setMaxWidth(250);
        txfespeciemascota.setMinHeight(25);

        labeledadmascota = new Label("Edad de la mascota");
        labeledadmascota.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 14;");

        txfedadmascota = new TextField("Introduce la edad en meses");
        txfedadmascota.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");
        txfedadmascota.setMaxWidth(250);
        txfedadmascota.setMinHeight(50);

        labelmotivoconsulta = new Label("Motivo de la consulta");
        labelmotivoconsulta.setStyle("-fx-font-size: 14; -fx-font-family: 'Times New Roman';");

        txamotivodeconsulta = new TextArea("Introduce el motivo de la consulta");
        txamotivodeconsulta.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");
        txamotivodeconsulta.setMaxWidth(300);
        txamotivodeconsulta.setMinHeight(135);

        btnregistrarcita  = new Button("REGISTRAR CITA");
        btnregistrarcita.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-background-radius: 5;");

        btnvisualizarcitas = new Button("Visualizar todas las citas");
        btnvisualizarcitas.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-background-radius: 5;");

        vboxtituloregistro.getChildren().addAll(labelregistrodecitas, labelusuario);
        setTop(vboxtituloregistro);

        hboxbotonescitas.getChildren().addAll(btnregistrarcita, btnvisualizarcitas);

        vboxregistroconsultas.getChildren().addAll(
                labelnombredelcliente, txfnombredelcliente, labelespeciemascota,
                txfespeciemascota, labeledadmascota, txfedadmascota,
                labelmotivoconsulta, txamotivodeconsulta, hboxbotonescitas
        );
        setCenter(vboxregistroconsultas);
    }
}
