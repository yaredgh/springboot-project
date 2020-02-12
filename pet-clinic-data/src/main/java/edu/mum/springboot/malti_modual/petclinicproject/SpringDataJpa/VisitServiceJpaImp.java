package edu.mum.springboot.malti_modual.petclinicproject.SpringDataJpa;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Visit;
import edu.mum.springboot.malti_modual.petclinicproject.repo.VisitRepo;
import edu.mum.springboot.malti_modual.petclinicproject.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("SpringDataJpa")
public class VisitServiceJpaImp implements VisitService {
    private final VisitRepo visitRepo;

    public VisitServiceJpaImp(VisitRepo visitRepo) {
        this.visitRepo = visitRepo;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit>visits = new HashSet<>();
        visitRepo.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit save(Visit object) {
        return visitRepo.save(object);
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepo.findById(aLong).orElse(null);
    }

    @Override
    public void delete(Visit object) {
        visitRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepo.deleteById(aLong);
    }

    @Override
    public Visit findOne(Long aLong) {
        return visitRepo.findById(aLong).orElse(null);
    }
}
