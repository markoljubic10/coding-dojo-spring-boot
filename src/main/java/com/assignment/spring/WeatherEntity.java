package com.assignment.spring;

import javax.persistence.*;
import lombok.Data;


@Entity
@Table(name = "weather")
@Data
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String city;

    private String country;
    
    private Double temperature;
    
    private Double maxtemp;
    
}
