package pl.marianek.climbingProject.persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.marianek.climbingProject.persistence.service.RouteService;

@RestController
public class RouteController {

    @Autowired
    RouteService routeService;

    @GetMapping(value = "/showAllRoutes")
    public ModelAndView showAllRoutes(ModelMap modelMap) {
        modelMap.addAttribute("routes", routeService.getRoutes());
        return new ModelAndView("showAllRoutes", modelMap);
    }
}
