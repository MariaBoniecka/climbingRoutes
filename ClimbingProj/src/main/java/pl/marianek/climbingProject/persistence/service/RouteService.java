package pl.marianek.climbingProject.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.marianek.climbingProject.persistence.model.Route;
import pl.marianek.climbingProject.persistence.repository.RouteRepository;

import java.util.Collection;

@Service
public class RouteService {
    @Autowired
    private RouteRepository routeRepo;

    public Collection<Route> getRoutes() {
        return routeRepo.findAll();
    }
}
