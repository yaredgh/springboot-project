package edu.mum.springboot.malti_modual.petclinicproject.Bootsrap;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Owner;
import edu.mum.springboot.malti_modual.petclinicproject.modle.PetType;
import edu.mum.springboot.malti_modual.petclinicproject.modle.Vet;
import edu.mum.springboot.malti_modual.petclinicproject.service.OwnerService;
import edu.mum.springboot.malti_modual.petclinicproject.service.PetTypeService;
import edu.mum.springboot.malti_modual.petclinicproject.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }
    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Nina");
        PetType petTypeSavedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("miaow");
        PetType petTypeSavedCat = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenine");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Alex");
        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Bob");
        vet2.setLastName("Wills");
        vetService.save(vet2);
      System.out.println("Loaded vets...");





    }
}
