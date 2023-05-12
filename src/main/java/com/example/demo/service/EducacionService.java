package com.example.demo.service;

import com.example.demo.model.Educacion;
import com.example.demo.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService  implements IEducacionService {

    @Autowired
    public EducacionRepository repo;
    
    @Override
    public List<Educacion> listarEducacion() {
        return repo.findAll();
    }
    
    @Override
    public void addEducacion(Educacion edu) {
        repo.save(edu);
    }

    @Override
    public void delEducacion(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Educacion getEducacion(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Educacion updEducacion(Educacion edu) {
        return repo.save(edu);
    }
}
