package edu.mum.springboot.malti_modual.petclinicproject.SpringDataJpa;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Vet;
import edu.mum.springboot.malti_modual.petclinicproject.repo.SpecialityRepo;
import edu.mum.springboot.malti_modual.petclinicproject.repo.VetRepo;
import edu.mum.springboot.malti_modual.petclinicproject.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("SpringDataJpa")
public class VetServiceJpaImp implements VetService {
    private final VetRepo vetRepo;
    private final SpecialityRepo specialityRepo;

    public VetServiceJpaImp(VetRepo vetRepo, SpecialityRepo specialityRepo) {
        this.vetRepo = vetRepo;
        this.specialityRepo = specialityRepo;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet>vets = new HashSet<>();
        vetRepo.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet save(Vet object) {
        return vetRepo.save(object);
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepo.findById(aLong).orElse(null);
    }

    @Override
    public void delete(Vet object) {
        vetRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepo.deleteById(aLong);
    }

    @Override
    public Vet findOne(Long aLong) {
        return vetRepo.findById(aLong).orElse(null);
    }
}
