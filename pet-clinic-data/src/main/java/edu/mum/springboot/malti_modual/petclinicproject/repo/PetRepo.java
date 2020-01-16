package edu.mum.springboot.malti_modual.petclinicproject.repo;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepo extends CrudRepository<Pet,Long> {
}
