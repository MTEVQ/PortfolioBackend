/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Domicilio;
import java.util.List;

/**
 *
 * @author Santos
 */
public interface IDomicilioService {
    
    //crud
    public List<Domicilio> listarDomicilios();
    public void addDomicilio(Domicilio domi);
    public void delDomicilio(Long id);
    public Domicilio getDomicilio(Long id);
    public Domicilio updDomicilio(Domicilio domi);
    
}
