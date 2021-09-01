package pl.marianek.climbingProject;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
public class Route {
    public enum Rate {
        IV("IV"),
        IV_P("IV+"),
        V_M("V-"),
        V("V"),
        V_P("V+"),
        VI_M("VI-"),
        VI("VI"),
        VI_P("VI+"),
        VI_1("VI.1"),
        VI_1_P("VI.1+");

        public final String label;

        private Rate(String label) {
            this.label = label;
        }
    }
    private String name;
    private String region;
    private String wall;
    private Rate rate;
    private String firstAscent;
    private int year;
}
