package edu.mum.springboot.malti_modual.petclinicproject.SpringDataJpa;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Owner;
import edu.mum.springboot.malti_modual.petclinicproject.repo.OwnerRepo;
import edu.mum.springboot.malti_modual.petclinicproject.repo.PetRepo;
import edu.mum.springboot.malti_modual.petclinicproject.repo.PetTypeRepo;
import edu.mum.springboot.malti_modual.petclinicproject.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("SpringDataJpa")
public class OwnerServiceJpaImp implements OwnerService {
    private final OwnerRepo ownerRepo;
    private final PetRepo petRepo;
    private final PetTypeRepo petTypeRepo;

    public OwnerServiceJpaImp(OwnerRepo ownerRepo, PetRepo petRepo,
                              PetTypeRepo petTypeRepo) {
        this.ownerRepo = ownerRepo;
        this.petRepo = petRepo;
        this.petTypeRepo = petTypeRepo;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepo.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner>owners = new HashSet<>();
        ownerRepo.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepo.save(object);
    }

    @Override
    public Owner findById(Long aLong) {

            return ownerRepo.findById(aLong).orElse(null);
    }

    @Override
    public void delete(Owner object) {
        ownerRepo.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepo.deleteById(aLong);
    }

    @Override
    public Owner findOne(Long aLong) {
        return ownerRepo.findById(aLong).orElse(null);
    }
}
