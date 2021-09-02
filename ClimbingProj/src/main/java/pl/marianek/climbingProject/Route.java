package pl.marianek.climbingProject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Route {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    private String region;

    private String wall;

    @Enumerated(EnumType.STRING)
    private Rate rate;

    private String firstAscent;

    private int year;


}
