package edu.mum.springboot.malti_modual.petclinicproject.Controllers;

import edu.mum.springboot.malti_modual.petclinicproject.modle.Owner;
import edu.mum.springboot.malti_modual.petclinicproject.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OwnerController {

   private final  OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"owners","owners/index"})
    public String listOfOwners(Model model){
       model.addAttribute("owners",ownerService.findAll());
        return "Owners/index";

    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addOwner(@ModelAttribute("owner")Owner owner){
        ownerService.save(owner);
        return "Owners/index";
    }

    @RequestMapping(value = "/newOwnerForm",method = RequestMethod.GET)
        public String addNewOwner(Model model) {
        Owner owner = new Owner();
        model.addAttribute("owner", owner);
        return "Owners/newOwnerForm";
    }
    @RequestMapping("/updateOwner")
    public String updateOwnerget(@RequestParam("id") Long id, Model model){
        Owner  owner = ownerService.findById(id);
       model.addAttribute("owner",owner);
       return "Owners/updateOwner";
    }
    @RequestMapping(value ="/updateOwner",method = RequestMethod.POST)
    public String updatOwner(@ModelAttribute("owner") Owner owner,HttpServletRequest request){
        ownerService.save(owner);

        return "Owners/index";

    }

}
