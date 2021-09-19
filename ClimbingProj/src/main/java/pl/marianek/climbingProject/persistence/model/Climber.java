package pl.marianek.climbingProject.persistence.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;

import java.time.LocalDateTime;

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
    private LocalDateTime dateOfBirth;

    @Column(name="CLIMBER_COUNTRY", length=2, nullable=false)
    @Length(min = 2, max = 2)
    private String climberCountryCode;

    @Override
    public String toString() {
        return String.format(
                "Climber:%d, %s, %s, %s, %s",
                climberId, climberFirstName, climberLastName, climberCountryCode, dateOfBirth);
    }

}
