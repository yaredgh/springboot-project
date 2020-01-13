package edu.mum.springboot.malti_modual.petclinicproject.modle;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {
    private Set<Speciality> speciality = new HashSet<>();

    public Set<Speciality> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Set<Speciality> speciality) {
        this.speciality = speciality;
    }
}
