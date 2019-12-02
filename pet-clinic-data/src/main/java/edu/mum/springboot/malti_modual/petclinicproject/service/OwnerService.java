package edu.mum.springboot.malti_modual.petclinicproject.service;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner findByLastName(String lastName);
    Owner save(Owner owner);
    Set<Owner>findAll();
}
