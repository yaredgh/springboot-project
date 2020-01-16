package edu.mum.springboot.malti_modual.petclinicproject.repo;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepo extends CrudRepository<Visit,Long> {
}
