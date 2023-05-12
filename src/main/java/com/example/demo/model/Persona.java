package com.example.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	private String apellido;
        private String profesion;
        private String correo;
        private String telefono;
        private String url_foto;
        private Date fechaNac;
        private String acerca_De;
        private String url_portada;
        private String ubicacion;

	public Persona() {
		super();
	}

    
    public Persona(Long id, String nombre, String apellido, String profesion, String correo, String telefono, String url_foto, Date fechaNac, String acerca_De, String url_portada, String ubicacion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.correo = correo;
        this.telefono = telefono;
        this.url_foto = url_foto;
        this.fechaNac = fechaNac;
        this.acerca_De = acerca_De;
        this.url_portada = url_portada;
        this.ubicacion = ubicacion;
    }
    

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getAcerca_De() {
        return acerca_De;
    }

    public void setAcerca_De(String acerca_De) {
        this.acerca_De = acerca_De;
    }

    public String getUrl_portada() {
        return url_portada;
    }

    public void setUrl_portada(String url_portada) {
        this.url_portada = url_portada;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
	
	
}
