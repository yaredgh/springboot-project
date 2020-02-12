package edu.mum.springboot.malti_modual.petclinicproject.service.map;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Visit;
import edu.mum.springboot.malti_modual.petclinicproject.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findOne(Long id) {
        return super.findOne(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        Visit visit = new Visit();
         visit = super.findById(object.getId());
         super.delete(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }
}
