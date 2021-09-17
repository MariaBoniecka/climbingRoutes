package pl.marianek.climbingProject.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.marianek.climbingProject.persistence.model.Climber;

import java.util.Collection;

@Service
public class ClimberService {
    @Autowired
    private ClimberRepository climberRepo;

    public Collection<Climber> getClimbers() {
        return climberRepo.findAll();
    }
}
