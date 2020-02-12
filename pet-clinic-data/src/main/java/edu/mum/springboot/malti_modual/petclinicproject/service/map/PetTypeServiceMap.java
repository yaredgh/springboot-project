package edu.mum.springboot.malti_modual.petclinicproject.service.map;

import edu.mum.springboot.malti_modual.petclinicproject.modle.PetType;
import edu.mum.springboot.malti_modual.petclinicproject.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findOne(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
            super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
          PetType petType = super.findById(object.getId());
          super.delete(petType);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }
}
