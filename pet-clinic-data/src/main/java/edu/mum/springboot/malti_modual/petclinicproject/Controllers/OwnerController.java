package edu.mum.springboot.malti_modual.petclinicproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    @RequestMapping({"owners","owners/index"})
    public String listOfOwners(){

        return "Owners/index";
    }
}
