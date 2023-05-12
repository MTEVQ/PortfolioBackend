package com.example.demo.service;

import com.example.demo.model.Habilidades;
import java.util.List;

public interface IHabilidadesService {
    
    public List<Habilidades> listarHabilidades();
        
	public void addHabilidades(Habilidades hab);
        
	public void delHabilidades(Long id);
        
	public Habilidades getHabilidades(Long id);
        
	public Habilidades updHabilidades(Habilidades hab);
}
