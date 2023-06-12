package com.example.proyectoveterinaria.Vistas;

import com.example.proyectoveterinaria.Modelos.EntidadCitas;
import jakarta.persistence.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.List;
import java.util.concurrent.Executor;

public class VentanaCitas extends BorderPane {
    private Stage stageVentanaCitas;
    //Elementos
    TextField txfbuscador;
    Button btnbuscador;
    TableView <EntidadCitas>tbvcitas;
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
        cargarDatos();
        IniciarComponentes();
        cargarDatosDesdeArchivo();
    }

    public void IniciarComponentes(){
        //Contenedores
        HBox hBoxBuscador = new HBox();
        VBox vBoxOpcionescliente = new VBox();
        initialize();

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
        hBoxBuscador.setSpacing(6);
        hBoxBuscador.setPrefHeight(50);
        hBoxBuscador.setPrefWidth(550);

        vBoxOpcionescliente.getChildren().addAll(btnagregar,btneditar, btneiliminar);
        setRight(vBoxOpcionescliente);
        vBoxOpcionescliente.setAlignment(Pos.TOP_CENTER);
        vBoxOpcionescliente.setSpacing(5);
        vBoxOpcionescliente.setPrefWidth(75);
        vBoxOpcionescliente.setMaxHeight(325);

        setCenter(tbvcitas);

        //Evento para volver a la ventana de agregar
        btnagregar.setOnAction(evt ->{
            VentanaRegistroCita ventanaRegistroCita = new VentanaRegistroCita();
            Scene sceneventanaregistrocita = new Scene(ventanaRegistroCita,600, 500);
            stageVentanaCitas.setScene(sceneventanaregistrocita);
        });
    }
    public void initialize() {
        // Crear columnas
        TableColumn<EntidadCitas, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<EntidadCitas, Date> fechaColumn = new TableColumn<>("Fecha");
        fechaColumn.setCellValueFactory(new PropertyValueFactory<>("fecha"));

        TableColumn<EntidadCitas, String> horaColumn = new TableColumn<>("Hora");
        horaColumn.setCellValueFactory(new PropertyValueFactory<>("hora"));

        TableColumn<EntidadCitas, Integer> mascotaIdColumn = new TableColumn<>("Mascota ID");
        mascotaIdColumn.setCellValueFactory(new PropertyValueFactory<>("mascota_id"));

        TableColumn<EntidadCitas, Integer> veterinarioIdColumn = new TableColumn<>("Veterinario ID");
        veterinarioIdColumn.setCellValueFactory(new PropertyValueFactory<>("veterinario_id"));

        // Agregar columnas a la tabla
        tbvcitas.getColumns().addAll(idColumn, fechaColumn, horaColumn, mascotaIdColumn, veterinarioIdColumn);
    }

    public void cargarDatos() {
        // Obtener datos de la base de datos usando JPA (Hibernate)
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence.tdl");
        EntityManager em = emf.createEntityManager();
        TypedQuery<EntidadCitas> query = em.createQuery("SELECT c FROM EntidadCitas c", EntidadCitas.class);
        List<EntidadCitas> citas = query.getResultList();

        // Convertir la lista de citas a un ObservableList para la TableView
        ObservableList<EntidadCitas> citasList = FXCollections.observableArrayList(citas);

        // Asignar el ObservableList a la TableView
        tbvcitas.setItems(citasList);
    }
    public void cargarDatosDesdeArchivo() {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            // Crea el EntityManagerFactory utilizando la unidad de persistencia configurada en persistence.xml
            emf = Persistence.createEntityManagerFactory("Persistence.tdl");

            // Crea el EntityManager
            em = emf.createEntityManager();

            // Inicia una transacción
            em.getTransaction().begin();

            // Carga el archivo SQL y ejecuta las sentencias utilizando el EntityManager
            String scriptFile = "veterinaria.sql";
            BufferedReader reader = new BufferedReader(new FileReader(scriptFile));
            String line;
            while ((line = reader.readLine()) != null) {
                // Ejecuta cada línea del script SQL en la base de datos
                Query query = em.createNativeQuery(line);
                query.executeUpdate();
            }
            reader.close();

            // Confirma la transacción
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // Cierra los recursos
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }
}
