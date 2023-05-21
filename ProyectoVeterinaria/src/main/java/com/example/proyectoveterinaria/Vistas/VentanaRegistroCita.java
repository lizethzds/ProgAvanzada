package com.example.proyectoveterinaria.Vistas;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VentanaRegistroCita extends BorderPane {
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


    public VentanaRegistroCita(){
        InciarComponentes();
    }

    public void InciarComponentes() {
        VBox vboxtituloregistro = new VBox();
        VBox vboxregistroconsultas = new VBox();
        HBox hboxbotonescitas = new HBox();
        labelregistrodecitas = new Label("Registro de citas");
        labelregistrodecitas.setStyle("-fx-font-size: 20; -fx-font-family: 'Times New Roman';");

        labelusuario = new Label("Usuario: ");
        labelusuario.setStyle("-fx-font-size: 15; -fx-font-family: 'Times New Roman';");

        labelnombredelcliente = new Label("Nombre del cliente");
        labelnombredelcliente.setStyle("-fx-font-size: 14; -fx-font-family: 'Times New Roman';");

        txfnombredelcliente = new TextField("Introduce el nombre");
        txfnombredelcliente.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");

        labelespeciemascota = new Label("Especie de la mascota");
        labelespeciemascota.setStyle("-fx-font-size: 14; -fx-font-family: 'Times New Roman';");

        txfespeciemascota = new TextField("Introduce la especie");
        txfespeciemascota.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");

        labeledadmascota = new Label("Edad de la mascota");
        labeledadmascota.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 14;");

        txfedadmascota = new TextField("Introduce la edad en meses");
        txfedadmascota.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");

        labelmotivoconsulta = new Label("Motivo de la consulta");
        labelmotivoconsulta.setStyle("-fx-font-size: 14; -fx-font-family: 'Times New Roman';");

        txamotivodeconsulta = new TextArea("Introduce el motivo de la consulta");
        txamotivodeconsulta.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 50; -fx-prompt-text-fill: black;");

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
