package com.example.demo.service;

import com.example.demo.model.Persona;
import java.util.List;

public interface IPersonaService {
	
	public List<Persona> listarPersonas();
        
	public void addPersona(Persona pers);
        
	public void delPersona(Long id);
        
	public Persona getPersona(Long id);
        
	public Persona updPersona(Persona pers);
        

}
