package edu.mum.springboot.malti_modual.petclinicproject.service;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
