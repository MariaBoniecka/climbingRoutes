package pl.marianek.climbingProject.persistence.model.formModels;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class NewRegionForm {

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]{4,50}")
    private String name;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]{2}")
    private String country;
}
