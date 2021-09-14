package pl.marianek.climbingProject;

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

    @Column(length=50, nullable = false)
    @Length(min = 2, max = 50)
    private String wallName;

    @Column(length=2, nullable = false)
    private String countryCode;

}
