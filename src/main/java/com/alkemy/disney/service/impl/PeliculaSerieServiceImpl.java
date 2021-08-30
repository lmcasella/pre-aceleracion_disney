package com.alkemy.disney.service.impl;

import com.alkemy.disney.repository.PeliculaSerieRepository;
import com.alkemy.disney.service.PeliculaSerieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaSerieServiceImpl implements PeliculaSerieService {
    @Autowired
    private PeliculaSerieRepository peliculaSerieRepository;

    @Override
    public void get() {
        peliculaSerieRepository.findById(1L);
    }
}
