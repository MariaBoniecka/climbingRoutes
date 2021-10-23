package pl.marianek.climbingProject.persistence.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Wall {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long wallId;

    @Column(nullable = false)
    private String wallName;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Region.class)
    @JoinColumn(name="region_id", nullable = false)
    private Region region;
}
