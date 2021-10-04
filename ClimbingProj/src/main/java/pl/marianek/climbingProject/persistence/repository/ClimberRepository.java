package pl.marianek.climbingProject.persistence.repository;
import org.springframework.data.repository.CrudRepository;
import pl.marianek.climbingProject.persistence.model.Climber;

import java.util.List;

public interface ClimberRepository extends CrudRepository<Climber, Long> {

    List<Climber> findAll();


}