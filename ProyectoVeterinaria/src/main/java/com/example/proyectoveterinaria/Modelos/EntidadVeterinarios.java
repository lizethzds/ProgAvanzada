package com.example.proyectoveterinaria.Modelos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "veterinarios", schema = "veterinaria", catalog = "")
public class EntidadVeterinarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Basic
    @Column(name = "telefono", nullable = true, length = 15)
    private String telefono;
    @Basic
    @Column(name = "especialidad", nullable = true, length = 50)
    private String especialidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntidadVeterinarios that = (EntidadVeterinarios) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(telefono, that.telefono) && Objects.equals(especialidad, that.especialidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, telefono, especialidad);
    }
}
