package com.jedi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    private double temp;
    private int pressure;
    private int humidiity;
    private double temp_min;
    private double temp_max;
}
