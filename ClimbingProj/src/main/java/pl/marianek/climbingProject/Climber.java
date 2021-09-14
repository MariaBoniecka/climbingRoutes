package pl.marianek.climbingProject;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;

import java.util.Date;

@Getter @Setter
@Entity
public class Climber {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long climberId;

    @Column(length=50, nullable=false)
    private String climberFirstName;

    @Column(length=50, nullable=false)
    private String climberLastName;

    @Column(name="CLIMBER_BIRTH", nullable=false)
    private Date dateOfBirth;

    @Column(name="CLIMBER_COUNTRY", length=2, nullable=false)
    @Length(min = 2, max = 2)
    private String climberCountryCode;

}
