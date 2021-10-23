package pl.marianek.climbingProject.persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.marianek.climbingProject.persistence.model.Climber;
import pl.marianek.climbingProject.persistence.model.Route;
import pl.marianek.climbingProject.persistence.model.formModels.NewClimberForm;
import pl.marianek.climbingProject.persistence.model.formModels.NewRouteForm;
import pl.marianek.climbingProject.persistence.service.ClimberService;
import pl.marianek.climbingProject.persistence.service.RouteService;
import pl.marianek.climbingProject.persistence.service.WallService;

import javax.validation.Valid;

@RestController
public class RouteController {

    @Autowired
    RouteService routeService;
    @Autowired
    ClimberService climberService;
    @Autowired
    WallService wallService;

    @GetMapping(value = "/showAllRoutes")
    public ModelAndView showAllRoutes(ModelMap modelMap) {
        modelMap.addAttribute("routes", routeService.getRoutes());
        return new ModelAndView("showAllRoutes", modelMap);
    }

    @GetMapping(value = "/addRoute")
    public ModelAndView addRoute(ModelMap modelMap) {
        modelMap.addAttribute("newRouteForm", new NewRouteForm());
        modelMap.addAttribute("climbers", climberService.getClimbers());
        modelMap.addAttribute("walls", wallService.getWalls());
        return new ModelAndView("addRoute", modelMap);
    }

    @PostMapping(value = "/newRoute")
    public ModelAndView newClimber(@ModelAttribute("newRouteForm") @Valid NewRouteForm routeForm, BindingResult bindingResult) {

        Route route = new Route();
        route.setRouteName(routeForm.getRouteName());
        //route.setRate(routeForm.getRate());
        routeService.saveRoute(route);
        return new ModelAndView("redirect:/showAllClimbers");
    }

}
