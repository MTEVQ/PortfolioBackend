package com.example.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia_laboral {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   
   private String cargo;
   private String nombreEmpresa;
   private String jornada;
   private Boolean esTrabajoActual;
   private Date fechaInicioEL;
   private Date fechaFinEL;
   private String ubicacion;
   private String urlIconoEL;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(Long id, String cargo, String nombreEmpresa, String jornada, Boolean esTrabajoActual, Date fechaInicioEL, Date fechaFinEL, String ubicacion, String urlIconoEL) {
        this.id= id;
        this.cargo = cargo;
        this.nombreEmpresa = nombreEmpresa;
        this.jornada = jornada;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicioEL = fechaInicioEL;
        this.fechaFinEL = fechaFinEL;
        this.ubicacion = ubicacion;
        this.urlIconoEL = urlIconoEL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Boolean getEsTrabajoActual() {
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(Boolean esTrabajoActual) {
        this.esTrabajoActual = esTrabajoActual;
    }

    public Date getFechaInicioEL() {
        return fechaInicioEL;
    }

    public void setFechaInicioEL(Date fechaInicioEL) {
        this.fechaInicioEL = fechaInicioEL;
    }

    public Date getFechaFinEL() {
        return fechaFinEL;
    }

    public void setFechaFinEL(Date fechaFinEL) {
        this.fechaFinEL = fechaFinEL;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUrlIconoEL() {
        return urlIconoEL;
    }

    public void setUrlIconoEL(String urlIconoEL) {
        this.urlIconoEL = urlIconoEL;
    }
  
    
    
}
