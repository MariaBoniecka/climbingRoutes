package pl.marianek.climbingProject.persistence.model.formModels;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class NewRouteForm {

    @NotEmpty
    private String routeName;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]{2,50}")
    private String region;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]{2}")
    private String wallName;

    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]{2}")
    private String rate;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]{2,50}")
    private String firstAscent;

    @Pattern(regexp = "[0-9 ]{4}")
    private String year;
}
