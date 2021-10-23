package pl.marianek.climbingProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.marianek.climbingProject.persistence.model.Climber;
import pl.marianek.climbingProject.persistence.repository.ClimberRepository;

import java.sql.SQLException;
import java.util.stream.Collectors;


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
            repository.findAll()
                    .stream()
                    .filter(Climber::isFromPoland)
                    .filter(Climber::isOlderThan50)
                    .map(c -> c.getClimberFirstName() + "_" + c.getClimberLastName())
                    .collect(Collectors.toList())
                    .forEach(c -> log.info(c));
            log.info("");
        };
    }

}
