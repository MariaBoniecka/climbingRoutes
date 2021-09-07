package pl.marianek.climbingProject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@IdClass(RouteId.class)
public class Route {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Id
    @Column(length=50, nullable=false, unique=true)
    private String routeName;

    @Column(name="ROUTE_REGION", length=50, nullable=false)
    private String region;

    @Column(name="WALL_NAME", length=50, nullable=false)
    private String wall;

    @Enumerated(EnumType.STRING)
    @Column(name="RATE")
    private Rate rate;

    @Column(name="FIRST_ASCENT_NAME", columnDefinition = "varchar(50) default 'Maria Boniecka'")
    private String firstAscent;

    @Column(name="CREATION_YEAR")
    private int year;


}
