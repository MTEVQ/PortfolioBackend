package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Domicilio {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
   private String calle;
   private Integer numero;
   private String piso;
   private String departamento;
   private String localidad;
   private String provincia;
   private String pais;
   private Integer codigoPostal;

    public Domicilio() {
    }

    public Domicilio(Long id, String calle, Integer numero, String piso, String departamento, String localidad, String provincia, String pais, Integer codigoPostal) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }

    public Long getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    
    
    
    
}
