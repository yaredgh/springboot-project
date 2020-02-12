package edu.mum.springboot.malti_modual.petclinicproject.SpringDataJpa;

import edu.mum.springboot.malti_modual.petclinicproject.modle.PetType;
import edu.mum.springboot.malti_modual.petclinicproject.repo.PetTypeRepo;
import edu.mum.springboot.malti_modual.petclinicproject.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("SpringDataJpa")
public class PetTypeServiceJpaImp implements PetTypeService {
    private final PetTypeRepo petTypeRepo;

    public PetTypeServiceJpaImp(PetTypeRepo petTypeRepo) {
        this.petTypeRepo = petTypeRepo;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType>petTypes = new HashSet<>();
        petTypeRepo.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepo.save(object);
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepo.findById(aLong).orElse(null);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepo.deleteById(aLong);
    }

    @Override
    public PetType findOne(Long aLong) {
        return petTypeRepo.findById(aLong).orElse(null);
    }
}
