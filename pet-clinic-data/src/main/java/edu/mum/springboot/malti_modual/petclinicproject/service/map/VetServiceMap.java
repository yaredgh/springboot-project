package edu.mum.springboot.malti_modual.petclinicproject.service.map;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Speciality;
import edu.mum.springboot.malti_modual.petclinicproject.modle.Vet;
import edu.mum.springboot.malti_modual.petclinicproject.service.SpecialityService;
import edu.mum.springboot.malti_modual.petclinicproject.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findOne(Long id) {
        return super.findOne(id);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {

        super.delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpeciality().size() > 0) {

                object.getSpeciality().forEach(speciality -> {
                    if (speciality.getId() != null) {
                        Speciality savedSpeciality = specialityService.save(speciality);
                        speciality.setId(savedSpeciality.getId());
                    }
                });
        }
            return super.save(object);


    }

}
