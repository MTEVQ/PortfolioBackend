package com.example.demo.service;

import com.example.demo.model.Proyectos;
import com.example.demo.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired
    public ProyectosRepository repo;
    
    @Override
    public List<Proyectos> listarProyectos() {
        return repo.findAll();
    }
    
    @Override
    public void addProyectos(Proyectos proy) {
        repo.save(proy);
    }

    @Override
    public void delProyectos(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Proyectos getProyectos(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Proyectos updProyectos(Proyectos proy) {
        return repo.save(proy);
    }
}
