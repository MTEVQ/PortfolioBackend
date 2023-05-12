package com.example.demo.service;

import com.example.demo.model.Habilidades;
import com.example.demo.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired
    public HabilidadesRepository repo;
    
    @Override
    public List<Habilidades> listarHabilidades() {
        return repo.findAll();
    }
    
    @Override
    public void addHabilidades(Habilidades hab) {
        repo.save(hab);
    }

    @Override
    public void delHabilidades(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Habilidades getHabilidades(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Habilidades updHabilidades(Habilidades hab) {
        return repo.save(hab);
    }
}
