package pl.marianek.climbingProject.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import pl.marianek.climbingProject.persistence.model.Route;

import java.util.List;

public interface RouteRepository extends CrudRepository<Route, Long> {

    List<Route> findAll();
}
