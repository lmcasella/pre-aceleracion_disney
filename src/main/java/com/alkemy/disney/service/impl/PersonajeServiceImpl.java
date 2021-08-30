package com.alkemy.disney.service.impl;

import com.alkemy.disney.repository.PersonajeRepository;
import com.alkemy.disney.service.PersonajeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImpl implements PersonajeService {
    @Autowired
    private PersonajeRepository personajeRepository;

    @Override
    public void get() {
        personajeRepository.findById(1L);
    }
}
