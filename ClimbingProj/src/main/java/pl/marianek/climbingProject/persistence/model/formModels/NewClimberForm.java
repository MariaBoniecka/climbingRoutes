package pl.marianek.climbingProject.persistence.model.formModels;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class NewClimberForm {

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]{4,50}")
    private String firstName;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]{4,50}")
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]{2}")
    private String country;
}
