package pl.marianek.climbingProject.persistence.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import pl.marianek.climbingProject.Rate;
import pl.marianek.climbingProject.RouteId;

import javax.persistence.*;


@Getter @Setter
@Entity
@IdClass(RouteId.class)
public class Route {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long routeId;

    @Id
    @Column(length=50, nullable=false, unique=true)
    private String routeName;

    @Column(name="ROUTE_REGION", length=50, nullable=false)
    @Length(min = 2, max = 50)
    private String region;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Wall.class)
    @JoinColumn(name="wall_id", nullable = false)
    private Wall wall;

    @Enumerated(EnumType.STRING)
    @Column(name="RATE")
    private Rate rate;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Climber.class)
    @JoinColumn(name = "climber_id", nullable = false)
    private Climber firstAscent;

    @Column(name="CREATION_YEAR")
    private int year;


}
