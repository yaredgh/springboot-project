package edu.mum.springboot.malti_modual.petclinicproject.modle;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vet")
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Vet_Speciality",joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns =@JoinColumn(name = "speciality_id"))
    private Set<Speciality> speciality = new HashSet<>();

    public Set<Speciality> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Set<Speciality> speciality) {
        this.speciality = speciality;
    }
}
