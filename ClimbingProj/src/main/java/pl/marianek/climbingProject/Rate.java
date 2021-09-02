package pl.marianek.climbingProject;

public enum Rate {
    UNKNOWN("Unknown"),
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
