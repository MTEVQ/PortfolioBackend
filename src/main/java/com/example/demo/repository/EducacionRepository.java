/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Tatiana
 */
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    
}
