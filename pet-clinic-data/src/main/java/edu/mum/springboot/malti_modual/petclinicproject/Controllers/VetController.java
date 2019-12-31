package edu.mum.springboot.malti_modual.petclinicproject.Controllers;

import edu.mum.springboot.malti_modual.petclinicproject.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }
    @RequestMapping({"/vets","vets/index"})
    public String vet(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "Vets/index";
    }
}
