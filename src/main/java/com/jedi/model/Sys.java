package com.jedi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {
    private int type;
    private int id;
    private double message;
    private String country;
    private Long lat;
    private Long lon;
}
