package com.example.proyectoveterinaria.Modelos;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "citas", schema = "veterinaria", catalog = "")
public class EntidadCitas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "fecha", nullable = true)
    private Date fecha;
    @Basic
    @Column(name = "hora", nullable = true)
    private Time hora;
    @Basic
    @Column(name = "mascota_id", nullable = true)
    private Integer mascotaId;
    @Basic
    @Column(name = "veterinario_id", nullable = true)
    private Integer veterinarioId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Integer getMascotaId() {
        return mascotaId;
    }

    public void setMascotaId(Integer mascotaId) {
        this.mascotaId = mascotaId;
    }

    public Integer getVeterinarioId() {
        return veterinarioId;
    }

    public void setVeterinarioId(Integer veterinarioId) {
        this.veterinarioId = veterinarioId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntidadCitas that = (EntidadCitas) o;
        return id == that.id && Objects.equals(fecha, that.fecha) && Objects.equals(hora, that.hora) && Objects.equals(mascotaId, that.mascotaId) && Objects.equals(veterinarioId, that.veterinarioId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, hora, mascotaId, veterinarioId);
    }
}
