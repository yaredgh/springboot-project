package edu.mum.springboot.malti_modual.petclinicproject.service;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
