package edu.mum.springboot.malti_modual.petclinicproject.SpringDataJpa;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Speciality;
import edu.mum.springboot.malti_modual.petclinicproject.repo.SpecialityRepo;
import edu.mum.springboot.malti_modual.petclinicproject.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("SpringDataJpa")
public class SpecialityServiceJpaImp implements SpecialityService {
    private final SpecialityRepo specialityRepo;

    public SpecialityServiceJpaImp(SpecialityRepo specialityRepo) {
        this.specialityRepo = specialityRepo;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality>specialities = new HashSet<>();
        specialityRepo.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepo.save(object);
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepo.findById(aLong).orElse(null);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepo.findById(aLong);
    }

    @Override
    public Speciality findOne(Long aLong) {
        return specialityRepo.findById(aLong).orElse(null);
    }
}
