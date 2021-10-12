package pl.marianek.climbingProject.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.marianek.climbingProject.persistence.model.Wall;
import pl.marianek.climbingProject.persistence.repository.WallRepository;

import java.util.Collection;

@Service
public class WallService {
    @Autowired
    private WallRepository wallRepository;

    public Collection<Wall> getWalls() {
        return wallRepository.findAll();
    }

}
