package edu.mum.springboot.malti_modual.petclinicproject.service;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
