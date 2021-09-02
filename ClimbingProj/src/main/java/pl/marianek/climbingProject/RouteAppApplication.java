package pl.marianek.climbingProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;


@SpringBootApplication
public class RouteAppApplication {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(RouteAppApplication.class, args);
    }

}
