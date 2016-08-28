package com.ansa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    private Long id;

    private double longitude;
    private double latitude;

    private String county;
    private String city;
    private String street;
    private String building;

}
