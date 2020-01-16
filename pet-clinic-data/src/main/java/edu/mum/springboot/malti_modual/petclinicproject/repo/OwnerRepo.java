package edu.mum.springboot.malti_modual.petclinicproject.repo;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepo extends CrudRepository<Owner,Long> {
}
