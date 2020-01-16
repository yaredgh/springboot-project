package edu.mum.springboot.malti_modual.petclinicproject.repo;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepo extends CrudRepository<Vet,Long> {
}
