package com.example.demo.service;

import com.example.demo.model.Experiencia_laboral;
import com.example.demo.repository.Experiencia_laboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Experiencia_laboralService implements IExperiencia_laboralService{
    
    @Autowired
    public Experiencia_laboralRepository repo;
    
    @Override
    public List<Experiencia_laboral> listarExperiencia_laboral() {
        return repo.findAll();
    }
    
    @Override
    public void addExperiencia_laboral(Experiencia_laboral exl) {
        repo.save(exl);
    }

    @Override
    public void delExperiencia_laboral(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Experiencia_laboral getExperiencia_laboral(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Experiencia_laboral updExperiencia_laboral(Experiencia_laboral exl) {
        return repo.save(exl);
    }
}
