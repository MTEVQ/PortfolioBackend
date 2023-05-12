package com.example.demo.service;

import com.example.demo.model.Proyectos;
import java.util.List;

public interface IProyectosService {
    
    public List<Proyectos> listarProyectos();
        
	public void addProyectos(Proyectos proy);
        
	public void delProyectos(Long id);
        
	public Proyectos getProyectos(Long id);
        
	public Proyectos updProyectos(Proyectos proy);
}
