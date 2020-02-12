package edu.mum.springboot.malti_modual.petclinicproject.SpringDataJpa;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Pet;
import edu.mum.springboot.malti_modual.petclinicproject.repo.PetRepo;
import edu.mum.springboot.malti_modual.petclinicproject.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("SpringDataJpa")
public class PetServiceJpaImp implements PetService {
    private final PetRepo petRepo;

    public PetServiceJpaImp(PetRepo petRepo) {
        this.petRepo = petRepo;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepo.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet save(Pet object) {
        return petRepo.save(object);
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepo.findById(aLong).orElse(null);
    }

    @Override
    public void delete(Pet object) {
        petRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepo.deleteById(aLong);
    }

    @Override
    public Pet findOne(Long aLong) {
        return petRepo.findById(aLong).orElse(null);
    }
}
