package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidades {
    
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)  
  private Long id;
  
  private String nombrehabilidad;
  private Integer porcentajehabilidad;

    public Habilidades() {
    }

    public Habilidades(Long id, String nombrehabilidad, Integer porcentajehabilidad) {
        this.id = id;
        this.nombrehabilidad = nombrehabilidad;
        this.porcentajehabilidad = porcentajehabilidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrehabilidad() {
        return nombrehabilidad;
    }

    public void setNombrehabilidad(String nombrehabilidad) {
        this.nombrehabilidad = nombrehabilidad;
    }

    public Integer getPorcentajehabilidad() {
        return porcentajehabilidad;
    }

    public void setPorcentajehabilidad(Integer porcentajehabilidad) {
        this.porcentajehabilidad = porcentajehabilidad;
    }
   
    
}
