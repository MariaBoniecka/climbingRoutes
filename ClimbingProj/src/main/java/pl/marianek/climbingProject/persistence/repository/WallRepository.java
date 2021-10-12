package pl.marianek.climbingProject.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import pl.marianek.climbingProject.persistence.model.Wall;

import java.util.List;

public interface WallRepository  extends CrudRepository<Wall, Long> {

    List<Wall> findAll();
}
