package pl.marianek.climbingProject;

import java.io.Serializable;

public class RouteId implements Serializable {

    private String routeName;

    // default constructor

    public RouteId() {
    }
    public RouteId(String routeName) {
        this.routeName = routeName;
    }

    // equals() and hashCode()
}
