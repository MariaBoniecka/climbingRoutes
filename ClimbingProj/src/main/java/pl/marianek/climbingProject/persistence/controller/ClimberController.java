package pl.marianek.climbingProject.persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.marianek.climbingProject.persistence.service.ClimberService;

@RestController
public class ClimberController {

    @Autowired
    ClimberService climberService;
    @GetMapping(value = "/showAllClimbers")
    public ResponseEntity<Object> getClimbers() {
        return new ResponseEntity<>(climberService.getClimbers(), HttpStatus.OK);
    }
}
