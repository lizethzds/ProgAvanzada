package com.example.proyectoveterinaria.Vistas;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import org.controlsfx.control.spreadsheet.Grid;

public class MenuPrincipal extends BorderPane {

    Button btnCitas,btnPacientes,btnVeterinarios;
    TilePane panelBotones;


    public MenuPrincipal(){
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        Button btnCitas = new Button("Citas");
        Button btnDuenos = new Button("Pacientes ");
        Button btnVeterinarios = new Button("Veterinarios");
        Button btnMascotas = new Button("Mascotas");
        Label lbTitulo = new Label("Seleccione una opción");

        lbTitulo.setAlignment(Pos.CENTER);

        TilePane panelBotones = new TilePane();

        panelBotones.setHgap(3);
        panelBotones.setPrefColumns(4);
        panelBotones.setAlignment(Pos.CENTER);



        panelBotones.getChildren().addAll(btnCitas,btnPacientes,btnVeterinarios);

        this.setCenter(panelBotones);
        this.setTop(lbTitulo);


    }
}
