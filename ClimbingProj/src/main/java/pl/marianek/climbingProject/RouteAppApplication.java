package pl.marianek.climbingProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.marianek.climbingProject.persistence.model.Climber;
import pl.marianek.climbingProject.persistence.service.ClimberRepository;

import java.sql.SQLException;


@SpringBootApplication
@EnableJpaRepositories
public class RouteAppApplication {


    private static final Logger log = LoggerFactory.getLogger(RouteAppApplication.class);

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(RouteAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ClimberRepository repository) {
        return (args) -> {
            log.info("Climbers found with findAll():");
            log.info("-------------------------------");
            for (Climber climber : repository.findAll()) {
                log.info(climber.toString());
            }
            log.info("");
        };
    }

}
