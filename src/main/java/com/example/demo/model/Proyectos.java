package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id 
   @GeneratedValue(strategy = GenerationType.AUTO) 
   private Long id;
   
   private String nombreProyectos;
   private String descripcionProyecto;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombreProyectos, String descripcionProyecto) {
        this.id = id;
        this.nombreProyectos = nombreProyectos;
        this.descripcionProyecto = descripcionProyecto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProyectos() {
        return nombreProyectos;
    }

    public void setNombreProyectos(String nombreProyectos) {
        this.nombreProyectos = nombreProyectos;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }
    
}
