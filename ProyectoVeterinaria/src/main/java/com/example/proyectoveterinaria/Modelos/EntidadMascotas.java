package com.example.proyectoveterinaria.Modelos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "mascotas", schema = "veterinaria", catalog = "")
public class EntidadMascotas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Basic
    @Column(name = "especie", nullable = true, length = 50)
    private String especie;
    @Basic
    @Column(name = "raza", nullable = true, length = 50)
    private String raza;
    @Basic
    @Column(name = "edad", nullable = true)
    private Integer edad;
    @Basic
    @Column(name = "dueño_id", nullable = true)
    private Integer dueñoId;

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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDueñoId() {
        return dueñoId;
    }

    public void setDueñoId(Integer dueñoId) {
        this.dueñoId = dueñoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntidadMascotas that = (EntidadMascotas) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(especie, that.especie) && Objects.equals(raza, that.raza) && Objects.equals(edad, that.edad) && Objects.equals(dueñoId, that.dueñoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, especie, raza, edad, dueñoId);
    }
}
