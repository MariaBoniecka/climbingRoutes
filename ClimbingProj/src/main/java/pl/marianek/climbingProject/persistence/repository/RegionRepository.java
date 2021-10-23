package pl.marianek.climbingProject.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import pl.marianek.climbingProject.persistence.model.Region;

import java.util.List;

public interface RegionRepository extends CrudRepository<Region, Long> {

    List<Region> findAll();


}