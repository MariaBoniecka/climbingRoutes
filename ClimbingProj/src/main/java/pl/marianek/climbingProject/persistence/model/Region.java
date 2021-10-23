package pl.marianek.climbingProject.persistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Region {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long regionId;

    @Column
    String name;

    @Column(length=2, nullable = false)
    String country;

}
