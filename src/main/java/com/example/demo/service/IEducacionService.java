package com.example.demo.service;

import com.example.demo.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> listarEducacion();
    public void addEducacion(Educacion edu);
    public void delEducacion(Long id);
    public Educacion getEducacion(Long id);
    public Educacion updEducacion(Educacion edu);
}
