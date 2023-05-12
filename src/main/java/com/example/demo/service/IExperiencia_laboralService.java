/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Experiencia_laboral;
import java.util.List;

/**
 *
 * @author Tatiana
 */
public interface IExperiencia_laboralService {
    
    public List<Experiencia_laboral> listarExperiencia_laboral();
    public void addExperiencia_laboral(Experiencia_laboral exl);
    public void delExperiencia_laboral(Long id);
    public Experiencia_laboral getExperiencia_laboral(Long id);
    public Experiencia_laboral updExperiencia_laboral(Experiencia_laboral exl);
}
