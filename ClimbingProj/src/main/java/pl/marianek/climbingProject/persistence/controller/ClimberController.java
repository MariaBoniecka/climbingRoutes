package pl.marianek.climbingProject.persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.marianek.climbingProject.persistence.service.ClimberService;

@RestController
public class ClimberController {

    @Autowired
    ClimberService climberService;
    @GetMapping(value = "/showClimbers")
    public ResponseEntity<Object> getClimbers() {
        return new ResponseEntity<>(climberService.getClimbers(), HttpStatus.OK);
    }

    @GetMapping(value = "/showAllClimbers")
    public ModelAndView showAllClimbers(ModelMap modelMap) {
        modelMap.addAttribute("climbers", climberService.getClimbers());
        return new ModelAndView("showAllClimbers", modelMap);
    }
}
