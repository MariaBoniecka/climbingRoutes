package pl.marianek.climbingProject.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.marianek.climbingProject.persistence.model.Climber;
import pl.marianek.climbingProject.persistence.repository.ClimberRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class ClimberService {
    @Autowired
    private ClimberRepository climberRepo;

    public Collection<Climber> getClimbers() {
        return climberRepo.findAll();
    }

    public void saveClimber(Climber climber) {
        climberRepo.save(climber);
    }

}
