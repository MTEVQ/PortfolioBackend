package com.example.demo.service;

import com.example.demo.model.Domicilio;
import com.example.demo.repository.DomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService implements IDomicilioService {
    
    @Autowired
    public DomicilioRepository repo;

    @Override
    public List<Domicilio> listarDomicilios() {
        return repo.findAll();
    }

    @Override
    public void addDomicilio(Domicilio domi) {
        repo.save(domi);
    }

    @Override
    public void delDomicilio(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Domicilio getDomicilio(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Domicilio updDomicilio(Domicilio domi) {
        return repo.save(domi);
    }
    
}
