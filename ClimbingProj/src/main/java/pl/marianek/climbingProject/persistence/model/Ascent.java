package pl.marianek.climbingProject.persistence.model;

import lombok.Getter;
import lombok.Setter;
import pl.marianek.climbingProject.Style;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@Entity
public class Ascent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ascentId;

    @ManyToOne
    @JoinColumn(name="climber_id", nullable = false)
    private Climber climber;

    @ManyToOne
    @JoinColumn(name="route_id", nullable = false)
    private Route route;

    @Column
    private Style style;

    @Column
    private Date dateOfAscent;
}
