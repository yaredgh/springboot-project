package edu.mum.springboot.malti_modual.petclinicproject.Bootsrap;

import edu.mum.springboot.malti_modual.petclinicproject.modle.*;
import edu.mum.springboot.malti_modual.petclinicproject.service.OwnerService;
import edu.mum.springboot.malti_modual.petclinicproject.service.PetTypeService;
import edu.mum.springboot.malti_modual.petclinicproject.service.SpecialityService;
import edu.mum.springboot.malti_modual.petclinicproject.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader  implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }
    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0) {
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Nina");
        PetType petTypeSavedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("miaow");
        PetType petTypeSavedCat = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality dentist = new Speciality();
        dentist.setDescription("Dentist");
        Speciality savedDentist = specialityService.save(dentist);

        Speciality surgeon = new Speciality();
        surgeon.setDescription("Surgeon");
        Speciality savedSurgeon = specialityService.save(surgeon);

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAddress("123 4th street");
        owner1.setCity("San Jose");
        owner1.setTelephone("408-567-876");
        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setPetType(petTypeSavedDog);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthday(LocalDate.now());
        mikesPet.setName("dog1");
        owner1.getPets().add(mikesPet);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenine");
        owner2.setAddress("234 A street");
        owner2.setCity("Oakland");
        owner2.setTelephone("510-345-345");
        ownerService.save(owner2);

        Pet FionaPet = new Pet();
        FionaPet.setPetType(petTypeSavedCat);
        FionaPet.setOwner(owner2);
        FionaPet.setBirthday(LocalDate.now());
        FionaPet.setName("cat1");
        owner2.getPets().add(FionaPet);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Alex");
        vet1.getSpeciality().add(savedRadiology);
        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Bob");
        vet2.setLastName("Wills");
        vet2.getSpeciality().add(savedDentist);
        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Lily");
        vet3.setLastName("Mike");
        vet3.getSpeciality().add(savedSurgeon);
        System.out.println("Loaded vets...");
    }
}
