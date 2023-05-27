package com.example.proyectoveterinaria.Vistas;

import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaCitas extends BorderPane {
    Stage stageVentanaCitas;
    //Elementos
    TextField txfbuscador;
    Button btnbuscador;
    TableView tbvcitas;
    Button btnagregar;
    Button btneiliminar;
    Button btneditar;

    //Constructor por defecto
    public VentanaCitas(){
        IniciarComponentes();
    }

    //Constructor parametrizado
    public VentanaCitas(Stage stageVentanaCitas){
        this.stageVentanaCitas = stageVentanaCitas;
        IniciarComponentes();
    }

    public void IniciarComponentes(){
        //Contenedores
        HBox hBoxBuscador = new HBox();
        VBox vBoxOpcionescliente = new VBox();

        //Elementos
        txfbuscador = new TextField();
        txfbuscador.setPromptText("Buscar citas disponibles");
        txfbuscador.setStyle("-fx-border-color: black; -fx-border-width: 2; -fx-border-radius: 30; -fx-prompt-text-fill: black;");

        btnbuscador = new Button("Buscar");
        btnbuscador.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-background-radius: 5;");

        tbvcitas = new TableView<>();

        btnagregar = new Button("Agregar");
        btnagregar.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-background-radius: 5;");

        btneiliminar = new Button("Eliminar");
        btneiliminar.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-background-radius: 5;");

        btneditar = new Button("Editar");
        btneditar.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-background-radius: 5;");

        //Agregar los componentes a los contenedores
        hBoxBuscador.getChildren().addAll(txfbuscador, btnbuscador);
        setTop(hBoxBuscador);

        vBoxOpcionescliente.getChildren().addAll(btnagregar,btneditar, btneiliminar);
        setRight(vBoxOpcionescliente);

        setCenter(tbvcitas);

    }
}
