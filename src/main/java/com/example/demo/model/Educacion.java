package com.example.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombreInstitucion;
    private String titulo;
    private Date fechaInicio;
    private Date fechaFin;
    private String urlIcono;

    public Educacion() {
    }

   public Educacion(Long id, String nombreInstitucion, String titulo, Date fechaInicio, Date fechaFin, String urlIcono) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlIcono = urlIcono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getUrlIcono() {
        return urlIcono;
    }

    public void setUrlIcono(String urlIcono) {
        this.urlIcono = urlIcono;
    }
    
    
}
