package com.alkemy.disney.service.impl;

import com.alkemy.disney.repository.GeneroRepository;
import com.alkemy.disney.service.GeneroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImpl implements GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    @Override
    public void get() {
        generoRepository.findById(1L);
    }
}
