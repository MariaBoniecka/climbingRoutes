package pl.marianek.climbingProject.persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.marianek.climbingProject.persistence.model.Climber;
import pl.marianek.climbingProject.persistence.model.formModels.NewClimberForm;
import pl.marianek.climbingProject.persistence.service.ClimberService;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

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

    @GetMapping(value = "/addClimber")
    public ModelAndView addClimber(ModelMap modelMap) {
        modelMap.addAttribute("newClimberForm", new NewClimberForm());
        return new ModelAndView("addClimber", modelMap);
    }

    @PostMapping(value = "/newClimber")
    public ModelAndView newClimber(@ModelAttribute("newClimberForm") @Valid NewClimberForm climberForm, BindingResult bindingResult) {

        Climber climber = new Climber();
        climber.setClimberFirstName(climberForm.getFirstName());
        climber.setClimberLastName(climberForm.getLastName());
        climber.setDateOfBirth(convertToLocalDateTimeViaInstant(climberForm.getDateOfBirth()));
        climber.setClimberCountryCode(climberForm.getCountry());
        climberService.saveClimber(climber);
        return new ModelAndView("redirect:/showAllClimbers");
    }

    public LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
