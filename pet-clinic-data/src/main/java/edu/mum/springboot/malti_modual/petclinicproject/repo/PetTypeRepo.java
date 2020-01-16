package edu.mum.springboot.malti_modual.petclinicproject.repo;

import edu.mum.springboot.malti_modual.petclinicproject.modle.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepo extends CrudRepository<PetType,Long> {
}
