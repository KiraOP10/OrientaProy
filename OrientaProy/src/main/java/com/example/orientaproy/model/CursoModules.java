package com.example.orientaproy.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="curso")
public class CursoModules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;
    @Column(name = "nombreCurso",nullable = false)
    private String nombreCurso;
    @Column(name = "descripcionCurso",nullable = false)
    private String descripcionCurso;
    @Column(name = "precioCurso",nullable = false)
    private BigDecimal precioCurso;


    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }
    public BigDecimal getPrecioCurso() {
        return precioCurso;
    }

    public void setPrecioCurso(BigDecimal precioCurso) {
        this.precioCurso = precioCurso;
    }


}
